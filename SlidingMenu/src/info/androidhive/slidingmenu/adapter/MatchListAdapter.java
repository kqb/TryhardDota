package info.androidhive.slidingmenu.adapter;

import info.androidhive.slidingmenu.R;
import info.androidhive.slidingmenu.model.MatchlistItem;
import info.androidhive.slidingmenu.parser.JsonHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by KT on 11/30/13.
 */
public class MatchListAdapter extends BaseAdapter {
    private JSONObject itemData = null;
    private Context context;
    private List<MatchlistItem> matchlistItems;
    private Map<String, Object> itemMap;

    public MatchListAdapter(Context context, List<MatchlistItem> matchlistItems){
        this.context = context;
        this.matchlistItems = matchlistItems;
        try {
            this.itemData = new JSONObject(loadJSONFromAsset());
            this.itemMap = JsonHelper.toMap(itemData);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String loadJSONFromAsset() {
        String json = null;
        try {

            InputStream is = context.getAssets().open("itemdata.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }

    @Override
    public int getCount() {
        return matchlistItems.size();
    }

    @Override
    public Object getItem(int position) {
        return matchlistItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.matchlist_item, null);
        }

        ImageView item1 = (ImageView) convertView.findViewById(R.id.matchlist_items_item1);
        ImageView item2 = (ImageView) convertView.findViewById(R.id.matchlist_items_item2);
        ImageView item3 = (ImageView) convertView.findViewById(R.id.matchlist_items_item3);
        ImageView item4 = (ImageView) convertView.findViewById(R.id.matchlist_items_item4);
        ImageView item5 = (ImageView) convertView.findViewById(R.id.matchlist_items_item5);
        ImageView item6 = (ImageView) convertView.findViewById(R.id.matchlist_items_item6);
        ImageView heroIcon = (ImageView) convertView.findViewById(R.id.matchlist_items_item6);
        TextView duration = (TextView) convertView.findViewById(R.id.title);
        TextView heroName = (TextView) convertView.findViewById(R.id.counter);

        setItemImg(item1, position, (String) itemMap.get(matchlistItems.get(position).getItem1()));
        setItemImg(item2, position, (String) itemMap.get(matchlistItems.get(position).getItem2()));
        setItemImg(item3, position, (String) itemMap.get(matchlistItems.get(position).getItem3()));
        setItemImg(item4, position, (String) itemMap.get(matchlistItems.get(position).getItem4()));
        setItemImg(item5, position, (String) itemMap.get(matchlistItems.get(position).getItem5()));
        setItemImg(item6, position, (String) itemMap.get(matchlistItems.get(position).getItem6()));

        setItemImg(heroIcon, position, matchlistItems.get(position).getHero());

        heroName.setText(matchlistItems.get(position).getHero());
        duration.setText(matchlistItems.get(position).getDuration());

        return convertView;
    }

    public void setItemImg(ImageView item, int position, String itemName){
        String pack = "info.androidhive.slidingmenu";

        int resId = context.getResources().getIdentifier(itemName, "drawable", pack);
        item.setImageResource(resId);
    }


}
