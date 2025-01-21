package com.example.health;

import java.util.ArrayList;

public class FDataProvider {

    public ArrayList<DandFModel> setListData() {

        ArrayList<DandFModel> arrayList=new ArrayList<>();
        arrayList.add(new DandFModel(R.drawable.abs1,"Abs"));
        arrayList.add(new DandFModel(R.drawable.chest1,"Chest"));
        arrayList.add(new DandFModel(R.drawable.shoulder,"Shoulder"));

        arrayList.add(new DandFModel(R.drawable.biceps1,"Biceps"));
        arrayList.add(new DandFModel(R.drawable.triceps1,"Triceps"));

        arrayList.add(new DandFModel(R.drawable.leg1,"Leg"));
        arrayList.add(new DandFModel(R.drawable.forarm1,"Forarm"));
        arrayList.add(new DandFModel(R.drawable.back1,"Back"));

        return arrayList;
    }
}