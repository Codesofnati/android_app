package com.example.health.Fitness.Biceps;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.health.R;

public class BicepsSeparator extends AppCompatActivity {
    TextView bicepstext, titlebiceps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_biceps_separator);
        bicepstext= findViewById(R.id.bicepstext);
        titlebiceps= findViewById(R.id.titlebiceps);

        String shoulder1= getIntent().getStringExtra("one");

        String one = getString(R.string.biceps1);
        String two = getString(R.string.biceps2);
        String three = getString(R.string.biceps3);
        String four = getString(R.string.biceps4);
        String five = getString(R.string.biceps5);
        ImageView shoulderImage= findViewById(R.id.bicepsimage);


        if (shoulder1.equals("Fat-Grip Hammer Curl")){
            titlebiceps.setText("Fat-Grip Hammer Curl");
            shoulderImage.setImageResource(R.drawable.biceps11);
            bicepstext.setText("\n "+one);
        } else if (shoulder1.equals("Behind-the-Back Cable Curl")) {
            titlebiceps.setText("Behind-the-Back Cable Curl");

            shoulderImage.setImageResource(R.drawable.biceps2);
            bicepstext.setText("\n "+two);
        } else if (shoulder1.equals("EZ-Bar Preacher Curl")) {
            titlebiceps.setText("EZ-Bar Preacher Curl");

            shoulderImage.setImageResource(R.drawable.biceps3);
            bicepstext.setText("\n "+three);
        } else if (shoulder1.equals("Reverse Curl")) {
            titlebiceps.setText("Reverse Curl");
            shoulderImage.setImageResource(R.drawable.biceps4);
            bicepstext.setText("\n "+four);
        } else if (shoulder1.equals("Wide-Grip Curl")) {
            titlebiceps.setText("Wide-Grip Curl");
            shoulderImage.setImageResource(R.drawable.biceps5);
            bicepstext.setText("\n "+five);
        }
    }
}