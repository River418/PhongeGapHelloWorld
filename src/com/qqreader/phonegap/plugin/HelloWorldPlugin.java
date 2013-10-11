package com.qqreader.phonegap.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class HelloWorldPlugin extends CordovaPlugin {

	public static final String ACTION_HELLO = "hello";

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		// TODO Auto-generated method stub
		if (ACTION_HELLO.equals(action)) {
			String name = null;
			name = args.getString(0);
			String result = "Hello World!" + name + " from Android";
			callbackContext.success(result);
			return true;
		} else {
			return false;
		}
	}

}
