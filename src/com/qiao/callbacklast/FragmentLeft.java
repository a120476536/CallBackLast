package com.qiao.callbacklast;



import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentLeft extends Fragment{
//	private CallBack callBack;
	private WoQuActivity activity;
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);

//		callBack = (CallBack) getActivity();
		this.activity = (WoQuActivity) activity;
		
	}
	/*@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}*/
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragmentleft, null);
		Button textView_left = (Button) view.findViewById(R.id.textView_left);
		textView_left.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				callBack.getString("传递的数据");
				activity.getString("dsfsdf");
				Toast.makeText(activity, "点击左侧textView", Toast.LENGTH_SHORT).show();
			}
		});
		Button textView_left4 = (Button) view.findViewById(R.id.textView_left04);
		textView_left4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				callBack.getString("传递的数据");
				activity.getString("dsfsdf");
				Toast.makeText(activity, "点击左侧textView", Toast.LENGTH_SHORT).show();
			}
		});
		Button textView_left1 = (Button) view.findViewById(R.id.textView_left01);
		textView_left1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				callBack.getString("传递的数据");
				activity.getString("dsfsdf");
				Toast.makeText(activity, "点击左侧textView", Toast.LENGTH_SHORT).show();
			}
		});
		Button textView_left2 = (Button) view.findViewById(R.id.textView_left02);
		textView_left2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				callBack.getString("传递的数据");
				activity.getString("dsfsdf");
				Toast.makeText(activity, "点击左侧textView", Toast.LENGTH_SHORT).show();
			}
		});
		Button textView_left3 = (Button) view.findViewById(R.id.textView_left03);
		textView_left3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				callBack.getString("传递的数据");
				activity.getString("dsfsdf");
				Toast.makeText(activity, "点击左侧textView", Toast.LENGTH_SHORT).show();
			}
		});
		return view;
	}

	
	
//	public interface CallBack {
//		void getString(String text);
//	}
}
