package com.example.vga.tour_guide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.acropolis, R.string.acropolis_title, R.string.acropolis_short_desc,R.string.cat_landmark,R.string.acropolis_location));
        sights.add(new Sight(R.drawable.soldier, R.string.soldier_title, R.string.soldier_short_desc,R.string.cat_landmark,R.string.soldier_location));



        SightAdapter adapter = new SightAdapter(getActivity(), sights);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
