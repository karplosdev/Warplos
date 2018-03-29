package com.example.glmvn.warplos;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link ListFragment} subclass.
 */
public class WarplosListFragment extends ListFragment {

     interface WarPlosListListener{
        void itemClicked(long id);
    }

    private WarPlosListListener listListener;

    public WarplosListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] nama = new String[WarPlosData.warplosdata.length];
        for (int i = 0; i < nama.length; i++){
            nama [i] = WarPlosData.warplosdata[i].getmName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1 , nama
        );
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listListener = (WarPlosListListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listListener != null){
            listListener.itemClicked(id);
        }
    }
}
