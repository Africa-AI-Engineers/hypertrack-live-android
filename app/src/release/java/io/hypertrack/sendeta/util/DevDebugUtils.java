package io.hypertrack.sendeta.util;

import android.app.Application;
import android.content.Context;

import com.hypertrack.lib.HyperTrack;
import com.hypertrack.lib.internal.common.logging.HTLog;

/**
 * Created by piyush on 03/07/16.
 */
public class DevDebugUtils {

    private static final String TAG = DevDebugUtils.class.getSimpleName();

    public static void installStetho(Application application) {
        //do nothing
    }

    public static void setHTLogLevel(int logLevel) {
        //do nothing
    }

    public static void sdkVersionMessage(Context context) {
        //do nothing
        HTLog.i(TAG, "HyperTrack Live: SDK Version " + HyperTrack.getSDKVersion());
    }
}
