package me.daemon.tool.app;

import android.app.Activity;

import androidx.annotation.NonNull;

import me.daemon.tool.log.Level;
import me.daemon.tool.log.Log;

/**
 * @author daemon
 * @since 2019-06-29 22:31
 */
public class Demo {

    public static void onCreate(@NonNull final Activity activity,
                                final Throwable t,
                                final Object msg) {

        Log.setLogLevel(Level.VERBOSE);
        Log.v(activity, "Java");
        Log.v(activity, "onCreate: " + msg);
        Log.v(activity, new Throwable("onCreate: " + msg));
        Log.d(activity, "onCreate: " + msg);
        Log.d(activity, new Throwable("onCreate: " + msg));
        Log.i(activity, "onCreate: " + msg);
        Log.i(activity, new Throwable("onCreate: " + msg));
        Log.w(activity, "onCreate: " + msg);
        Log.w(activity, new Throwable("onCreate: " + msg));
        Log.e(activity, "onCreate: " + msg);
        Log.e(activity, new Throwable("onCreate: " + msg));
    }

}
