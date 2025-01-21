package com.example.health.Fitness.Abs;

import com.example.health.DandFModel;
import com.example.health.R;

import java.util.ArrayList;

public class AbsDataProvider {


    public ArrayList<DandFModel> setListData() {

        ArrayList<DandFModel> arrayList=new ArrayList<>();
        arrayList.add(new DandFModel(R.drawable.abs11,"Ab Wheel Rollout"));
        arrayList.add(new DandFModel(R.drawable.abs2,"Medicine Ball Slam"));
        arrayList.add(new DandFModel(R.drawable.abs3,"Three-Point Plank"));
        arrayList.add(new DandFModel(R.drawable.abs4,"Windshield Wipers"));
        arrayList.add(new DandFModel(R.drawable.abs5,"Reverse Crunches"));
        return arrayList;
    }
}
