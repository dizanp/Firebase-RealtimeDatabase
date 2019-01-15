package com.coding.fireapp;
import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Mr Dizan on 11/26/2018.
 */

public class FireApp extends Application {
    public void onCreate(){
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
