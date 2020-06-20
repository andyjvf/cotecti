package com.cotecti.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void btyoutube(View view) {
        startActivity(new Intent(this, Youtube.class));
    }

    public void compartir(View view) {
        startActivity(new Intent(this, canalyoutube.class));
    }
}