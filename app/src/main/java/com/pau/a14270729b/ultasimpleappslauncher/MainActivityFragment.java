package com.pau.a14270729b.ultasimpleappslauncher;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        View Botones [] = new View[]{view.findViewById(R.id.btn1),view.findViewById(R.id.button3)};

        for(View btn: Botones)
            btn.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn1:
                startActivity(new Intent("android.intent.action.CALL_TO_CRISTIAN_APP2"));
                break;
            case R.id.button3:
                startActivity(new Intent("android.intent.action.CALL_TO_CRISTIAN_APP1"));
                break;
        }
    }
}
