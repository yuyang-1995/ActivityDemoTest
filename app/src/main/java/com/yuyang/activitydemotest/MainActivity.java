package com.yuyang.activitydemotest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        tv_1 = findViewById(R.id.tv_1);

        tv_1.setOnClickListener(this);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_1:
                Intent intent = new Intent();
                intent.setAction("com.yuyang.action1");
//                intent.addCategory("com.yuyang.category1");
//                intent.addCategory("com.yuyang.category2");
                 intent.setDataAndType(Uri.parse("file://abc"), "text/plain");
                 startActivity(intent);
                break;

        }
    }
}
