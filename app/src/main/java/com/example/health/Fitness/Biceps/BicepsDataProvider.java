package com.example.health.Fitness.Biceps;

import com.example.health.DandFModel;
import com.example.health.R;

import java.util.ArrayList;

public class BicepsDataProvider {


    public ArrayList<DandFModel> setListData() {

        ArrayList<DandFModel> arrayList=new ArrayList<>();
        arrayList.add(new DandFModel(R.drawable.biceps11,"Fat-Grip Hammer Curl"));
        arrayList.add(new DandFModel(R.drawable.biceps2,"Behind-the-Back Cable Curl"));
        arrayList.add(new DandFModel(R.drawable.biceps3,"EZ-Bar Preacher Curl"));
        arrayList.add(new DandFModel(R.drawable.biceps4,"Reverse Curl"));
        arrayList.add(new DandFModel(R.drawable.biceps5,"Wide-Grip Curl"));

        return arrayList;
    }
}
