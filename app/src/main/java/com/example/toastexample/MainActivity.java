package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toast.ToastActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastActivity.s(getApplicationContext(),"Hi Hello");
    }
}