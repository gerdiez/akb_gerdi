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
import android.widget.RelativeLayout;

public class MusicVideo extends Fragment {

    public MusicVideo(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.share, container, false);

        getActivity().setTitle("Music and Video Favourite");

        return view;
    }
}
