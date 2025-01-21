package com.example.health;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.health.Database.DatabaseHelper;
import com.example.health.Database.DatabaseHelper1;
import com.example.health.Mukera.Dait_and_Fitness;

public class Home extends AppCompatActivity {
    TextView bmiout;
    TextView tv1;
    DatabaseHelper1 databaseHelper1;
    String result;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        String dbName1 = "Health_officer51";
        int dbVersion=1;


         databaseHelper1= new DatabaseHelper1(Home.this,dbName1, null, dbVersion );

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        String name = getIntent().getStringExtra("name");
        String weight = getIntent().getStringExtra("weight");
        String height = getIntent().getStringExtra("height");
        String age = getIntent().getStringExtra("age");
        Double weight1 = Double.parseDouble(weight);
        Double height1 = Double.parseDouble(height);
        Double age1 = Double.parseDouble(age);
        Double bmi = weight1 / (height1 * height1);
        String bmi1 = String.valueOf(bmi);
        String bmi2 = bmi1.substring(0, 4);
        bmiout = findViewById(R.id.bmiout);
        go= findViewById(R.id.go);
        bmiout.setText(bmi2);
        String underweight = getString(R.string.underweight);
        String normal = getString(R.string.healthy_weight_management_guide);
        String obese = getString(R.string.weight_loss_guide);
//        tv1= findViewById(R.id.tv1);
//        databaseHelper = new DatabaseHelper(this, "Health_officer5", null, 1);
//        result= databaseHelper.getUser().toString();
//       tv1.setText(result);
        go.setOnClickListener(view -> {
            Intent intent= new Intent(Home.this, newDandFActivity.class);
            startActivity(intent);
        });


        if (bmi < 18.5) {
            databaseHelper1.addBmi(underweight);
            bmiout.setText("Underweight\n "+underweight);

        } else if (bmi > 18.5 && bmi < 24.9) {

            bmiout.setText("Normal \n"+ normal);
            databaseHelper1.addBmi(normal);

        } else if (bmi > 25 && bmi < 29.9) {

            bmiout.setText("Overweight");
        } else if (bmi > 30) {
            bmiout.setText("Obese \n"+ obese);

            databaseHelper1.addBmi(obese);
        }
    }
}