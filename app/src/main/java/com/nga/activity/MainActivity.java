package com.nga.activity;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button1)
    void jump1(){
        startActivity(new Intent(MainActivity.this,Activity.class));
    }
    @OnClick(R.id.button2)
    void jump2(){
        startActivity(new Intent(MainActivity.this,Activity2.class));
    }

    @OnClick(R.id.button3)
    void jump3(){
        startActivity(new Intent(MainActivity.this,MyActivity3.class));
    }
}

