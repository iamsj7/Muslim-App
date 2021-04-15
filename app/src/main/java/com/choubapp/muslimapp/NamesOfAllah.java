package com.choubapp.muslimapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NamesOfAllah extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private TextView mTextView;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences prefs = getSharedPreferences(MainActivity.THEME_KEY,0);
        int thm=AboutUs.getCurrentTheme(prefs);
        AboutUs.setCurrentTheme(this, thm);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names_of_allah);

        //ArrayList<String> Names = new ArrayList<>();
        List<String> names = Arrays.asList( "1", "2", "3","4","5","6","7","8","9","a","b","c","d","e",
                "f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U",
                "V","W","X","Y","Z","\"","#","$","%","&","'","(",")","*","+",",","-",".","/","0",":",
                ";","<","=",">","?","@","[","\\","]","^","_","`","{","|","}","~","¡","¢","£","¤","¥","¦","!");

        //List<String> names = Arrays.asList("الله","الودود","المعز","الله","الودود","المعز","الله","الودود","المعز","الله","الودود","المعز","الله","الودود","المعز","الله","الودود","المعز","الله","الودود","المعز","الله","الودود","المعز","الله","الودود","المعز");
        ArrayList<Names99> AllahNames = new ArrayList<>();
        for (int i =0; i<names.size(); i++){
            AllahNames.add(new Names99(names.get(i)));
        }
        //AllahNames.add(new Names99(getString(R.string.namesList)));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setClipChildren(false);
        mAdapter = new Names99Adapter(AllahNames);
        mLayoutManager = new GridLayoutManager(this, 3);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        //mRecyclerView.setLayoutManager(new RtlGridLayoutManager(this, 3));
        mRecyclerView.setAdapter(mAdapter);

    }
}
