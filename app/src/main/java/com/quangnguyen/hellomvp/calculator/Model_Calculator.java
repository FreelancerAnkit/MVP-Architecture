package com.quangnguyen.hellomvp.calculator;

/**
 * Created by 201401 on 28-01-2019.
 */

public class Model_Calculator {
    int a,b;
    public Model_Calculator(int a,int b){
        this.a = a;this.b = b;
    }
    String performAddition(){
        return "Addition: "+(a+b);
    }
}
