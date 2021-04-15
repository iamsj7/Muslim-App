package com.choubapp.muslimapp;

import android.content.SharedPreferences;

import android.os.Bundle;

import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NatureDikrActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_nature_dikr);

        ArrayList<Fadl> NatureDikr = new ArrayList<>();
        NatureDikr.add(new Fadl(getString(R.string.nature1), getString(R.string.nature1e)));
        NatureDikr.add(new Fadl(getString(R.string.nature2), getString(R.string.nature2e)));
        NatureDikr.add(new Fadl(getString(R.string.nature3), getString(R.string.nature3e)));
        NatureDikr.add(new Fadl(getString(R.string.nature4), getString(R.string.nature4e)));
        NatureDikr.add(new Fadl(getString(R.string.nature5), getString(R.string.nature5e)));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new FadlAdapter(NatureDikr);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
