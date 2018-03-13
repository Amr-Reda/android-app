package com.example.amr.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class doctor extends AppCompatActivity  implements View.OnClickListener{
    EditText editText1;
    EditText editText2;
    Button btn1;
    TextView text ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        editText1 =findViewById(R.id.edit1);
        editText2 =findViewById(R.id.edit2);
        btn1 =findViewById(R.id.button1);
        text = findViewById(R.id.sign_up);

        btn1.setOnClickListener(this);
        text.setOnClickListener(this);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String edit1 = editText1.getText().toString();
//                String edit2 = editText2.getText().toString();
//
////                Toast.makeText(MainActivity.this, var , Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(doctor.this ,Main22Activity.class);
//                intent.putExtra("var1" , edit1);
//                intent.putExtra("var2" , edit2);
//                startActivity(intent);
//            }
//        });


    }


    public void click(View view) {

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button1:
                Intent i = new Intent(doctor.this , Main22Activity.class);
                startActivity(i);
                break;

            case R.id.sign_up:
                Toast.makeText(doctor.this , R.string.MyName , Toast.LENGTH_LONG).show();
                break;


        }
    }
}
