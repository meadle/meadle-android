package edu.purdue.cs408.meadle.interfaces;

import org.json.JSONObject;

import java.util.ArrayList;
import edu.purdue.cs408.meadle.models.YelpLocation;

/**
 * Created by jeremy on 9/18/14.
 */
public interface OnYelpDataTaskFinishedListener {
    public void onYelpDataTaskFinished(ArrayList<YelpLocation> locations);
}
