package info.androidhive.slidingmenu;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

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
                Button b1 = (Button) findViewById(R.id.button);
                b1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent browserIntent =
                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=nriCj1EAdDc"));
                        startActivity(browserIntent);

                    }
                });
                break;
            case 2:
                setContentView(R.layout.match_stats_detail1);
                Button b2 = (Button) findViewById(R.id.button1);
                b2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent browserIntent =
                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=nriCj1EAdDc"));
                        startActivity(browserIntent);

                    }
                });

                break;
            case 3:
                setContentView(R.layout.match_stats_detail2);
                Button b3 = (Button) findViewById(R.id.button2);
                b3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent browserIntent =
                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=nriCj1EAdDc"));
                        startActivity(browserIntent);

                    }
                });
                break;

            case 4:
                setContentView(R.layout.match_stats_detail3);
                Button b4 = (Button) findViewById(R.id.button3);
                b4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent browserIntent =
                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=nriCj1EAdDc"));
                        startActivity(browserIntent);

                    }
                });
                break;
            case 5:
                setContentView(R.layout.match_stats_detail4);
                Button b5 = (Button) findViewById(R.id.button4);
                b5.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent browserIntent =
                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=nriCj1EAdDc"));
                        startActivity(browserIntent);

                    }
                });

                break;
            case 6:
                setContentView(R.layout.match_stats_detail5);
                Button b6 = (Button) findViewById(R.id.button5);
                b6.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent browserIntent =
                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=nriCj1EAdDc"));
                        startActivity(browserIntent);

                    }
                });
                break;
            case 7:
                setContentView(R.layout.match_stats_detail6);
                Button b7 = (Button) findViewById(R.id.button6);
                b7.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent browserIntent =
                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=nriCj1EAdDc"));
                        startActivity(browserIntent);

                    }
                });
                break;
            case 8:
                setContentView(R.layout.match_stats_detail7);
                Button b8 = (Button) findViewById(R.id.button7);
                b8.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent browserIntent =
                                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=nriCj1EAdDc"));
                        startActivity(browserIntent);

                    }
                });
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
