package com.example.androidservices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mStartService, mStopService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inti method call
        init();
    }

    //init method definition
    private void init() {
        mStartService = findViewById(R.id.start_service);
        mStopService = findViewById(R.id.stop_service);

        mStartService.setOnClickListener(this);
        mStopService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start_service:
                Toast.makeText(this, "start service button clicked", Toast.LENGTH_SHORT).show();

                case R.id.stop_service:
                Toast.makeText(this, "stop service button clicked", Toast.LENGTH_SHORT).show();

        }
    }
}
