package com.example.android.crimeintent;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.example.android.crimeintent.Crime;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.text.TextWatcher;
import android.text.Editable;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.util.Log;

/**
 * Created by veronica on 30/08/16.
 */
public class CrimeFragment extends Fragment{
    private Crime mCrime;
    private EditText mCrimeTitleHint;
    //private TextView mCrimeTitleLabel;
    //private TextView mCrimeDetailLabel;
    private Button mCrimeDateButton;
    private CheckBox mCrimeSolvedCheckbox;

    private static final String TAG = "CrimeFragment";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Inside onCreate method");
        mCrime = new Crime();
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "Inside onStart method");
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        Log.d(TAG, "Inside onAttach method");
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
    public void onDestroyView(){
        super.onDestroyView();
        Log.d(TAG, "Inside onDestroyView method");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "Inside onStop method");
    }

    @Override
    public void onDetach(){
        super.onDetach();
        Log.d(TAG, "Inside onDetach method");
    }

    @Override
    public void onActivityCreated(Bundle savedBundleInstance){
        super.onActivityCreated(savedBundleInstance);
        Log.d(TAG, "Inside onActivityCreated method");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, parent, savedInstanceState);
        Log.d(TAG, "Inside onCreateView method");

        View v = inflater.inflate(R.layout.fragment_crime, parent, false);

        mCrimeTitleHint = (EditText) v.findViewById(R.id.crime_title);
        mCrimeTitleHint.addTextChangedListener(new TextWatcher(){
            public void onTextChanged(CharSequence ch, int start, int end, int count){
                mCrime.setCrimeTitle(ch.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }

            public void beforeTextChanged(CharSequence ch, int start, int end, int count) {
            }

        });

        mCrimeDateButton = (Button) v.findViewById(R.id.date_buttonID);
        mCrimeDateButton.setText(mCrime.getCrimeDate().toString());
        mCrimeDateButton.setEnabled(false);

        mCrimeSolvedCheckbox = (CheckBox) v.findViewById(R.id.solved_checkboxID);
        mCrimeSolvedCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                    mCrime.setCrimeSolved(isChecked);
            }
        });

        return v;
    }


}
