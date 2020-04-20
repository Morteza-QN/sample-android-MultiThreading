package com.example.sampleandroidmultithreading;

import android.util.Log;

public class SimpleThread extends Thread {
    private static final String TAG = "SimpleThread";

    @Override
    public void run() {
        Log.i(TAG, "run: Thread  id = " + Thread.currentThread().getId() + "  name = " + Thread.currentThread().getName());
    }
}
