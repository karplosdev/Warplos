package com.example.glmvn.warplos;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WarplosDetailFragment extends Fragment {
    private long warplosID;

    public WarplosDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null){
            warplosID = savedInstanceState.getLong("warplosID");
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_warplos_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null){
            TextView title =  view.findViewById(R.id.textTittle);
            WarPlosData warPlosData = WarPlosData.warplosdata[(int) warplosID];
            title.setText(warPlosData.getmName());
            TextView description = view.findViewById(R.id.textDescription);
            description.setText(warPlosData.getmDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putLong("warplosID",warplosID);
    }

    public void setWarplosID(long id){
        this.warplosID = id;
  }
}
