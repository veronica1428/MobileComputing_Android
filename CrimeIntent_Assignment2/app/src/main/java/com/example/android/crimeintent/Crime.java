package com.example.android.crimeintent;

import java.util.UUID;
import java.util.Date;

/**
 * Created by veronica on 30/08/16.
 */
public class Crime {
    private UUID mCrimeID ;
    private String mCrimeTitle;
    private Date mCrimeDate;
    private boolean mCrimeSolved;

    public Crime(){
        //Generate unique identifiers
        mCrimeID = UUID.randomUUID();
        mCrimeDate = new Date();
    }

    public void setCrimeID(UUID id){
        this.mCrimeID = id;
    }

    public UUID getCrimeID(){
        return this.mCrimeID;
    }

    public void setCrimeTitle(String title){
        this.mCrimeTitle = title;
    }

    public String getCrimeTitle(){
        return this.mCrimeTitle;
    }

    public void setCrimeDate(Date date){
        this.mCrimeDate = date;
    }

    public Date getCrimeDate(){
        return this.mCrimeDate;
    }

    public void setCrimeSolved(boolean isSolved){
        this.mCrimeSolved = isSolved;
    }

    public boolean getCrimeSolved(){
        return this.mCrimeSolved;
    }
}
