package com.example.health.Fitness.Abs;

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

public class AbsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    GridView gridView, gridView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abs);
        gridView= findViewById(R.id.absutility);
        AbsDataProvider gridviewAdapter= new AbsDataProvider();
        ArrayList<DandFModel> list= gridviewAdapter.setListData();
        GridviewAdapterBiceps gridviewAdapter1= new GridviewAdapterBiceps(this, list);

        gridView.setAdapter(gridviewAdapter1);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        DandFModel model= (DandFModel) parent.getItemAtPosition(i);
        String title= model.getTitle();
        if (title.equals("Ab Wheel Rollout")){
            Intent intent= new Intent(this, AbsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        } else if (title.equals("Medicine Ball Slam")) {
            Intent intent= new Intent(this, AbsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("Three-Point Plank")) {
            Intent intent= new Intent(this, AbsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("Windshield Wipers")) {
            Intent intent= new Intent(this, AbsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }else if (title.equals("Reverse Crunches")) {
            Intent intent= new Intent(this, AbsSeparator.class);
            intent.putExtra("one", title);
            startActivity(intent);

        }
    }
}