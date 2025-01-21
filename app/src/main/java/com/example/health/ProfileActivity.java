package com.example.health;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.health.Database.DatabaseHelper;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {
    TextView profileview, profileibmview;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        profileview = findViewById(R.id.profileview);
        profileibmview = findViewById(R.id.profileibmview);

        // Initialize the database
        String dbName = "Health_officer5";
        int dbVersion = 1;
        databaseHelper= new DatabaseHelper(ProfileActivity.this,dbName, null, dbVersion );


        databaseHelper = new DatabaseHelper(this, "Health_officer5", null, 1);
        String result= databaseHelper.getUser().toString();
       profileview.setText(result);databaseHelper = new DatabaseHelper(this, "Health_officer51", null, 1);
        String result1= databaseHelper.getBmi().toString();
       profileibmview.setText(result1);

    }
}