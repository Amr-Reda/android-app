package com.example.amr.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        String Data1 = getIntent().getStringExtra("var1");
        String Data2 = getIntent().getStringExtra("var2");
        Toast.makeText(Main22Activity.this , "email: "+Data1+"\n"+"password: " +Data2, Toast.LENGTH_LONG).show();
    }
}
