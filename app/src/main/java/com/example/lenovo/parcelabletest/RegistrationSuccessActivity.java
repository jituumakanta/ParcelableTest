package com.example.lenovo.parcelabletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class RegistrationSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_success);

        RegistrationPogo registrationPogo= getIntent().getParcelableExtra("data");
        String ss=registrationPogo.firstName;
        Log.d("MYLOG", "RegistrationSuccessActivity: "+"onCreate: "+"ss: "+ss);

    }
}
