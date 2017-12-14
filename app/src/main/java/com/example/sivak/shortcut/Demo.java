package com.example.sivak.shortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Demo extends AppCompatActivity {
    public EditText e1,e2;
    public Button b;
    public TextView t,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        b = (Button) findViewById(R.id.button7);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        t = (TextView) findViewById(R.id.text);
        t2 = (TextView) findViewById(R.id.text2);
        t3 = (TextView) findViewById(R.id.text3);
        t4 = (TextView) findViewById(R.id.text4);
        t5 = (TextView) findViewById(R.id.text5);
        t6 = (TextView) findViewById(R.id.text6);
        t7 = (TextView) findViewById(R.id.text7);
        t8 = (TextView) findViewById(R.id.text8);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    int n1 = Integer.parseInt(e1.getText().toString());
                    int n2 = Integer.parseInt(e2.getText().toString());
                    int a1,a2,b1,b2,c,d,e,k;
                    a1 = n1/10;  //Quotient
                    a2 = n1%10;  //Reminder
                    b1 = n2/10;  //Quotient
                    b2 = n2%10;  //Reminder
                    t.setText("" + a1);
                    t2.setText("" + b1);
                    t3.setText("" + a2);
                    t4.setText("" + b2);
                    c = a2*b2;
                    d = ((a1*b2)+(b1*a2));
                    e = a1*b1;
                    t5.setText("" + c);
                    t6.setText("" + d);
                    t7.setText("" + e);
                    k = n1*n2;
                    t8.setText("" + k);
                }
                catch (Exception e)
                {

                    Toast.makeText(getApplicationContext(),"Fields cannot be empty",Toast.LENGTH_SHORT).show();
                }
            }
        });
        }
        }
