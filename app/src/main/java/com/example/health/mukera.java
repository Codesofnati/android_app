package com.example.health;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mukera extends AppCompatActivity {
    TextView tv1;
    DatabaseHelper databaseHelper;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mukera);
        tv1= findViewById(R.id.tv);
        databaseHelper = new DatabaseHelper(this, "Health_officer5", null, 1);
        result= databaseHelper.getUser().toString();
        tv1.setText(result);

    }
}