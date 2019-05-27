package com.exam.mygitapplication.myapp;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by YuShuangPing on 2019/3/8.
 */
public class MyApplication extends Application {
    private Typeface typeface;
    private  static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance= (MyApplication) getApplicationContext();
        typeface=Typeface.createFromAsset(instance.getAssets(),"fonts/itcblkad.TTF");//下载的字体
    }
    public static MyApplication getInstance(){
        return instance;
    }
    public Typeface getTypeface(){
        return typeface;
    }
    public void setTypeface(Typeface typeface){
        this.typeface=typeface;
    }
}
