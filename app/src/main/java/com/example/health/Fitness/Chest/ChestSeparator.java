package com.example.health.Fitness.Chest;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.health.R;

public class ChestSeparator extends AppCompatActivity {
    TextView chesttext, titlechest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chest_separator);
        chesttext= findViewById(R.id.chesttext);
        titlechest= findViewById(R.id.titlechest);

        String chest1= getIntent().getStringExtra("one");

        String one = getString(R.string.chest1);
        String two = getString(R.string.chest2);
        String three = getString(R.string.chest3);
        String four = getString(R.string.chest4);
        String five = getString(R.string.chest5);
        ImageView absImage= findViewById(R.id.chestimage);


        if (chest1.equals("Regular Push-ups")){
            titlechest.setText("Regular Push-Ups");
            absImage.setImageResource(R.drawable.chest11);
            chesttext.setText("\n "+one);
        } else if (chest1.equals("Decline Push-ups")) {
            titlechest.setText("Decline Push-Ups");

            absImage.setImageResource(R.drawable.chest2);
            chesttext.setText("\n "+two);
        } else if (chest1.equals("Incline Push-ups")) {
            titlechest.setText("Incline Push-Ups");

            absImage.setImageResource(R.drawable.chest3);
            chesttext.setText("\n "+three);
        } else if (chest1.equals("Offset Push-ups")) {
            titlechest.setText("Offset Push-Ups");
            absImage.setImageResource(R.drawable.chest4);
            chesttext.setText("\n "+four);
        } else if (chest1.equals("One-Leg Push-ups")) {
            titlechest.setText("One-Leg Push-Ups");
            absImage.setImageResource(R.drawable.chest5);
            chesttext.setText("\n "+five);
        }

    }
}