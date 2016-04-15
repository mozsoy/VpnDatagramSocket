package com.metehan.datagramsocketdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

    Button btn1;
    DatagramTest test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Method to start the service
    public void startService(View view) {
        (new DatagramSocketThread()).start();
        //startService(new Intent(getBaseContext(), DatagramSocketService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        //stopService(new Intent(getBaseContext(), DatagramSocketService.class));
    }
}
