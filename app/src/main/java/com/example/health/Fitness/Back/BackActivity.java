package com.example.health.Fitness.Back;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.health.DandFModel;
import com.example.health.Fitness.Chest.ChestDataProvider;
import com.example.health.R;
import com.example.health.design.GridviewAdapterBack;
import com.example.health.design.GridviewAdapterChest;

import java.util.ArrayList;

public class BackActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    GridView gridView, gridView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_back);
        gridView= findViewById(R.id.backutility);
        BackDataProvider gridviewAdapter= new BackDataProvider();
        ArrayList<DandFModel> list= gridviewAdapter.setListData();
        GridviewAdapterBack gridviewAdapter1= new GridviewAdapterBack(this, list);

        gridView.setAdapter(gridviewAdapter1);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        DandFModel model= (DandFModel) parent.getItemAtPosition(i);
        String title= model.getTitle();
        if (title.equals("Chest")){
            Intent intent= new Intent(this, BackActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Clicked by hg"+ title, Toast.LENGTH_SHORT).show();

        } else if (title.equals("Back")) {
            Toast.makeText(this, "Clicked by kjh"+ title, Toast.LENGTH_SHORT).show();

        }
    }
}