package com.quangnguyen.hellomvp.calculator;

import android.content.Context;

/**
 * Created by 201401 on 28-01-2019.
 */

public interface CalculatorContract  {

    interface Interface_View{
         void showResult(String result);
         Context getContext();
    }

    interface Interface_Presenter{
        void addition(int a,int b);
    }
}
