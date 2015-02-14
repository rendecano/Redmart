
package com.mangjose.redmart.network;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;


import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

/**
 * A request for retrieving a T type response body at a given URL that also
 * optionally sends along a JSON body in the request specified.
 *
 * @param <T> JSON type of response expected
 */
public class JsonRequest<T> extends Request<T> {
    /**
     * Charset for request.
     */
    private static final String PROTOCOL_CHARSET = "utf-8";

    /**
     * Content type for request.
     */
    private static final String PROTOCOL_CONTENT_TYPE =
            String.format("application/json; charset=%s", PROTOCOL_CHARSET);

    private final Listener<T> mListener;
    private final String mRequestBody;

    private final Class<T> mType;


    public JsonRequest(String url, String requestBody, Listener<T> listener,
                       ErrorListener errorListener) {
        this(Method.DEPRECATED_GET_OR_POST, url, requestBody, listener, errorListener, null);
    }

    public JsonRequest(int method, String url, String requestBody, Listener<T> listener,
                       ErrorListener errorListener, Class<T> type) {
        super(method, url, errorListener);
        mListener = listener;
        mRequestBody = requestBody;
        mType = type;

    }

    @Override
    protected void deliverResponse(T response) {
        mListener.onResponse(response);
    }

    protected Response<T> parseNetworkResponse(
            NetworkResponse response) {
        try {
            String resultString = new String(response.data,
                    HttpHeaderParser.parseCharset(response.headers));

            System.out.println("RESULT STRING: " + resultString);

            Reader reader = new StringReader(resultString);

            Gson gson = new Gson();

            T result = gson.fromJson(reader, mType);

            return Response.success(result,
                    HttpHeaderParser.parseCacheHeaders(response));
        } catch (Exception e) {
            return Response.error(new ParseError(e));
        }
    }

    /**
     * @deprecated Use {@link #getBodyContentType()}.
     */
    @Override
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /**
     * @deprecated Use {@link #getBody()}.
     */
    @Override
    public byte[] getPostBody() {
        return getBody();
    }

    @Override
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override
    public byte[] getBody() {
        try {
            return mRequestBody == null ? null : mRequestBody.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException uee) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s",
                    mRequestBody, PROTOCOL_CHARSET);
            return null;
        }
    }
}
