package com.example.health;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dait_and_Fitness extends AppCompatActivity {
    private TextView textDiet, salad;
    private TextView textFitness;
    private LinearLayout dietLayout;
    private LinearLayout fitnessLayout;
    ListView lvDiet;
    String[] array= {"salad", "fruits", "vegetables"} ;
    // change 1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dait_and_fitness);


        textDiet = findViewById(R.id.diet);
        textFitness = findViewById(R.id.fitness);
        dietLayout = findViewById(R.id.dietLayout);
        fitnessLayout = findViewById(R.id.fitnessLayout);
        salad= findViewById(R.id.salad);
        lvDiet= findViewById(R.id.lvDiet);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);
        lvDiet.setAdapter(arrayAdapter);
        salad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Dait_and_Fitness.this, "salad selected", Toast.LENGTH_SHORT).show();
            }
        });

        // Set click listeners for the custom radio buttons
        textDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectDiet();
            }
        });

        textFitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFitness();
            }
        });

    }

    private void selectDiet() {
        // Show diet layout and hide fitness layout
        dietLayout.setVisibility(View.VISIBLE);
        fitnessLayout.setVisibility(View.GONE);
        // Change background color to indicate selection
}

    private void selectFitness() {
        // Show fitness layout and hide diet layout
        fitnessLayout.setVisibility(View.VISIBLE);
        dietLayout.setVisibility(View.GONE);
        // Change background color to indicate selection
 }
    }
