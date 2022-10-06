package com.example.s25q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        e4=(EditText) findViewById(R.id.editText4);
        b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String res=e1.getText().toString();
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("MESSAGE",res);

                String res2=e2.getText().toString();
                i.putExtra("MESSAGE2",res2);

                String res3=e3.getText().toString();
                i.putExtra("MESSAGE3",res3);

                String res4=e4.getText().toString();
                i.putExtra("MESSAGE4",res4);
                startActivity(i);
            }
        });
    }
}