package com.example.co_vote.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


import com.example.co_vote.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SignUpActivity extends AppCompatActivity {

    private CircleImageView userProfile;
    private EditText userName,userPassword,userEmail,userID;
    private Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        findViewById(R.id.have_acc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userProfile=findViewById(R.id.profile_image);
                userName=findViewById(R.id.user_name);
                userPassword=findViewById(R.id.user_password);
                userEmail=findViewById(R.id.user_email);
                userID=findViewById(R.id.user_id);
                signUpBtn=findViewById(R.id.signup_btn);

                userProfile.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M)
                        {
                            if(ContextCompat.checkSelfPermission(SignUpActivity.this,
                                    Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED) {
                                ActivityCompat.requestPermissions(SignUpActivity.this,
                                        new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE}, 1);

                            }
                        else
                        {
                        }
                    }
                });
            }
        });
    }
}