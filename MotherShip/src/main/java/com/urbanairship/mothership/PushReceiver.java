/*
 * Copyright 2013 Urban Airship and Contributors
 */

package com.urbanairship.mothership;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.push.PushManager;


/**
 * Broadcast receiver to handle all push notifications
 */
public class PushReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Only takes action when a notification is opened
        if (!PushManager.ACTION_NOTIFICATION_OPENED.equals(intent.getAction())) {
            return;
        }

        // Open app to the main activity
        Intent launchIntent = new Intent(Intent.ACTION_MAIN);
        launchIntent.setClass(context, MainActivity.class);
        launchIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        context.startActivity(launchIntent);
    }
}
