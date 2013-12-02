package info.androidhive.slidingmenu;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/**
 * Created by KT on 12/2/13.
 */
public class MatchActivity extends Activity {
    private int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        pos = intent.getFlags();

        switch (pos) {
            case 1:
                setContentView(R.layout.match_stats_detail);
                break;
            case 2:
                setContentView(R.layout.match_stats_detail1);
                break;
            case 3:
                setContentView(R.layout.match_stats_detail2);
                break;
            case 4:
                setContentView(R.layout.match_stats_detail3);
                break;
            case 5:
                setContentView(R.layout.match_stats_detail4);
                break;
            case 6:
                setContentView(R.layout.match_stats_detail5);
                break;
            case 7:
                setContentView(R.layout.match_stats_detail6);
                break;
            case 8:
                setContentView(R.layout.match_stats_detail7);
                break;

            default:
                break;
        }


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

//    @Override
//    protected void onDestroy(){
//
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//
//
//    }
}
