package com.example.sampleandroidmultithreading;

import android.util.Log;

public class SimpleRunnable implements Runnable {
    private static final String TAG = "SimpleRunnable";

    @Override
    public void run() {
        Log.i(TAG, "run: Thread id = " + Thread.currentThread().getId() + "  name = " + Thread.currentThread().getName());
    }
}
