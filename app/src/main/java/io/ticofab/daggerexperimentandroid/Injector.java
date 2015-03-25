package io.ticofab.daggerexperimentandroid;

import dagger.ObjectGraph;

/**
 * Copyright 2015 Hengroen
 * Created by fabiotiriticco on 25/03/15.
 */
public class Injector {
    private static ObjectGraph mGraph;

    public static void inject(Object object) {
        if (mGraph == null) {
            // create object graph for dependency injection
            mGraph = ObjectGraph.create(
                    new OneHelperClassModule()
            );
        }

        mGraph.inject(object);
    }

}
