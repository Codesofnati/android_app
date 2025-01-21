package com.example.health.Fitness.Triceps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.health.DandFModel;
import com.example.health.Fitness.Back.BackDataProvider;
import com.example.health.Fitness.Biceps.BicepsSeparator;
import com.example.health.R;
import com.example.health.design.GridviewAdapterBack;
import com.example.health.design.GridviewAdapterTriceps;

import java.util.ArrayList;

public class TricepsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    GridView gridView, gridView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_triceps);
        gridView= findViewById(R.id.tricepsutility);
        TricepsDataProvider gridviewAdapter= new TricepsDataProvider();
        ArrayList<DandFModel> list= gridviewAdapter.setListData();
        GridviewAdapterTriceps gridviewAdapter1= new GridviewAdapterTriceps(this, list);

        gridView.setAdapter(gridviewAdapter1);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        DandFModel model= (DandFModel) parent.getItemAtPosition(i);
        String title= model.getTitle();
        if (title.equals("Tricep dips")){
            Intent intent= new Intent(this, TricepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);
            Toast.makeText(this, "Clicked by hg"+ title, Toast.LENGTH_SHORT).show();

        } else if (title.equals("Standing triceps extension")) {
            Intent intent= new Intent(this, TricepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);
            Toast.makeText(this, "Clicked by kjh"+ title, Toast.LENGTH_SHORT).show();

        }else if (title.equals("Skull crusher")) {
            Intent intent= new Intent(this, TricepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);
            Toast.makeText(this, "Clicked by kjh"+ title, Toast.LENGTH_SHORT).show();

        }else if (title.equals("Triceps kickback")) {
            Intent intent= new Intent(this, TricepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);
            Toast.makeText(this, "Clicked by kjh"+ title, Toast.LENGTH_SHORT).show();

        }else if (title.equals("Lateral arm raise")) {
            Intent intent= new Intent(this, TricepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);
            Toast.makeText(this, "Clicked by kjh"+ title, Toast.LENGTH_SHORT).show();

        }
    }
}