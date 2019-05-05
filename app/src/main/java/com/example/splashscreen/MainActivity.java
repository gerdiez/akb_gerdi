package com.example.splashscreen;

/**nama : Gerdi Abdi Salam
 * Kelas : AKB-11
 * nim : 10116474
 * tgl_pengerjaan : 30 April 2019
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private int waktu_loading=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah splash screen masuk ke walktrough / home
                Intent walktrough=new Intent(MainActivity.this, walktrough.class);
                startActivity(walktrough);
                finish();
            }
        },waktu_loading);
    }
}
