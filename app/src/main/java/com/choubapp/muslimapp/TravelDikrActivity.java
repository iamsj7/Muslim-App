package com.choubapp.muslimapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class TravelDikrActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_travel_dikr);

        ArrayList<Fadl> TravelDikr = new ArrayList<>();
        TravelDikr.add(new Fadl(getString(R.string.travel1), getString(R.string.travel1e)));
        TravelDikr.add(new Fadl(getString(R.string.travel2), getString(R.string.travel2e)));
        TravelDikr.add(new Fadl(getString(R.string.travel3), getString(R.string.travel3e)));
        TravelDikr.add(new Fadl(getString(R.string.travel4), getString(R.string.travel4e)));
        TravelDikr.add(new Fadl(getString(R.string.travel5), getString(R.string.travel5e)));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new FadlAdapter(TravelDikr);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
