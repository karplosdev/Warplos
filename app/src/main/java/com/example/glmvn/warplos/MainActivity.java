package com.example.glmvn.warplos;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements WarplosListFragment.WarPlosListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void itemClicked(long id) {
        View fragmentContaner = findViewById(R.id.fragment_container);
        if (fragmentContaner != null) {
            WarplosDetailFragment detailFragment = new WarplosDetailFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            detailFragment.setWarplosID(id);
            fragmentTransaction.replace(R.id.fragment_container, detailFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransaction.commit();
        }else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_WARPLOS_ID, (int)id);
            startActivity(intent);
        }
    }
}
