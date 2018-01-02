package com.mobiledev.skydev.widgetcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CheckBox cb1, cb2,cb3,cb4,cb5,cb6;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (CheckBox)findViewById(R.id.cb1);
        cb2 = (CheckBox)findViewById(R.id.cb2);
        cb3 = (CheckBox)findViewById(R.id.cb3);
        cb4 = (CheckBox)findViewById(R.id.cb4);
        cb5 = (CheckBox)findViewById(R.id.cb5);
        cb6 = (CheckBox)findViewById(R.id.cb6);

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener((android.view.View.OnClickListener) this);
            /*SET*/
    }

    @Override
    public void onClick(View view) {

        String a="";
        if(cb1.isChecked()){
            a+="Bahasa Java\n";

        }
        if(cb2.isChecked()){
            a+="Bahasa PHP\n";

        }
        if(cb3.isChecked()){
            a+="Bahasa C++\n";

        }
        if(cb4.isChecked()){
            a+="Bahasa Actionscript\n";
        }
        if(cb5.isChecked()){
            a+="Bahasa Phyton\n";
        }
        if(cb6.isChecked()){
            a+="Bahasa Javascript\n";


        }
        Toast.makeText(this, "Kalian memilih :  \n "+a,
                Toast.LENGTH_SHORT).show();


    }


}

