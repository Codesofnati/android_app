package com.example.health.Fitness.Biceps;

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
import com.example.health.R;
import com.example.health.design.GridviewAdapterBack;
import com.example.health.design.GridviewAdapterBiceps;

import java.util.ArrayList;

public class BicepsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    GridView gridView, gridView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_biceps);
        gridView= findViewById(R.id.bicepsutility);
        BicepsDataProvider gridviewAdapter= new BicepsDataProvider();
        ArrayList<DandFModel> list= gridviewAdapter.setListData();
        GridviewAdapterBiceps gridviewAdapter1= new GridviewAdapterBiceps(this, list);

        gridView.setAdapter(gridviewAdapter1);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        DandFModel model= (DandFModel) parent.getItemAtPosition(i);
        String title= model.getTitle();
        if (title.equals("Fat-Grip Hammer Curl")){
            Intent intent= new Intent(this, BicepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        } else if (title.equals("Behind-the-Back Cable Curl")) {
            Intent intent= new Intent(this, BicepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("EZ-Bar Preacher Curl")) {
            Intent intent= new Intent(this, BicepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("Reverse Curl")) {
            Intent intent= new Intent(this, BicepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("Wide-Grip Curl")) {
            Intent intent= new Intent(this, BicepsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }
    }
}