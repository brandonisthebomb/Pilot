package com.Pilot.pilot.app;

/**
 * Created by Brandon on 3/29/14.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class myReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // assumes WordService is a registered service
        intent = new Intent(context, MainActivity.class);
        if (intent.getAction()!=null) {
            intent.getAction().equals(Intent.ACTION_USER_PRESENT);
            context.startService(intent);
        }
    }
}

