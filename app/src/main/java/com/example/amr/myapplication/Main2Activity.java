package com.example.amr.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        String retrieveData = getIntent().getStringExtra("var");
        Toast.makeText(Main2Activity.this , retrieveData+" Hello " , Toast.LENGTH_LONG).show();
    }
}
