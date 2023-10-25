package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_notification:
                // Logika untuk item menu_notification
                return true;
            case R.id.menu_profile:
                // Logika untuk item menu_profile
                return true;
            case R.id.menu_logout:
                // Logika untuk item menu_logout
                return true;
            case R.id.menu_back:
                // Logika untuk item menu_back
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
