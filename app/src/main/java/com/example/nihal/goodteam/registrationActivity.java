package com.example.nihal.goodteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class registrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void OnClick3(View view) {
        Toast.makeText(registrationActivity.this, "Done", Toast.LENGTH_SHORT).show();
    }
}
