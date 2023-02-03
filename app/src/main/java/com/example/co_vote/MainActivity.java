package com.example.co_vote;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.example.co_vote.activities.LoginActivity;

public class MainActivity extends AppCompatActivity {
Handler  handler;
ImageView image;
Runnable runnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=findViewById(R.id.image);
        image.animate().alpha(1).setDuration(0);



handler=new  Handler();
handler.postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent dsp =new Intent(MainActivity.this, LoginActivity.class);
        startActivity(dsp);
        finish();

    }
},5000);


    }
}