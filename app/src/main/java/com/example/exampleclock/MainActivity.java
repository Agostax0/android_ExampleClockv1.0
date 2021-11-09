package com.example.exampleclock;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date date = new Date();
        TextView displayDate = findViewById(R.id.TextViewDate);
        displayDate.setText(date.toString());
    }
}