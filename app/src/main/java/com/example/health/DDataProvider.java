package com.example.health;

import java.util.ArrayList;

public class DDataProvider {

    public ArrayList<DandFModel> setListData() {

        ArrayList<DandFModel> arrayList=new ArrayList<>();
        arrayList.add(new DandFModel(R.drawable.food,"Food"));
        arrayList.add(new DandFModel(R.drawable.weightloss,"Weight Loss"));
        arrayList.add(new DandFModel(R.drawable.nutritional,"Nutritional"));
        arrayList.add(new DandFModel(R.drawable.deit,"Diet"));
        return arrayList;
    }
}