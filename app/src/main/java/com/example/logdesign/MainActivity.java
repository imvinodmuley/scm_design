package com.example.logdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void registration(View view)
    {
        this.finish();
        Intent i=new Intent(this,registration.class);
        startActivity(i);
    }
    public void dashboard(View view)
    {
        this.finish();
        Intent i=new Intent(this,dashboard.class);
        startActivity(i);
    }

}