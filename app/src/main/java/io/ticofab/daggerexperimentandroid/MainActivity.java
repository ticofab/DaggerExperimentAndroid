package io.ticofab.daggerexperimentandroid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import javax.inject.Inject;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject protected OneHelperClass mOneHelperClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.inject(this);

        setContentView(R.layout.activity_main);

        if (mOneHelperClass == null) {
            Log.d(TAG, "helper class is null");
        } else {
            Log.d(TAG, "helper class has been injected. What do you say? --> " + mOneHelperClass.helpMe());
        }
    }

}
