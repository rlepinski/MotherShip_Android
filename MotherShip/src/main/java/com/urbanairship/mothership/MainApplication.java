/*
 * Copyright 2013 Urban Airship and Contributors
 */

package com.urbanairship.mothership;

import android.app.Application;

import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        UAirship.takeOff(this);
        PushManager.shared().setIntentReceiver(PushReceiver.class);
        PushManager.enablePush();
    }
}
