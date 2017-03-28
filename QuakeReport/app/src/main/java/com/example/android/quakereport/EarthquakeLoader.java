package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;
import java.util.List;
import static com.example.android.quakereport.EarthquakeActivity.LOG_TAG;

/**
 *  Earthquake Loader to fetch Earthquake date and update UI
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {



    /** Query URL */
    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        Log.i(LOG_TAG,"EarthquakeLoader called");
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG,"onStartLoading called");
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null){
            return null;
        }

        List<Earthquake> Earthquakes = QueryUtils.fetchEarthquakeData(mUrl);

        return Earthquakes;
    }
}
