package com.example.calculatorlite;

import android.annotation.SuppressLint;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;



import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double in1 = 0, i2 = 0;
    TextView edittext1;
    boolean Add, Sub, Multiply, Devide, Remaider, deci;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_Add, button_Sub, button_Mul, button_Div, button_Equ, button_Del, button_Dot, button_Remainder;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        button_0 = (Button) findViewById(R.id.btn_zero);
        button_1 = (Button) findViewById(R.id.btn_1);
        button_2 = (Button) findViewById(R.id.btn_2);
        button_3 = (Button) findViewById(R.id.btn_3);
        button_4 = (Button) findViewById(R.id.btn_4);
        button_5 = (Button) findViewById(R.id.btn_5);
        button_6 = (Button) findViewById(R.id.btn_6);
        button_7 = (Button) findViewById(R.id.btn_7);
        button_8 = (Button) findViewById(R.id.btn_8);
        button_9 = (Button) findViewById(R.id.btn_9);
        button_Add = (Button) findViewById(R.id.btn_sum);
        button_Sub = (Button) findViewById(R.id.btn_sub);
        button_Mul = (Button) findViewById(R.id.btn_mul);
        button_Div = (Button) findViewById(R.id.btn_dev);
        button_Equ = (Button) findViewById(R.id.btn_eql);
        button_Del = (Button) findViewById(R.id.btn_del);
        button_Dot = (Button) findViewById(R.id.btn_dot);
        button_Remainder = (Button) findViewById(R.id.btn_mod);


        edittext1 = (TextView) findViewById(R.id.txt_1);

        button_0.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "0"));

        button_1.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "1"));

        button_2.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "2"));

        button_3.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "3"));

        button_4.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "4"));

        button_5.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "5"));

        button_6.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "6"));

        button_7.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "7"));

        button_8.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "8"));

        button_9.setOnClickListener(v -> edittext1.setText(edittext1.getText()+ "9"));



        button_Add.setOnClickListener(v -> {
            if (edittext1.getText().length() !=0){
                in1 =Float.parseFloat(edittext1.getText()+ "");
                Add=true;
                deci = false;
                edittext1.setText(null);

            }
        });

        button_Sub.setOnClickListener(v -> {
            if (edittext1.getText().length() != 0){
                in1 = Float.parseFloat(edittext1.getText()+ "");
                Sub = true;
                deci = false;
                edittext1.setText(null);
            }
        });

        button_Div.setOnClickListener(v -> {
            if (edittext1.getText().length() != 0){
                in1 = Float.parseFloat(edittext1.getText()+ "");
                Devide = true;
                deci = false;
                edittext1.setText(null);
            }
        });

        button_Mul.setOnClickListener(v -> {
            if (edittext1.getText().length() != 0){
                in1 = Float.parseFloat(edittext1.getText()+ "");
                Multiply = true;
                deci = false;
                edittext1.setText(null);
            }
        });

        button_Remainder.setOnClickListener(v -> {
            if (edittext1.getText().length() != 0){
                in1 = Float.parseFloat(edittext1.getText()+ "");
                Remaider = true;
                deci = false;
                edittext1.setText(null);
            }
        });




        button_Equ.setOnClickListener(v -> {
            if(Add || Sub || Multiply || Devide || Remaider){
                i2 = Float.parseFloat(edittext1.getText()+ "");

            }
            if (Add){
                edittext1.setText(in1+i2+"");
                Add = false;
            }
            if(Sub){
                edittext1.setText(in1-i2+ "");
                Sub = false;
            }
            if (Multiply){
                edittext1.setText(in1*i2+ "");
                Multiply = false;
            }
            if (Devide){
                edittext1.setText(in1/i2+ "");
                Devide = false;
            }
            if (Remaider){
                edittext1.setText(in1%i2+"");
                Remaider = false;
            }
        });


        button_Del.setOnClickListener(v -> {
            edittext1.setText("");
            in1 = 0.0;
            i2 = 0.0;
        });

        button_Dot.setOnClickListener(v -> {
            if (deci){

            }
            else {
                edittext1.setText(edittext1.getText()+".");
                deci = true;
            }
        });



    }

}