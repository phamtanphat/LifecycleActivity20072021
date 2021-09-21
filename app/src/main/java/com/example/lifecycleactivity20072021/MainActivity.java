package com.example.lifecycleactivity20072021;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final String TAG = "MainActivity";
    Button mBtnIntent;
    String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");

        if (savedInstanceState != null){
            data = savedInstanceState.getString("Data");
            Log.d(TAG,data);
        }

        mBtnIntent = findViewById(R.id.buttonNavigateMain2);

        mBtnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent xác định hành cụ thể : explicit
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Data","abc");
    }
}