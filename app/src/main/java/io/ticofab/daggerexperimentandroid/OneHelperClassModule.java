package io.ticofab.daggerexperimentandroid;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Copyright 2015 Hengroen
 * Created by fabiotiriticco on 25/03/15.
 */
@Module(
        injects = {
                MainActivity.class,
                OneHelperClass.class
        }
)
public class OneHelperClassModule {
    @Singleton
    @Provides
    public OneHelperClass provideOneHelperClass() {
        return new OneHelperClass();
    }

    @Singleton
    @Provides
    public AnotherHelperClass provideAnotherHelperClass() {
        return new AnotherHelperClass();
    }
}
