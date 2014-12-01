package com.qiao.callbacklast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu.CanvasTransformer;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.qiao.callbacklast.FragmentLeft.CallBack;

import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class WoQuActivity extends SlidingFragmentActivity implements OnClickListener,CallBack{
	private static final String TAG="WoQuActivity";
	private SlidingMenu sm = null;
	private CanvasTransformer mTransformer;  
	
	 private Button button_main_open_left;
	   private Button button_main_open_right;
	   private TextView textView_main;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wo_qu);
		
		button_main_open_left = (Button) findViewById(R.id.button_main_open_left);
        button_main_open_right = (Button) findViewById(R.id.button_main_open_right);
        textView_main = (TextView) findViewById(R.id.textView_main);
        button_main_open_left.setOnClickListener(this);
        button_main_open_right.setOnClickListener(this);
		setBehindContentView(R.layout.left);
		getSupportFragmentManager().beginTransaction().replace(R.id.left_fram, new FragmentLeft()).commit();
		mTransformer = new CanvasTransformer() {
			
			@Override
			public void transformCanvas(Canvas canvas, float percentOpen) {
//				float scale = (float) (percentOpen*0.25 + 0.75); 
				float scale = (float) (1 - percentOpen * 0.25);
                canvas.scale(scale, scale, canvas.getWidth()/2, canvas.getHeight()/2);              
			}
		};
		sm = getSlidingMenu();
        sm.setSecondaryMenu(R.layout.right);
        getSupportFragmentManager().beginTransaction().replace(R.id.right_fram, new FragmentRight()).commit();
        sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        sm.setFadeEnabled(false);
        sm.setBehindScrollScale(0.25f);
        sm.setFadeDegree(0.75f);
        sm.setMode(SlidingMenu.LEFT_RIGHT);
//        sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        sm.setBackgroundImage(R.drawable.ic_launcher);
        sm.setBehindWidth((int)(getWindowManager().getDefaultDisplay().getWidth() / 1.5));
//        sm.setBehindCanvasTransformer(mTransformer);
        sm.setAboveCanvasTransformer(mTransformer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wo_qu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button_main_open_left:
			setToggle();
			break;
		case R.id.button_main_open_right:
			sm.showSecondaryMenu();
			break;

		default:
			break;
		}
	}

	
	public void setToggle(){
		toggle();
	}

//	@Override
	public void getString(String text) {
		// TODO Auto-generated method stub
		Log.i(TAG, "==-->text:="+text);
	}


}
