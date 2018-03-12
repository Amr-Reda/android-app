package com.example.amr.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // TextView name = (TextView)findViewById(R.id.name);

        TextView na = findViewById(R.id.name);
        na.setText("sdbds");
        CharSequence c =  na.getText();

        ImageView img = findViewById(R.id.img);
        img.setImageResource(R.drawable.img1);

        EditText editText =findViewById(R.id.enter_name);
        String var = editText.getText().toString();

    }
}
