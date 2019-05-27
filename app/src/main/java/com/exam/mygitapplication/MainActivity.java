package com.exam.mygitapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public enum Signal {
        GREEN, YELLOW, RED
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Signal color = Signal.RED;
        //switch用法1.6之后
        switch (color) {
            case RED:
                color=Signal.GREEN;
                break;
            case GREEN:
                break;
            case YELLOW:
                break;
        }
    }
}
