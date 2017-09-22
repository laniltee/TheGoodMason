package com.css23.vmarala.thegoodmason;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivityBasic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_basic);
        getSupportActionBar().hide();
    }
}
