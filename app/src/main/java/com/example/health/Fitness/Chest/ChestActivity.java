package com.example.health.Fitness.Chest;

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
import com.example.health.R;
import com.example.health.design.GridviewAdapterChest;

import java.util.ArrayList;

public class ChestActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    GridView gridView, gridView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chest);
        gridView= findViewById(R.id.chestutility);
        ChestDataProvider gridviewAdapter= new ChestDataProvider();
        ArrayList<DandFModel> list= gridviewAdapter.setListData();
        GridviewAdapterChest gridviewAdapter1= new GridviewAdapterChest(this, list);

        gridView.setAdapter(gridviewAdapter1);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        DandFModel model= (DandFModel) parent.getItemAtPosition(i);
        String title= model.getTitle();
        if (title.equals("Regular Push-ups")){
            Intent intent= new Intent(this, ChestSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        } else if (title.equals("Decline Push-ups")) {
            Intent intent= new Intent(this, ChestSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("Incline Push-ups")) {
            Intent intent= new Intent(this, ChestSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("Offset Push-ups")) {
            Intent intent= new Intent(this, ChestSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("One-Leg Push-ups")) {
            Intent intent= new Intent(this, ChestSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }
    }
}