package com.geek.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextPassword;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.login);
        editTextPassword = findViewById(R.id.password_toggle);
        register = findViewById(R.id.tvReviews);


    }

    public void onClick(View view) {
        String name = editTextName.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        if (name.equals("n") && password.equals("p")) {
            Intent intent = new Intent(this, SecondActivity.class);
//            intent.putExtra("name", name);
//            intent.putExtra("password", password);
            startActivity(intent);
        } else {
            Toast.makeText(this, R.string.warning_fil_fields, Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickText(View view) {
        if (register != null) {
            // register.setMovementMethod(onClickText().getInstance());
            String urlString = "https://www.instagram.com/accounts/emailsignup/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
            startActivity(intent);
        }

    }
}