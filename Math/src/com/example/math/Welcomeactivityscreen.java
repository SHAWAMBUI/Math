package com.example.math;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;


public class Welcomeactivityscreen extends ActionBarActivity implements OnClickListener {
	//declaring of variable
	Button  btnlogin;
	Button btnregister;
		
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		//initialization variable
		btnlogin = (Button) findViewById(R.id.button1);
		btnlogin.setOnClickListener(this);
		btnregister =(Button)findViewById(R.id.button2);
        btnregister.setOnClickListener(this);
		
	}




	@Override
	public void onClick(View v) {
    switch (v.getId()) {
	case R.id.button1:
		startActivity(new Intent(getApplicationContext(),Loginscreen.class));
		
		break;
	case R.id.button2:
	

	default:
		break;
	}		
		
		
	}

}
