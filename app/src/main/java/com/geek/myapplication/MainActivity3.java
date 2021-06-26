package com.geek.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.geek.myapplication.databinding.ActivityMain3Binding;
import com.geek.myapplication.databinding.ActivityMainBinding;

import java.lang.invoke.LambdaConversionException;

public class MainActivity3 extends AppCompatActivity {
    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.changeBv.setOnClickListener(v -> {
            String result_text = binding.editText3.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("key", result_text);
            setResult(RESULT_OK, intent);
            finish();
        });
    }

}