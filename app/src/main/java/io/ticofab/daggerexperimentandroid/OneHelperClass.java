package io.ticofab.daggerexperimentandroid;

import javax.inject.Inject;

/**
 * Copyright 2015 Hengroen
 * Created by fabiotiriticco on 25/03/15.
 */
public class OneHelperClass {
    private static final String TAG = OneHelperClass.class.getSimpleName();

    @Inject protected AnotherHelperClass mAnotherHelperClass;

    public OneHelperClass() {
        Injector.inject(this);
    }

    public String helpMe() {
        return mAnotherHelperClass != null ? "I have been injected!" : "I haven't been injected :(";
    }
}
