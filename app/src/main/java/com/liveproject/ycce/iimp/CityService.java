package com.liveproject.ycce.iimp;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.liveproject.ycce.iimp.constants.Constants;

/**
 * Created by Tiger on 09-02-2017.
 */

public class CityService extends StringRequest {
    static String s_url = Constants.SITE_URL + Constants.CITY_URL;

    public CityService(Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Request.Method.GET, s_url, listener, errorListener);
    }
}
