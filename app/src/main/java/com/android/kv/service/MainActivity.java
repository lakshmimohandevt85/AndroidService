package com.android.kv.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button buttonStart;
    Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MyServices myServices = new MyServices();
        buttonStart = (Button)findViewById(R.id.button_start);
        buttonStart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //myServices.onStartCommand(getIntent());
               startService(new Intent(getBaseContext(),MyServices.class));
            }
        });

        buttonStop = (Button)findViewById(R.id.button_stop);
        buttonStop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                stopService(new Intent(getBaseContext(),MyServices.class));
            }
        });


    }
}
