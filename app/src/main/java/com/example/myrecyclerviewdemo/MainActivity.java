package com.example.myrecyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("David","Follow me in all my platforms", R.drawable.b));
        items.add(new Item("Susan","Hey guys, how are you",R.drawable.b));
        items.add(new Item("Lucky","Let go your almost done",R.drawable.c));
        items.add(new Item("Richard","This is some good work your doing",R.drawable.e));
        items.add(new Item("Kev","Be calm and chill",R.drawable.d));
        items.add(new Item("Sam","You was never by my side",R.drawable.f));
        items.add(new Item("Miles","Thank you for being there for me",R.drawable.g));
        items.add(new Item("KT","No why did you do that", R.drawable.b));
        items.add(new Item("Baby","It wasn't me who did that",R.drawable.b));
        items.add(new Item("Brother","No way that happened",R.drawable.c));
        items.add(new Item("Noel","Almost done with work",R.drawable.e));
        items.add(new Item("Brandon","Lets be honest",R.drawable.d));
        items.add(new Item("X","So thankful we got it because of you man",R.drawable.f));
        items.add(new Item("Erica","Talk to you later ",R.drawable.g));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}