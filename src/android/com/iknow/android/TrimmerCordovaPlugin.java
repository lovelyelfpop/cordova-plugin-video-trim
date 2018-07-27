package com.iknow.android;

import android.app.Activity;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

public class TrimmerCordovaPlugin extends CordovaPlugin {

    private static TrimmerCordovaPlugin instance;
    private static Activity activity;

    public TrimmerCordovaPlugin(){
        instance = this;

    }

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        activity = cordova.getActivity();
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("openTrimmerPage")) {
            // todo
            callbackContext.success();
            return true;
        }

        if (action.equals("openSelectVideoPage")) {
            callbackContext.success();
            return true;
        }
        return false;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
