package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("iWbDxaAc42lADu4xnGvFlCj0k8IbmvF4qNQBIbRm")
                .clientKey("CO02EdUflUCQsTXw9Fn58v7rPUL5KOjmpLNJWxb7")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
