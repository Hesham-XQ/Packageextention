package com.example.android.packageextention;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText password;
Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      password = (EditText) findViewById(R.id.editText2);
      but = (Button) findViewById(R.id.button);

        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                    if(password.getText().toString().equals("xxxq")){
                        Intent myIntent = new Intent(MainActivity.this,
                                ext.class);
                        startActivity(myIntent);

                    }else{
                        //wrong password
                        Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                    }
                    // Start NewActivity.class

            }
        });


    }}




















/*
    public void login(View view) {
        if (password.getText().toString().equals("xxxq")) {

            Intent start = new Intent(MainActivity.this, ext.class);
            startActivity(start);
            //correcct password
        } else {
            //wrong password

        }*/
        /*
    public void login (View V){

        Intent start = new Intent(MainActivity.this, ext.class);
        startActivity(start);

    } */
