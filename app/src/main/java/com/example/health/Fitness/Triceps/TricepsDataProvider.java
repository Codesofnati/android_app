package com.example.health.Fitness.Triceps;

import com.example.health.DandFModel;
import com.example.health.R;

import java.util.ArrayList;

public class TricepsDataProvider {


    public ArrayList<DandFModel> setListData() {

        ArrayList<DandFModel> arrayList=new ArrayList<>();
        arrayList.add(new DandFModel(R.drawable.triceps11,"Tricep dips"));
        arrayList.add(new DandFModel(R.drawable.triceps2,"Standing triceps extension"));
        arrayList.add(new DandFModel(R.drawable.triceps3,"Skull crusher"));
        arrayList.add(new DandFModel(R.drawable.triceps4,"Triceps kickback"));
        arrayList.add(new DandFModel(R.drawable.triceps5,"Lateral arm raise"));

        return arrayList;
    }
}
