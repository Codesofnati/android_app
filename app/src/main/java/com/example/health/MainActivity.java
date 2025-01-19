package com.example.health;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name, weight, height, age;
    Button btnRegister;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        age = findViewById(R.id.age);
        btnRegister = findViewById(R.id.buttonRegister);

        // Initialize the database
        String dbName = "Health_officer5";
        int dbVersion = 1;
        databaseHelper= new DatabaseHelper(MainActivity.this,dbName, null, dbVersion );

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get values from EditTexts when the button is clicked
                String name1 = name.getText().toString();
                String weight1 = weight.getText().toString();
                String height1 = height.getText().toString();
                String age1 = age.getText().toString();

                // Insert data into the database
                databaseHelper.addName(name1, weight1, height1, Integer.parseInt(age1));

                // Log success
                Log.d("MainActivity", "Data inserted successfully");

                // Start the next activity
                Intent intent = new Intent(MainActivity.this, Home.class);
                intent.putExtra("name", name1);
                intent.putExtra("weight", weight1);
                intent.putExtra("height", height1);
                intent.putExtra("age", age1);
                startActivity(intent);
            }
        });

    }

}
