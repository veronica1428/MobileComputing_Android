package com.example.android.crimeintent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.util.Log;

public class CrimeActivity extends FragmentActivity {

    private static final String TAG = "CrimeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Inside onCreate method");

        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if(fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction()
                .add(R.id.fragmentContainer, fragment).commit();
        }
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "Inside onStart method");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "Inside onPause method");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "Inside onResume method");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Inside onDestroy method");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "Inside onStop method");
    }
}
