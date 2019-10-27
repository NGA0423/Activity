package com.nga.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.button7)
    void jump(){
        startActivity(new Intent(MyActivity3.this,MyActivity7.class));
    }
}
