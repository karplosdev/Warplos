package com.example.glmvn.warplos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_WARPLOS_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WarplosDetailFragment warplosDetailFragment = (WarplosDetailFragment)
                getFragmentManager().findFragmentById(R.id.detail_frag);
        int warplosId = (int) getIntent().getExtras().get(EXTRA_WARPLOS_ID);
        warplosDetailFragment.setWarplosID(warplosId);
    }
}
