package com.exam.mygitapplication.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.exam.mygitapplication.myapp.MyApplication;

/**
 * Created by YuShuangPing on 2019/3/8.
 */
public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
        //设置字体
        setTypeface(MyApplication.getInstance().getTypeface());
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //设置字体
        setTypeface(MyApplication.getInstance().getTypeface());
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //设置字体
        setTypeface(MyApplication.getInstance().getTypeface());
    }
}
