package com.nga.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.button4)
    void jump(){
        startActivity(new Intent(Activity.this,MyActivity4.class));
    }
    @OnClick(R.id.button5)
    void jump2(){
        startActivity(new Intent(Activity.this,MyActivity5.class));
    }
}
