package com.sokah.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //se ejecuta primero
    private EditText username,password;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.userNameInput);
        password = findViewById(R.id.passwordInput);
        loginButton = findViewById(R.id.loginbutton);

        loginButton.setOnClickListener(
                (v)->{

                    String usernameText = username.getText().toString();
                    String passwordText= password.getText().toString();
                    Toast.makeText(this,usernameText +" "+ passwordText,Toast.LENGTH_LONG).show();
                }
        );
    }
}
