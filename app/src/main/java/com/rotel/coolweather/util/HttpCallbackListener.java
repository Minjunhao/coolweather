package com.rotel.coolweather.util;

/**
 * Created by ROT on 2016/8/24.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
