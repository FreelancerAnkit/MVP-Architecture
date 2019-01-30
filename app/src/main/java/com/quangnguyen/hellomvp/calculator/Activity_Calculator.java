package com.quangnguyen.hellomvp.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.quangnguyen.hellomvp.R;

public class Activity_Calculator extends AppCompatActivity implements CalculatorContract.Interface_View{

    Presentor_Calculator presentor_calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        presentor_calculator = new Presentor_Calculator(this);

    }

    public void onClickAdd(View view) {
        presentor_calculator.addition(Integer.parseInt(((EditText)findViewById(R.id.ed_no1)).getText().toString()),
                Integer.parseInt(((EditText)findViewById(R.id.ed_no2)).getText().toString()));
    }

    @Override
    public void showResult(String result) {
        ((TextView)findViewById(R.id.tv_result)).setText(result);
    }

    @Override
    public Context getContext() {
        return this;
    }
}
