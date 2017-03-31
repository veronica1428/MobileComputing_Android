package com.example.android.crimeintent;

import android.content.Context;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by veronica on 02/09/16.
 */
public class CrimeLab {

    private ArrayList<Crime> mCrimes;

    private static CrimeLab sCrimeLab;
    private Context myAppContext;

    private CrimeLab(Context appContext){
        myAppContext = appContext;
        mCrimes = new ArrayList<Crime>();

        //generating 100 crimes at object initiation
        for(int i=0; i<100; i++){
            Crime crime = new Crime();
            crime.setCrimeTitle("Crime #"+i);
            crime.setCrimeSolved(i%2==0);

            mCrimes.add(crime);
        }
    }

    public ArrayList<Crime> getCrimeList(){
        return mCrimes;
    }

    public static CrimeLab getCrimeLab(Context c){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
            return sCrimeLab;
        }
        return null;
    }

    private Crime getCrimeByID(UUID id){
        for(Crime c : mCrimes){
            if(c.getCrimeID().equals(id)){
                return c;
            }
        }
        return null;
    }
}
