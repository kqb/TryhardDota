package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.io.IOException;
import java.util.List;

import info.androidhive.slidingmenu.adapter.MatchListAdapter;
import info.androidhive.slidingmenu.model.MatchlistItem;
import info.androidhive.slidingmenu.parser.MatchParser;

public class MatchesFragment extends Fragment {

    public MatchesFragment(){}
    private View rootView;

    @Override
    public View onCreateView(final LayoutInflater inflater,final ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.matchlist, container, false);
        LinearLayout match1 = (LinearLayout) rootView.findViewById(R.id.match1);
        match1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayView(1);
            }
        });

        LinearLayout match2 = (LinearLayout) rootView.findViewById(R.id.match2);
        match2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayView(2);
            }
        });

        LinearLayout match3 = (LinearLayout) rootView.findViewById(R.id.match3);
        match3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayView(3);
            }
        });

        LinearLayout match4 = (LinearLayout) rootView.findViewById(R.id.match4);
        match4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayView(4);
            }
        });

        LinearLayout match5 = (LinearLayout) rootView.findViewById(R.id.match5);
        match5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayView(5);
            }
        });

        LinearLayout match6 = (LinearLayout) rootView.findViewById(R.id.match6);
        match6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayView(6);
            }
        });

        LinearLayout match7 = (LinearLayout) rootView.findViewById(R.id.match7);
        match7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayView(7);
            }
        });

        LinearLayout match8 = (LinearLayout) rootView.findViewById(R.id.match8);
        match8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayView(8);
            }
        });


        return rootView;
    }

    private void displayView(int res) {

//        // update the main content by replacing fragments
//        Fragment fragment = null;
//        fragment = new MatchFragment(R.layout.match_stats_detail);
//
//        if (fragment != null) {
//            FragmentManager fragmentManager = getFragmentManager();
//
//            fragmentManager.beginTransaction()
//                    .replace(R.id.frame_container, fragment).addToBackStack( "tag" ).commit();
//
//
//        }
//        else {
//            // error in creating fragment
//            Log.e("MainActivity", "Error in creating fragment");
//        }


        Intent intent = new Intent(getActivity(), MatchActivity.class);
        intent.addFlags(res);
        startActivity(intent);


    }


}
