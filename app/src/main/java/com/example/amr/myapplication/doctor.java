package com.example.amr.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
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
    TextView text  , browser , openDialog;

    Dialog dialog;
    EditText enterData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        editText1 =findViewById(R.id.edit1);
        editText2 =findViewById(R.id.edit2);
        btn1 =findViewById(R.id.button1);
        text = findViewById(R.id.sign_up);
        browser = findViewById(R.id.text_signup);
        openDialog = findViewById(R.id.donot_have_account);

        btn1.setOnClickListener(this);
        text.setOnClickListener(this);
        browser.setOnClickListener(this);
        openDialog.setOnClickListener(this);
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

            case R.id.text_signup:
//                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://stackoverflow.com/"));
                Intent in = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:342323525"));
                startActivity(in);
                break;

            case R.id.donot_have_account:
                 dialog = new Dialog(doctor.this);
                dialog.setContentView(R.layout.layout_dialog);
                dialog.setCancelable(false);
                Button ok = dialog.findViewById(R.id.ok);
                Button cancel = dialog.findViewById(R.id.cancel);
                 enterData = dialog.findViewById(R.id.enter_data);
                ok.setOnClickListener(this);
                cancel.setOnClickListener(this);
                dialog.show();
                break;


            case R.id.ok:
                Toast.makeText(doctor.this , enterData.getText().toString(), Toast.LENGTH_LONG).show();
                dialog.dismiss();
                break;

            case R.id.cancel:
                dialog.dismiss();
                AlertDialog.Builder alert = new AlertDialog.Builder(doctor.this);
                alert.setTitle("Title");
                alert.setMessage("Msg");
                alert.setCancelable(false);
                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(doctor.this , "Ok" , Toast.LENGTH_LONG).show();
                    }
                });

                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(doctor.this , "Cancel" , Toast.LENGTH_LONG).show();

                    }
                });

                alert.setNeutralButton("Dec", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(doctor.this , "Description" , Toast.LENGTH_LONG).show();

                    }
                });

                alert.show();
                break;

        }
    }
}
