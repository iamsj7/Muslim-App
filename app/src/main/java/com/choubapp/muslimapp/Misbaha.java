package com.choubapp.muslimapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Misbaha extends AppCompatActivity {
    TextView showcounter;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences prefs = getSharedPreferences(MainActivity.THEME_KEY,0);
        int thm=AboutUs.getCurrentTheme(prefs);
        AboutUs.setCurrentTheme(this, thm);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misbaha);
        SharedPreferences sp = getSharedPreferences("tallycounter", Activity.MODE_PRIVATE);
        int myIntValue = sp.getInt("counter", 0);
        showcounter=findViewById(R.id.counter_text);
        showcounter.setText(""+myIntValue);
    }
    public void reset(View v){
        showcounter=findViewById(R.id.counter_text);
        showcounter.setText("0");
        SharedPreferences sp = getSharedPreferences("tallycounter", Misbaha.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("counter", 0);
        editor.commit();
    }
    public void counter (View v){
        showcounter=findViewById(R.id.counter_text);
        count= 1 + Integer.parseInt((String) showcounter.getText()) ;
        showcounter.setText(""+count);
        SharedPreferences sp = getSharedPreferences("tallycounter", Misbaha.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("counter", count);
        editor.commit();
    }
}
