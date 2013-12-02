package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class HomeFragment extends Fragment {

	public HomeFragment(){}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_account_selector, container, false);



        Button b1 = (Button) rootView.findViewById(R.id.btn_search);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                displayView();
            }
        });


        RelativeLayout b2 = (RelativeLayout) rootView.findViewById(R.id.player_but);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                displayView();
            }
        });

        return rootView;
    }


    private void displayView() {

        // update the main content by replacing fragments
        Fragment fragment = null;
        fragment = new MatchFragment(R.layout.activity_player_stats);

        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();

            fragmentManager.beginTransaction()
                    .replace(R.id.frame_container, fragment).addToBackStack( "tag" ).commit();


        }
        else {
            // error in creating fragment
            Log.e("MainActivity", "Error in creating fragment");
        }
    }

}