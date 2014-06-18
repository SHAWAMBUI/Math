package com.example.math;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class Homescreen extends ActionBarActivity implements OnClickListener {
	//declaring of variables
			EditText etnumber_one,etnumber_two,etresult ;
			Button btnadd ,btnsubtract ,btndivision,btnmultiply;
			

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		//initialization of variables
		etnumber_one =(EditText)findViewById(R.id.etNumberone);
		etnumber_two=(EditText)findViewById(R.id.etnumber_two);
		etresult=(EditText)findViewById(R.id.etresult);
		
		btnadd=(Button)findViewById(R.id.btnadd);
		btnadd.setOnClickListener(this);
		btnsubtract=(Button)findViewById(R.id.btnsubtract);
		btnsubtract.setOnClickListener(this);
		btndivision=(Button)findViewById(R.id.btndivision);
		btndivision.setOnClickListener(this);
		btnmultiply=(Button)findViewById(R.id.btnmultiply);
		btnmultiply.setOnClickListener(this);
	}
	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.btnadd:
			break;
		case R.id.btnsubtract:
			break;
		case R.id.btndivision:
			break;
		case R.id.btnmultiply:
			default:
			break;
		}
	}
		
		
		
		
		
		
		
		
		
		
		
	}


