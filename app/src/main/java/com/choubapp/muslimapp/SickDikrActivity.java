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

public class SickDikrActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_sick_dikr);

        ArrayList<Fadl> SickDikr = new ArrayList<>();
        SickDikr.add(new Fadl(getString(R.string.sick1), getString(R.string.sick1e)));
        SickDikr.add(new Fadl(getString(R.string.sick2), getString(R.string.sick2e)));
        SickDikr.add(new Fadl(getString(R.string.sick3), getString(R.string.sick3e)));
        SickDikr.add(new Fadl(getString(R.string.sick4), getString(R.string.sick4e)));
        SickDikr.add(new Fadl(getString(R.string.sick5), getString(R.string.sick5e)));
        SickDikr.add(new Fadl(getString(R.string.sick6), getString(R.string.sick6e)));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new FadlAdapter(SickDikr);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
