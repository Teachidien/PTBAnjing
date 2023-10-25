package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void gilangkeren(View view) {
        Intent intent = new Intent(this,gambar2.class);
        startActivity(intent);

    }
    public void gilang1(View view) {
        Intent intent = new Intent(this,Gambar3Activity.class);
        startActivity(intent);

    }
    public void gilang3(View view) {
        Intent intent = new Intent(this,gambar4.class);
        startActivity(intent);

    }
    public void gilang2(View view) {
        Intent intent = new Intent(this,gambar5.class);
        startActivity(intent);

    }


}