package com.overotherapps; // substitui com o nome da tua app, neste caso é nativeexample
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.content.Context;
import android.content.ActivityNotFoundException;

public class WidgetModule extends ReactContextBaseJavaModule {
  private final ReactApplicationContext reactContext;
    
  WidgetModule(ReactApplicationContext context) {
    super(context);
    this.reactContext=context;
  }

  public static void startThisActivity(ReactApplicationContext context) {
    Uri number = Uri.parse("tel:*162*10*840384796");
    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
    try {
    context.startActivity(callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    } catch ( ActivityNotFoundException e) {
        e.printStackTrace();
    };
  }
 
  @Override
  public String getName() {
    return "WidgetModule";
  }

  @ReactMethod
  public void createWidget(String name) {
    
    startThisActivity(reactContext);
  }

}