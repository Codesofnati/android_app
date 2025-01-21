package com.example.health.Fitness.Shoulder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.health.DandFModel;
import com.example.health.Fitness.Abs.AbsSeparator;
import com.example.health.Fitness.Triceps.TricepsDataProvider;
import com.example.health.R;
import com.example.health.design.GridviewAdapterShoulder;
import com.example.health.design.GridviewAdapterTriceps;

import java.util.ArrayList;

public class ShoulderActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    GridView gridView, gridView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shoulder);
        gridView= findViewById(R.id.shoulderutility);
        ShoulderDataProvider gridviewAdapter= new ShoulderDataProvider();
        ArrayList<DandFModel> list= gridviewAdapter.setListData();
        GridviewAdapterShoulder gridviewAdapter1= new GridviewAdapterShoulder(this, list);

        gridView.setAdapter(gridviewAdapter1);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        DandFModel model= (DandFModel) parent.getItemAtPosition(i);
        String title= model.getTitle();
        if (title.equals("Standing shoulder press")){
            Intent intent= new Intent(this, ShoulderSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        } else if (title.equals("Dumbbell push press with slow eccentric")) {
            Intent intent= new Intent(this, ShoulderSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("Dumbbell Z-press")) {
            Intent intent= new Intent(this, ShoulderSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("Upright row")) {
            Intent intent= new Intent(this, ShoulderSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("High-incline shoulder press")) {
            Intent intent= new Intent(this, ShoulderSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }
    }
}