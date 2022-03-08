package com.coder178.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview5;
    TextView textview6;
    TextView textview7;
    TextView textview8;
    TextView textview9;
    TextView textview10;
    TextView textview11;
    TextView textview12;
    TextView textview13;
    TextView textview14;

    EditText editTextNumber;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview5 = findViewById(R.id.textView5);
        textview6 = findViewById(R.id.textView6);
        textview7 = findViewById(R.id.textView7);
        textview8 = findViewById(R.id.textView8);
        textview9 = findViewById(R.id.textView9);
        textview10 = findViewById(R.id.textView10);
        textview11 = findViewById(R.id.textView11);
        textview12 = findViewById(R.id.textView12);
        textview13 = findViewById(R.id.textView13);
        textview14 = findViewById(R.id.textView14);
        editTextNumber = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(editTextNumber.getText().toString());

                textview5.setText(n+" * "+1+" = "+n*1);
                textview6.setText(n+" * "+2+" = "+n*2);
                textview7.setText(n+" * "+3+" = "+n*3);
                textview8.setText(n+" * "+4+" = "+n*4);
                textview9.setText(n+" * "+5+" = "+n*5);
                textview10.setText(n+" * "+6+" = "+n*6);
                textview11.setText(n+" * "+7+" = "+n*7);
                textview12.setText(n+" * "+8+" = "+n*8);
                textview13.setText(n+" * "+9+" = "+n*9);
                textview14.setText(n+" * "+10+" = "+n*10);

            }
        });

    }
}