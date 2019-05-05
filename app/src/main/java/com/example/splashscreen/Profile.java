package com.example.splashscreen;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Profile extends Fragment {

    /**nama : Gerdi Abdi Salam
     * Kelas : AKB-11
     * nim : 10116474
     * tgl_pengerjaan : 30 April 2019
     */

    public Profile(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.profile, container, false);

        getActivity().setTitle("Profile");

        ImageButton btn_about = (ImageButton) view.findViewById(R.id.btn_about);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AboutActivity.class);
                startActivity(i);
            }
        });
        ImageButton btn_map = (ImageButton) view.findViewById(R.id.btn_map);
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com/maps/place/Jl.+Sukarajin,+Gandasari,+Katapang,+Bandung,+Jawa+Barat+40921/@-7.01993,107.5484564,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68ec226846e547:0x97f054d1f3cc7b2c!8m2!3d-7.0199353!4d107.5506451"));
                startActivity(i);
            }
        });
        return view;
    }
}
