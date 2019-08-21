package com.example.practico01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
if(ContextCompat.checkSelfPermission(this, Manifest.permission.RECEIVE_SMS)!= PackageManager.PERMISSION_GRANTED)
{
    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECEIVE_SMS},0);
}


}
private SmsReceiver sms;
@Override
    protected void onResume()
{
    this.sms= new SmsReceiver();
    registerReceiver(this.sms, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
    super.onResume();
}
@Override
    protected void onPause()
{
    unregisterReceiver(sms);
    super.onPause();
}
}