package com.xingtingbao.xingtingbao;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class BaoxianMainFragment extends Fragment {

    public BaoxianMainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_baoxian_main, container, false);
        rootView.findViewById(R.id.btnstartbaoxian_tcm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().addToBackStack(null)
                        .replace(R.id.fragment_baoxian, new StartBoaxianFragment())
                        .commit();
            }
        });
        rootView.findViewById(R.id.btnUpdateInformation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().addToBackStack(null)
                        .replace(R.id.fragment_baoxian, new UpdateInformation())
                        .commit();
            }
        });
        return rootView;
    }
}


