package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.IOException;
import java.util.List;

import info.androidhive.slidingmenu.adapter.MatchListAdapter;
import info.androidhive.slidingmenu.model.MatchlistItem;
import info.androidhive.slidingmenu.parser.MatchParser;

public class MatchesFragment extends ListFragment {
	
	public MatchesFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        MatchListAdapter adapter = null;
        ListView listView;

        super.onActivityCreated(savedInstanceState);
        View myFragmentView = inflater.inflate(R.layout.matchlist, container, false);

        listView = (ListView) myFragmentView.findViewById(android.R.id.list);
        List<MatchlistItem> matches = null;
        try {
            MatchParser parser = new MatchParser();
            matches = parser.parse(getActivity().getAssets().open("matchlist.xml"));
            adapter = new MatchListAdapter(getActivity().getApplicationContext(), matches);

            listView.setAdapter(adapter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myFragmentView;
    }

}
