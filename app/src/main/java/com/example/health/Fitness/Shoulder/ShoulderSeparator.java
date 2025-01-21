package com.example.health.Fitness.Shoulder;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.health.R;

public class ShoulderSeparator extends AppCompatActivity {
    TextView shouldertext, titleshoulder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shoulder_separator);
        shouldertext= findViewById(R.id.sholdertext);
        titleshoulder= findViewById(R.id.titleshoulder);

        String shoulder1= getIntent().getStringExtra("one");

        String one = getString(R.string.shoulder1);
        String two = getString(R.string.shoulder2);
        String three = getString(R.string.shoulder3);
        String four = getString(R.string.shoulder4);
        String five = getString(R.string.shoulder5);
        ImageView shoulderImage= findViewById(R.id.shoulderimage);


        if (shoulder1.equals("Standing shoulder press")){
            titleshoulder.setText("Standing shoulder press");
            shoulderImage.setImageResource(R.drawable.shoulder1);
            shouldertext.setText("\n "+one);
        } else if (shoulder1.equals("Dumbbell push press with slow eccentric")) {
            titleshoulder.setText("Dumbbell push press with slow eccentric");

            shoulderImage.setImageResource(R.drawable.shoulder2);
            shouldertext.setText("\n "+two);
        } else if (shoulder1.equals("Dumbbell Z-press")) {
            titleshoulder.setText("Dumbbell Z-press");

            shoulderImage.setImageResource(R.drawable.shoulder3);
            shouldertext.setText("\n "+three);
        } else if (shoulder1.equals("Upright row")) {
            titleshoulder.setText("Upright row");
            shoulderImage.setImageResource(R.drawable.shoulder4);
            shouldertext.setText("\n "+four);
        } else if (shoulder1.equals("High-incline shoulder press")) {
            titleshoulder.setText("High-incline shoulder press");
            shoulderImage.setImageResource(R.drawable.shoulder5);
            shouldertext.setText("\n "+five);
        }




    }
}