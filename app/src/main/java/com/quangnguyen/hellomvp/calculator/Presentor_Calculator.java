package com.quangnguyen.hellomvp.calculator;

import com.quangnguyen.hellomvp.dragger.DaggerMyComponent;
import com.quangnguyen.hellomvp.dragger.MyComponent;
import com.quangnguyen.hellomvp.utils.SharedPreference;

import javax.inject.Inject;

/**
 * Created by 201401 on 28-01-2019.
 */

public class Presentor_Calculator implements CalculatorContract.Interface_Presenter {

    CalculatorContract.Interface_View view;
    Model_Calculator model_calculator;

    //Dragger 2 Injection
    MyComponent component;
    @Inject
    SharedPreference sharedPreference;

    public Presentor_Calculator(CalculatorContract.Interface_View view){
        this.view = view;
        component = DaggerMyComponent.builder().sharedPreference(new SharedPreference(view.getContext())).build();
        component.inject(this);
        view.showResult(sharedPreference.getData("PreviousData"));
    }

    @Override
    public void addition(int a, int b) {
        model_calculator = new Model_Calculator(a,b);
        view.showResult(model_calculator.performAddition());
        sharedPreference.setData("PreviousData",model_calculator.performAddition());
    }

}
