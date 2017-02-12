package com.example.glmvn.warplos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WarplosDetailFragment warplosDetailFragment = (WarplosDetailFragment)
                getFragmentManager().findFragmentById(R.id.detail_frag);
        warplosDetailFragment.setWarplosID(5);

    }


}
