package com.example.health;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.health.Diet.Diet.DietActivity;
import com.example.health.Fitness.Abs.AbsActivity;
import com.example.health.Fitness.Back.BackActivity;
import com.example.health.Fitness.Biceps.BicepsActivity;
import com.example.health.Fitness.Chest.ChestActivity;
import com.example.health.Fitness.Shoulder.ShoulderActivity;
import com.example.health.Fitness.Triceps.TricepsActivity;
import com.example.health.Fitness.Triceps.TricepsDataProvider;
import com.example.health.design.GridviewAdapter;

import java.util.ArrayList;

public class newDandFActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private TextView textDiet, textFitness, profile, tracker;
    GridView gridView, gridView1,gridView2,gridView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_dand_f);

        textDiet = findViewById(R.id.diet);
        textFitness = findViewById(R.id.fitness);
        profile = findViewById(R.id.profile);
        tracker = findViewById(R.id.tracker);

        gridView= findViewById(R.id.Dmy_grid_view);
        gridView1= findViewById(R.id.Fmy_grid_view);
        DDataProvider gridviewAdapter= new DDataProvider();
        FDataProvider gridviewAdapterF= new FDataProvider();
        ArrayList<DandFModel> list= gridviewAdapter.setListData();
        ArrayList<DandFModel> listF= gridviewAdapterF.setListData();
        GridviewAdapter gridviewAdapter1= new GridviewAdapter(this, list);
        GridviewAdapter gridviewAdapter2= new GridviewAdapter(this, listF);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newDandFActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
 gridView.setAdapter(gridviewAdapter1);
 gridView.setOnItemClickListener(this);
        gridView1.setAdapter(gridviewAdapter2);
        gridView1.setOnItemClickListener(this);
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




    private void selectFitness() {
        // Show fitness layout and hide diet layout
        gridView1.setVisibility(View.VISIBLE);
        gridView.setVisibility(View.GONE);
        // Change background color to indicate selection
    }
    private void selectDiet() {
        // Show diet layout and hide fitness layout
        gridView.setVisibility(View.VISIBLE);
        gridView1.setVisibility(View.GONE);

        // Change background color to indicate selection
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        DandFModel model= (DandFModel) parent.getItemAtPosition(i);
         String title= model.getTitle();
        if (title.equals("Chest")){
            Intent intent= new Intent(this, ChestActivity.class);
            startActivity(intent);

        } else if (title.equals("Back")) {
            Intent intent = new Intent(this, BackActivity.class);
            startActivity(intent);

        } else if (title.equals("Biceps")) {
            Intent intent = new Intent(this, BicepsActivity.class);
            startActivity(intent);

        } else if (title.equals("Triceps")) {
            Intent intent = new Intent(this, TricepsActivity.class);
            startActivity(intent);

        } else if (title.equals("Abs")) {
            Intent intent = new Intent(this, AbsActivity.class);
            startActivity(intent);

        } else if (title.equals("Shoulder")) {
            Intent intent = new Intent(this, ShoulderActivity.class);
            startActivity(intent);

        }else if (title.equals("Weight Loss")) {
            Intent intent = new Intent(this, DietActivity.class);
            intent.putExtra("diet", title);
            startActivity(intent);
        }else if (title.equals("Nutritional")) {
            Intent intent = new Intent(this, DietActivity.class);
            intent.putExtra("diet", title);
            startActivity(intent);
        }else if (title.equals("Food")) {
            Intent intent = new Intent(this, DietActivity.class);
            intent.putExtra("diet", title);
            startActivity(intent);
        }else if (title.equals("Diet")) {
            Intent intent = new Intent(this, DietActivity.class);
            intent.putExtra("diet", title);
            startActivity(intent);
        }
    }
}