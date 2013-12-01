package info.androidhive.slidingmenu.parser;

    import java.io.IOException;
    import java.io.InputStream;
    import java.util.ArrayList;
    import java.util.List;
    import org.xmlpull.v1.XmlPullParser;
    import org.xmlpull.v1.XmlPullParserException;
    import org.xmlpull.v1.XmlPullParserFactory;

    import info.androidhive.slidingmenu.model.MatchlistItem;


public class MatchParser {
    List<MatchlistItem> matches;
    private MatchlistItem match;
    private String text;

    public MatchParser() {
        matches = new ArrayList<MatchlistItem>();
    }

    public List<MatchlistItem> getEmployees() {
        return matches;
    }

    public List<MatchlistItem> parse(InputStream is) {
        XmlPullParserFactory factory = null;
        XmlPullParser parser = null;
        try {
            factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            parser = factory.newPullParser();
            parser.setInput(is, null);

            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tagname = parser.getName();
                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        if (tagname.equalsIgnoreCase("match")) {
                            // create a new instance of match
                            match = new MatchlistItem();
                        }
                        break;

                    case XmlPullParser.TEXT:
                        text = parser.getText();
                        break;

                    case XmlPullParser.END_TAG:
                        if (tagname.equalsIgnoreCase("match")) {
                            // add match object to list
                            matches.add(match);
                        } else if (tagname.equalsIgnoreCase("id")) {
                            match.setId(Integer.parseInt(text));
                        } else if (tagname.equalsIgnoreCase("item1")) {
                            match.setItem1(Integer.parseInt(text));
                        } else if (tagname.equalsIgnoreCase("item2")) {
                            match.setItem2(Integer.parseInt(text));
                        } else if (tagname.equalsIgnoreCase("item3")) {
                            match.setItem3(Integer.parseInt(text));
                        } else if (tagname.equalsIgnoreCase("item4")) {
                            match.setItem4(Integer.parseInt(text));
                        } else if (tagname.equalsIgnoreCase("item5")) {
                            match.setItem5(Integer.parseInt(text));
                        } else if (tagname.equalsIgnoreCase("item6")) {
                            match.setItem6(Integer.parseInt(text));
                        } else if (tagname.equalsIgnoreCase("duration")) {
                            match.setDuration(text);
                        } else if (tagname.equalsIgnoreCase("hero")) {
                            match.setHero(text);
                        }
                        break;

                    default:
                        break;
                }
                eventType = parser.next();
            }

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return matches;
    }
}