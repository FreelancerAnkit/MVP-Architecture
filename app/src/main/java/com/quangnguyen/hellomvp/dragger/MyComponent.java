package com.quangnguyen.hellomvp.dragger;

import com.quangnguyen.hellomvp.calculator.Presentor_Calculator;
import com.quangnguyen.hellomvp.utils.SharedPreference;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SharedPreference.class})
public interface MyComponent {
    void inject(Presentor_Calculator calculator);
}

