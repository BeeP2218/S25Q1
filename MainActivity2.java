package com.example.s25q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        t4=(TextView) findViewById(R.id.textView4);

        Intent i=getIntent();
        String res=i.getStringExtra("MESSAGE");
        t1.setText(res);

        String res2=i.getStringExtra("MESSAGE2");
        t2.setText(res2);

        String res3=i.getStringExtra("MESSAGE3");
        t3.setText(res3);

        String res4=i.getStringExtra("MESSAGE4");
        t4.setText(res4);
    }
}