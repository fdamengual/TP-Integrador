package com.example.practico01;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.AsyncTask;

public class Task extends AsyncTask<String, Integer, String> {

    private final BroadcastReceiver.PendingResult pendingResult;
    private final Intent intent;

    Task(BroadcastReceiver.PendingResult pendingResult, Intent intent) {
        this.pendingResult = pendingResult;
        this.intent = intent;
    }

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }
}