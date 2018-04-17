package com.example.vga.tour_guide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vga on 17-Apr-18.
 */

public class SightAdapter extends ArrayAdapter<Sight> {

    public SightAdapter(Activity context, ArrayList<Sight> sights){
        super (context,0 ,sights);
    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View listItemView = convertView;
        if (listItemView == null);{
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.sight_list_view, parent, false);}


        Sight currentSight = getItem(position);

        ImageView sightImage = listItemView.findViewById(R.id.sightImage);
        sightImage.setImageResource(currentSight.getmSightImage());

        TextView sightTitle = listItemView.findViewById(R.id.sightTitle);
        sightTitle.setText(currentSight.getmSightTitle());

        TextView sightShortDesc = listItemView.findViewById(R.id.sightShortDesc);
        sightShortDesc.setText(currentSight.getmSightShortDesc());

        TextView sightLocation = listItemView.findViewById(R.id.sightLocation);
        sightLocation.setText(currentSight.getmSightLocation());

            return listItemView;
        }

    }




