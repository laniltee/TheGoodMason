package com.css23.vmarala.thegoodmason;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        getSupportActionBar().hide();

        //Component creations
        Button loginButton;
        loginButton = (Button) findViewById(R.id.button4);


        //Event Listners
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLoginActivity();
                System.out.println("asdasdasdas");
            }
        });
    }

    private void goToLoginActivity(){
        Intent loginIntent = new Intent(getApplicationContext(), LoginActivityBasic.class);
       startActivity(loginIntent);
    }
}
