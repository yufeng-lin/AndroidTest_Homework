package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


/**
一个activity理解成一个页面

 */
public class MainActivity extends AppCompatActivity {

    /**
     *
     * 这个方法当activity第一次启动的时候执行
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载一个页面，页面内容来自activity_main.xml布局
        setContentView(R.layout.activity_main);
    }
}
