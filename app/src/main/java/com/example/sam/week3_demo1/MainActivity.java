package com.example.sam.week3_demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("ACTIVITY 1 TAG", "OnCreate method is invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ACTIVITY 1 TAG", "onStart method is invoked");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ACTIVITY 1 TAG", "onResume method is invoked");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ACTIVITY 1 TAG", "onPause method is invoked");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ACTIVITY 1 TAG", "onStop method is invoked");

    }

    public void mOnClick(View view) {

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}