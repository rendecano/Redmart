
package com.mangjose.redmart.network;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.mangjose.redmart.helper.BitmapLruCache;

public final class VolleyHelper {

    private final static int SOCKET_TIMEOUT_MS = 60000;

    private static RequestQueue sRequestQueue;
    private static Map<String, String> mHeaders = new HashMap<String, String>();

    private static ImageLoader mImageLoader;

    // This is done automatically in Application.
    public static void init(final Context context) {

        sRequestQueue = Volley.newRequestQueue(context, null);

        // Create image loader
        ImageLoader.ImageCache imageCache = new BitmapLruCache();
        mImageLoader = new ImageLoader(sRequestQueue, imageCache);
    }

    // Execute a request with Volley.
    public static void exec(final Request<?> request) {

        // Add to queue
        sRequestQueue.add(request);
    }

    public static ImageLoader getImageLoader () {
        return mImageLoader;
    }

    // Cancel all requests with a specific tag.
    public static void cancelAll(final Object tag) {
        sRequestQueue.cancelAll(tag);
    }

    public static RetryPolicy createCustomRetryPolicy(int timeout) {
        return new DefaultRetryPolicy(timeout * 1000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
    }
}
