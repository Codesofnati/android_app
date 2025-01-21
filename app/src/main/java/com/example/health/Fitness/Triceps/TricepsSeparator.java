package com.example.health.Fitness.Triceps;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.health.R;

public class TricepsSeparator extends AppCompatActivity {
    TextView tricepstext, titletriceps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_triceps_separator);
        tricepstext= findViewById(R.id.tricepstext);
        titletriceps= findViewById(R.id.titletriceps);


    String chest1= getIntent().getStringExtra("one");

    String one = getString(R.string.triceps1);
    String two = getString(R.string.triceps2);
    String three = getString(R.string.triceps3);
    String four = getString(R.string.triceps4);
    String five = getString(R.string.triceps5);
    ImageView absImage= findViewById(R.id.tricepsimage);


        if (chest1.equals("Tricep dips")){
        titletriceps.setText("Tricep dips");
        absImage.setImageResource(R.drawable.triceps11);
        tricepstext.setText("\n "+one);
    } else if (chest1.equals("Standing triceps extension")) {
        titletriceps.setText("Standing triceps extension");

        absImage.setImageResource(R.drawable.triceps2);
        tricepstext.setText("\n "+two);
    } else if (chest1.equals("Skull crusher")) {
        titletriceps.setText("Skull crusher");

        absImage.setImageResource(R.drawable.triceps3);
        tricepstext.setText("\n "+three);
    } else if (chest1.equals("Triceps kickback")) {
        titletriceps.setText("Triceps kickback");
        absImage.setImageResource(R.drawable.triceps4);
        tricepstext.setText("\n "+four);
    } else if (chest1.equals("Lateral arm raise")) {
        titletriceps.setText("Lateral arm raise");
        absImage.setImageResource(R.drawable.triceps5);
        tricepstext.setText("\n "+five);
    }

}
}