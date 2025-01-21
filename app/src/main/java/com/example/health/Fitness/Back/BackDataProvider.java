package com.example.health.Fitness.Back;

import com.example.health.DandFModel;
import com.example.health.R;

import java.util.ArrayList;

public class BackDataProvider {


    public ArrayList<DandFModel> setListData() {

        ArrayList<DandFModel> arrayList=new ArrayList<>();
        arrayList.add(new DandFModel(R.drawable.baseline_image_24,"Back"));
        arrayList.add(new DandFModel(R.drawable.back1,"Back"));
        arrayList.add(new DandFModel(R.drawable.biceps11,"Biceps"));
        arrayList.add(new DandFModel(R.drawable.triceps11,"Triceps"));
        arrayList.add(new DandFModel(R.drawable.abs11,"Abs"));
        arrayList.add(new DandFModel(R.drawable.forarm1,"Forarm"));
        arrayList.add(new DandFModel(R.drawable.leg1,"Leg"));
        arrayList.add(new DandFModel(R.drawable.butt1,"Buttocks"));

        return arrayList;
    }
}
