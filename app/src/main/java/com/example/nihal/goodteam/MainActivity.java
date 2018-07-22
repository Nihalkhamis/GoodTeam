package com.example.nihal.goodteam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
       EditText ID,Name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ID = (EditText) findViewById(R.id.Id);
        Name = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.pass);

    }

    public void OnClick1(View view) {
        //User u = new User();
       // u.setName(ID.getText().toString());
        //u.setId(Name.getText().toString());
        //u.setPassword(password.getText().toString());
        Intent intent = new Intent(this,doneLoginActivity.class);
        //intent.putExtra("user",u);
        startActivity(intent);

    }

    public void OnClick2(View view) {
        Intent intent = new Intent(this,registrationActivity.class);
        startActivity(intent);

    }
}
