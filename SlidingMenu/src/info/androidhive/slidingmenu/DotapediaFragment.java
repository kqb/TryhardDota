package info.androidhive.slidingmenu;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
public class DotapediaFragment extends Fragment {

    public DotapediaFragment(){}
    WebView myWebView;
    final static String myBlogAddr = "http://android-er.blogspot.com";
    String myUrl = "http://www.dota2alttab.com/";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_pages, container, false);
        myWebView = (WebView)rootView.findViewById(R.id.webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl(myUrl);

        return rootView;
    }
}