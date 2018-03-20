package com.example.syedmuhammadmoosa.question1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt1,edt2;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.et1);
        edt2 = (EditText) findViewById(R.id.et2);
        txt1 = (TextView) findViewById(R.id.textView);
    }


    public void Onclickplu(View v){
        int a =Integer.parseInt(edt1.getText().toString());
        int b =Integer.parseInt(edt1.getText().toString());
        int c=a+b;
        txt1.setText("c");
    }

    public void Onclicksub(View v){
        int a =Integer.parseInt(edt1.getText().toString());
        int b =Integer.parseInt(edt1.getText().toString());
        int c=a-b;
        txt1.setText("c");
    }

    public void Onclickmul(View v){
        int a =Integer.parseInt(edt1.getText().toString());
        int b =Integer.parseInt(edt1.getText().toString());
        int c=a*b;
        txt1.setText("c");
    }

    public void Onclickdiv(View v){
        int a =Integer.parseInt(edt1.getText().toString());
        int b =Integer.parseInt(edt1.getText().toString());
        int c=a/b;
        txt1.setText("c");
    }

    public void Onclickrem(View v){
        int a =Integer.parseInt(edt1.getText().toString());
        int b =Integer.parseInt(edt1.getText().toString());
        int c=a%b;
        txt1.setText("c");
    }

    public void Onclickcle(View v){
        edt1.setText("0");
        edt2.setText("0");
    }
}
