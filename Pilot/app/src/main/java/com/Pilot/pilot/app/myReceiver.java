package com.Pilot.pilot.app;

/**
 * Created by Brandon on 3/29/14.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class myReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // assumes WordService is a registered service
        if (intent.getAction()!=null) {
            if(intent.getAction().equals(Intent.ACTION_USER_PRESENT))
            {
                Intent start = new Intent(context, MainActivity.class);
                start.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(start);
            }
        }
    }
}

