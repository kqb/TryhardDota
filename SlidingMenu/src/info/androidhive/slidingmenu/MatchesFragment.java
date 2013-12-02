package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.IOException;
import java.util.List;

import info.androidhive.slidingmenu.adapter.MatchListAdapter;
import info.androidhive.slidingmenu.model.MatchlistItem;
import info.androidhive.slidingmenu.parser.MatchParser;

public class MatchesFragment extends Fragment {

    public MatchesFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.matchlist, container, false);
        Button button = (Button) rootView.findViewById(R.id.matchlistitem);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return rootView;
    }

}
