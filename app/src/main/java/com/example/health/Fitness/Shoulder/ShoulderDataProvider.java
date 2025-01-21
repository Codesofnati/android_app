package com.example.health.Fitness.Shoulder;

import com.example.health.DandFModel;
import com.example.health.R;

import java.util.ArrayList;

public class ShoulderDataProvider {


    public ArrayList<DandFModel> setListData() {

        ArrayList<DandFModel> arrayList=new ArrayList<>();
        arrayList.add(new DandFModel(R.drawable.shoulder1,"Standing shoulder press"));
        arrayList.add(new DandFModel(R.drawable.shoulder2,"Dumbbell push press with slow eccentric"));
        arrayList.add(new DandFModel(R.drawable.shoulder3,"Dumbbell Z-press"));
        arrayList.add(new DandFModel(R.drawable.shoulder4,"Upright row"));
        arrayList.add(new DandFModel(R.drawable.shoulder5,"High-incline shoulder press"));


        return arrayList;
    }
}
