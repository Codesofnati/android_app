package com.example.health.design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.health.DandFModel;
import com.example.health.R;

import java.util.ArrayList;

public class GridviewAdapterShoulder extends ArrayAdapter<DandFModel> {
    public GridviewAdapterShoulder(@NonNull Context context, ArrayList<DandFModel> DandFModel) {
        super(context, 0, DandFModel);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        HolderView holderView;
        if(convertView==null){
            convertView= LayoutInflater.from(getContext())
                    .inflate(R.layout.grid_view_for_fitness,parent, false);
            holderView=new HolderView(convertView);
            convertView.setTag(holderView);
        }
        else{
            holderView= (HolderView) convertView.getTag();
        }
        DandFModel model=getItem(position);
        holderView.textView.setText(model.getTitle());
        holderView.imageView.setImageResource(model.getImage());
        return convertView;
    }

    private  static  class HolderView{
        private final TextView textView;
        private final ImageView imageView;
        public HolderView(View view) {
            textView=view.findViewById(R.id.textviewlist1);
            imageView=view.findViewById(R.id.icon_id1);

        }

    }
}
