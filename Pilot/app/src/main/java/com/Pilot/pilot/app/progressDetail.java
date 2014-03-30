package com.Pilot.pilot.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by tony.xu on 3/30/14.
 */
public class progressDetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_detail);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.progress_detail, menu);
        return true;
    }
}
