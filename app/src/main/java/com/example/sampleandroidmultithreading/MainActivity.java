package com.example.sampleandroidmultithreading;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,
              " onCreate: Thread  id = " + Thread.currentThread().getId() + " name = " + Thread.currentThread().getName());

        SimpleThread thread1 = new SimpleThread();
        thread1.start();

        Thread thread2 = new Thread(new SimpleRunnable());
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, " run: Thread  id = " + Thread.currentThread().getId() + " name = " +
                           Thread.currentThread().getName());
            }
        });
        thread3.start();


    }
}
