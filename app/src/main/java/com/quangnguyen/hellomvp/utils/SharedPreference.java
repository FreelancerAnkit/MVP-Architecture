package com.quangnguyen.hellomvp.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ankit-SpartaCoder on 11/15/2016.
 */

@Module
public class SharedPreference {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    public SharedPreference(Context context){
        this.context  = context;
    }

    public void setData(String key,String value){
        editor.putString(key, value);
        editor.commit(); // commit changes
    }

    public String getData(String key){
       return pref.getString(key, null);
    }
    public void  clearAll(){
        editor.clear();
        editor.commit(); // commit changes
    }
    public void remove(String key){
        editor.remove(key); // will delete key
        editor.commit(); // commit changes
    }
    public void commit(){
        editor.commit(); // commit changes
    }

    @Singleton
    @Provides
    public Context provideContext() {
        return context;
    }

    @Singleton
    @Provides
    public SharedPreference provideSharedPreferences(Context context) {
        this.context = context;
        pref =  PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        return this;
    }
}
