package com.example.health.Diet.Diet;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.health.R;

public class DietActivity extends AppCompatActivity {

    ImageView dietimage;
    TextView diettext, description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_diet);

        String extra= getIntent().getStringExtra("diet");
        dietimage= findViewById(R.id.dietimage);
        diettext= findViewById(R.id.diettext);
        description= findViewById(R.id.description);
        
       if(extra.equals("Weight Loss")){

           description.setText(R.string.weightloss);

           dietimage.setImageResource(R.drawable.weightloss);
           diettext.setText(R.string.weightlosstitle);

       } else if (extra.equals("Diet")) {
           description.setText(R.string.diet);

           dietimage.setImageResource(R.drawable.dietnew);
           diettext.setText(R.string.diettitle);


       }else if (extra.equals("Food")) {
           description.setText(R.string.food);

           dietimage.setImageResource(R.drawable.food);
           diettext.setText(R.string.foodtitle);


       }else if (extra.equals("Nutritional")) {
           description.setText(R.string.nutritional);
           dietimage.setImageResource(R.drawable.nutritional);
           diettext.setText(R.string.nutritionaltitle);


       }
    }

}