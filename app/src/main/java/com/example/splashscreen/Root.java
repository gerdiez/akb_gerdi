package com.example.splashscreen;
/**nama : Gerdi Abdi Salam
 * Kelas : AKB-11
 * nim : 10116474
 * tgl_pengerjaan : 30 April 2019
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Root extends Fragment {

    public Root(){}
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.root, container, false);

        getActivity().setTitle("Gerdi Apps");

        return rootView;
    }
}