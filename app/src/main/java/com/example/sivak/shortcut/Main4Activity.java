package com.example.sivak.shortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    public Button b1;
    public EditText e1;
    public TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b1 = (Button) findViewById(R.id.button9);
        e1 = (EditText) findViewById(R.id.text);
        t1 = (TextView) findViewById(R.id.text2);
        t2 = (TextView) findViewById(R.id.text7);
        t3 = (TextView) findViewById(R.id.text11);
        t4 = (TextView) findViewById(R.id.text12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(e1.getText().toString());
                int first,clc,res,last;
                last = n%10;
                if (last == 5){
                first = n/10;
                clc = ((first+1)*first);
                res = n*n;
                t1.setText("" + first);
                t2.setText("" + first);
                t3.setText("" + clc);
                t4.setText("" + res);
            }
            else{
                    Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
