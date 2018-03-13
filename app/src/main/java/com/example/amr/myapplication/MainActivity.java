package com.example.amr.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // TextView name = (TextView)findViewById(R.id.name);

        TextView na = findViewById(R.id.name);
//        na.setText("sdbds");
        CharSequence c =  na.getText();

//        ImageView img = findViewById(R.id.img);
//        img.setImageResource(R.drawable.img1);

          editText =findViewById(R.id.enter_name);

        Button click = findViewById(R.id.btn);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String var = editText.getText().toString();

//                Toast.makeText(MainActivity.this, var , Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this ,Main2Activity.class);
                intent.putExtra("var" , var);
                startActivity(intent);
                finish();
            }
        });



    }
}
