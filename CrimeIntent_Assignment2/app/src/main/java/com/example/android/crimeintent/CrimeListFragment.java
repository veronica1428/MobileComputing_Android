package com.example.android.crimeintent;

import android.app.ListFragment;
import android.os.Bundle;
import java.util.ArrayList;

/**
 * Created by veronica on 02/09/16.
 */
public class CrimeListFragment extends ListFragment{

    private ArrayList<Crime> mCrime;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        getActivity().setTitle(R.string.crime_title);

        mCrime = CrimeLab.getCrimeLab(getActivity()).getCrimeList();
    }
}
