package com.example.health.Fitness.Chest;

import com.example.health.DandFModel;
import com.example.health.R;

import java.util.ArrayList;

public class ChestDataProvider{


    public ArrayList<DandFModel> setListData() {

        ArrayList<DandFModel> arrayList=new ArrayList<>();
        arrayList.add(new DandFModel(R.drawable.chest11,"Regular Push-ups"));
        arrayList.add(new DandFModel(R.drawable.chest2,"Decline Push-ups"));
        arrayList.add(new DandFModel(R.drawable.chest3,"Incline Push-ups"));
        arrayList.add(new DandFModel(R.drawable.chest4,"Offset Push-ups"));
        arrayList.add(new DandFModel(R.drawable.chest5,"One-Leg Push-ups"));


        return arrayList;
    }
}
