package com.example.myapplication.ui.notifications;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RatingBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Donate extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donate);
    }

    public void close(View view){finish();}
}
