package com.example.lenovo.parcelabletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        final RegistrationPogo registrationPogo = new RegistrationPogo();
        registrationPogo.setFirstName("jitu");
        registrationPogo.setLastName("naak");
        registrationPogo.setPhoneNumber("8908315549");
        registrationPogo.setState("odisha");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationSuccessActivity.class);
                intent.putExtra("data", registrationPogo);
                startActivity(intent);
/// for Parcelable list
                //intent.putParcelableArrayListExtra("data", pacableArray);
            }
        });




    }
}
