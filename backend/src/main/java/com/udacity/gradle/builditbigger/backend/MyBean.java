package com.udacity.gradle.builditbigger.backend;

import android.example.javajokes.Joker;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new Joker().getJoke();
        return myData;
    }

}