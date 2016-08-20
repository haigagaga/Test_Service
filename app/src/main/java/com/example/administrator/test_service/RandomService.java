package com.example.administrator.test_service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/8/20.
 */

public class RandomService extends Service{


    //重写onBind（） ——必须的
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    //重写onCreat() ——非必须，一般都重写，在其中完成初始化工作，也可以完成全部工作
    @Override
    public void onCreate() {
        super.onCreate();
    }


    //重写onStartCommand（） ——非必须   在其中完成Service应该完成的工作
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.d("ant","运行到onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    //重写onDestroy() —— 非必须，一般都重写，在其中释放资源
   @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
