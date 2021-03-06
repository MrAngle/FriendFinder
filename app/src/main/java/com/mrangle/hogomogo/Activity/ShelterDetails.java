package com.mrangle.hogomogo.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.mrangle.hogomogo.Adapter.ShelterListAdapter;
import com.mrangle.hogomogo.Functionalities.ShelterListData;
import com.mrangle.hogomogo.R;

import java.util.ArrayList;
import java.util.List;

public class ShelterDetails extends AppCompatActivity {
    ArrayList<ShelterListData> shelterListData;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // ...
        // Lookup the recyclerview in activity layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shelter_details);

        ShelterListData data =  (ShelterListData) getIntent().getSerializableExtra("Object");

        System.out.println(data.getName());
//        mRecyclerView = (findViewById(R.id.shelterDetails);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
//        mRecyclerView.setHasFixedSize(true);
//
//        // use a linear layout manager
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        shelterListData = ShelterListData.createContactsList(20);
//        // specify an adapter (see also next example)
//        mAdapter = new ShelterListAdapter(shelterListData);
//        mRecyclerView.setAdapter(mAdapter);
    }
}
