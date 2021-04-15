package com.choubapp.muslimapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RestOfDikr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences prefs = getSharedPreferences(MainActivity.THEME_KEY,0);
        int thm=AboutUs.getCurrentTheme(prefs);
        AboutUs.setCurrentTheme(this, thm);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_of_dikr);
    }
    public void salat(View v){
        Intent intent= new Intent(this,SalatDikrActivity.class);
        startActivity(intent);
    }
    public void adhan(View v){
        Intent intent= new Intent(this,AdhanDikrActivity.class);
        startActivity(intent);
    }
    public void mosque(View v){
        Intent intent= new Intent(this,MosqueDikrActivity.class);
        startActivity(intent);
    }
    public void ablution(View v){
        Intent intent= new Intent(this,WuduuDikrActivity.class);
        startActivity(intent);
    }
    public void food(View v){
        Intent intent= new Intent(this,FoodDikrActivity.class);
        startActivity(intent);
    }
    public void travel(View v){
        Intent intent= new Intent(this,TravelDikrActivity.class);
        startActivity(intent);
    }
    public void hajjomra(View v){
        Intent intent= new Intent(this,HajjOmraDikrActivity.class);
        startActivity(intent);
    }
    public void home(View v){
        Intent intent= new Intent(this,HomeDikrActivity.class);
        startActivity(intent);
    }
    public void sickness(View v){
        Intent intent= new Intent(this,SickDikrActivity.class);
        startActivity(intent);
    }
    public void nature(View v){
        Intent intent= new Intent(this,NatureDikrActivity.class);
        startActivity(intent);
    }
}
