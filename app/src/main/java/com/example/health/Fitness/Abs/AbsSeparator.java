package com.example.health.Fitness.Abs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.health.R;

public class AbsSeparator extends AppCompatActivity {
TextView abstext, titleabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abs_separator);

        abstext= findViewById(R.id.abstext);
        titleabs= findViewById(R.id.titleabs);

        String abs1= getIntent().getStringExtra("one");

        String one = getString(R.string.abs1);
        String two = getString(R.string.abs2);
        String three = getString(R.string.abs3);
        String four = getString(R.string.abs4);
        String five = getString(R.string.abs5);
        ImageView absImage= findViewById(R.id.absimage);


        if (abs1.equals("Ab Wheel Rollout")){
            titleabs.setText("Ab Wheel Rollout");
            absImage.setImageResource(R.drawable.abs11);
            abstext.setText("\n "+one);
        } else if (abs1.equals("Medicine Ball Slam")) {
            titleabs.setText("Medicine Ball Slam");

            absImage.setImageResource(R.drawable.abs2);
            abstext.setText("\n "+two);
        } else if (abs1.equals("Three-Point Plank")) {
            titleabs.setText("Three-Point Plank");

            absImage.setImageResource(R.drawable.abs3);
            abstext.setText("\n "+three);
        } else if (abs1.equals("Windshield Wipers")) {
            titleabs.setText("Windshield Wipers");
            absImage.setImageResource(R.drawable.abs4);
            abstext.setText("\n "+four);
        } else if (abs1.equals("Reverse Crunches")) {
            titleabs.setText("Reverse Crunches");
            absImage.setImageResource(R.drawable.abs5);
            abstext.setText("\n "+five);
        }

    }
}