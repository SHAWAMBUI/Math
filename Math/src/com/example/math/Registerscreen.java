package com.example.math;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class Registerscreen extends ActionBarActivity implements OnClickListener {
	//Declaration of variables
 EditText etfirstname, etidno,etemail,etpassword;
	
	Button btnsubmit;
	Button btncancel;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		//initialization of variables
		etfirstname	=(EditText) findViewById(R.id.etfirstname);
		etidno =(EditText)findViewById(R.id.etidno);
		etemail=(EditText)findViewById(R.id.etemail);
		etpassword=(EditText)findViewById(R.id.etpassword);
		
		
		
		
		
		btnsubmit = (Button) findViewById(R.id.button2);
		btnsubmit.setOnClickListener(this);
		btncancel = (Button) findViewById(R.id.button1);
		btncancel.setOnClickListener( this);}
		
		

		public void onClick(View v){
			switch (v.getId()) {
			
			case R.id.btnsubmit:
				startActivity(new Intent(getApplicationContext(),Loginscreen.class));
				break;
			case R.id.btncancel:
				startActivity(new Intent(getApplicationContext(),Loginscreen.class));
			default:
				break;
			}
			
			
	}
		
	}
	
	


	
		
	


