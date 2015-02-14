package com.mangjose.redmart.network;

import com.android.volley.Request;
import com.android.volley.Response.*;
import com.mangjose.redmart.model.Redmart;

public class RequestFactory {

    private final String API_URL = "https://api.redmart.com/v1.5/products/";

    private static final RequestFactory mRequestFactory = new RequestFactory();

    private RequestFactory() {
        // Instantiation disabled
    }

    public static RequestFactory getInstance() {
        return mRequestFactory;
    }

    public Request<Redmart> executeGetProducts(int page,
            Listener<Redmart> pListener, ErrorListener pErrorListener) {

        String url = API_URL + "?pageSize=20&page=" + page;

        JsonRequest<Redmart> request = new JsonRequest<Redmart>(Request.Method.GET, url, "",
                pListener, pErrorListener, Redmart.class);

        return request;
    }

    public Request<Redmart> executeGetProduct(long pProductId,
                                              Listener<Redmart> pListener, ErrorListener pErrorListener) {

        String url = API_URL + pProductId;

        JsonRequest<Redmart> request = new JsonRequest<Redmart>(Request.Method.GET, url, "",
                pListener, pErrorListener, Redmart.class);

        return request;
    }
}
