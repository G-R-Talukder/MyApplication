package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("I am in","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("I am in","onStart");
    }

    @Override
    protected void onResume() {
        super.onRestart();
        Log.i("I am in","onResume");

    }

    @Override
    protected void onPause() {
        super.onResume();
        Log.i("I am in","onPause");
    }

    @Override
    protected void onRestart() {
        super.onPause();
        Log.i("I am in","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("I am in","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("I am in","onDestroy");
    }
}
