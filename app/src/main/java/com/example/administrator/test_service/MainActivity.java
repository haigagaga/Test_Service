 package com.example.administrator.test_service;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     //显式启动service
    public void display(View view){
        final Intent serviceIntent = new Intent(this,RandomService.class);
        startService(serviceIntent);
        Toast.makeText(this, "显示启动了startService", Toast.LENGTH_SHORT).show();

    }

     //隐式启动service 需要声明Intent-filter的action属性
     public void undisplay(View view){
         final Intent serviceIntent = new Intent();
         serviceIntent.setAction("com.example.administrator.test_service");
         Toast.makeText(this, "隐式启动了startService", Toast.LENGTH_SHORT).show();

     }

     public void onbindService(View view){
         final Intent serviceIntent = new Intent(this,BindService.class);
//         bindService(serviceIntent,serviceConnection, Context.BIND_AUTO_CREATE);
     }

//    //停止服务
//     @Override
//     protected void onDestroy() {
//         super.onDestroy();
//         final Intent serviceIntent = new Intent(this,RandomService.class);
//         stopService(serviceIntent);
//     }
 }
