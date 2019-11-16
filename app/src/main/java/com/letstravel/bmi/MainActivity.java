package com.letstravel.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.letstravel.bmi.BMI.BMI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private TextView  textView4, textView5;
private EditText editText1,editText2;
private Button button1;
int weight; float height, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView4=(TextView)findViewById(R.id.textview4);
        textView5=(TextView)findViewById(R.id.textview5);

        editText1=(EditText)findViewById(R.id.edittext1);
        editText2=(EditText)findViewById(R.id.edittext2);

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        weight=Integer.parseInt(editText1.getText().toString());
        height=Float.parseFloat(editText2.getText().toString());
        switch (view.getId()){
            case R.id.button1:
                if(button1.isClickable()){
                    BMI bmi=new BMI(weight,height);
                    result=bmi.BMI();
                    if(result<16) {
                        textView4.setText(Float.toString(result));
                        textView5.setText("Seven");
                    }
                    else if(result>=16 && result<17){
                        textView4.setText(Float.toString(result));
                        textView5.setText("Medium");
                    }
                    else if(result>=17 && result<18.5){
                        textView4.setText(Float.toString(result));
                        textView5.setText("Mid");
                    }
                    else if(result>=18.5 && result<25){
                        textView4.setText(Float.toString(result));
                        textView5.setText("Normal");
                    }
                    else if(result>=25 && result<30){
                        textView4.setText(Float.toString(result));
                        textView5.setText("OverWeight");
                    }
                    else{
                        textView4.setText(Float.toString(result));
                        textView5.setText("Abase class");
                    }
                }
        }

    }
}
