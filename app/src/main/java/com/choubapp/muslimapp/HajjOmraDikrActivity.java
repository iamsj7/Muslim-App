package com.choubapp.muslimapp;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


import java.util.ArrayList;

public class HajjOmraDikrActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    LinearLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences prefs = getSharedPreferences(MainActivity.THEME_KEY,0);
        int thm=AboutUs.getCurrentTheme(prefs);
        AboutUs.setCurrentTheme(this, thm);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hajj_omra_dikr);

        ArrayList<Fadl> HajjOmraDikr = new ArrayList<>();
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj1), getString(R.string.hajj1e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj2), getString(R.string.hajj2e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj3), getString(R.string.hajj3e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj4), getString(R.string.hajj4e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj5), getString(R.string.hajj5e)));

        HajjOmraDikr.add(new Fadl(getString(R.string.hajj6), getString(R.string.hajj6e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj7), getString(R.string.hajj7e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj8), getString(R.string.hajj8e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj9), getString(R.string.hajj9e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj10), getString(R.string.hajj10e)));

        HajjOmraDikr.add(new Fadl(getString(R.string.hajj11), getString(R.string.hajj11e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj12), getString(R.string.hajj12e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj13), getString(R.string.hajj13e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj14), getString(R.string.hajj14e)));
        HajjOmraDikr.add(new Fadl(getString(R.string.hajj15), getString(R.string.hajj15e)));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new FadlAdapter(HajjOmraDikr);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
