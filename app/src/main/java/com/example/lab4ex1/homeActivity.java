package com.example.lab4ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void login(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
    public void Register(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }
}