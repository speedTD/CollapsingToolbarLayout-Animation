package com.developer.dinhduy.ui_animation;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity  {
    private List<Food> list =new ArrayList<>();
    private  FoodAdapter adapter;
    private RecyclerView recyclerView;
    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.id_recyclerview);
        toolbar=(Toolbar) findViewById(R.id.id_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbarLayout=(CollapsingToolbarLayout) findViewById(R.id.id_collap);
        collapsingToolbarLayout.setTitle("Dâu Tây <3");
        collapsingToolbarLayout.setContentScrimColor(Color.WHITE);
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        AddData();
        // sr
        adapter=new FoodAdapter(list,this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    private void AddData() {
        list.add(new Food(R.drawable.food1,"Foood1"));
        list.add(new Food(R.drawable.food2,"Foood2"));
        list.add(new Food(R.drawable.food3,"Foood3"));
        list.add(new Food(R.drawable.food4,"Foood4"));
        list.add(new Food(R.drawable.food5,"Foood5"));
        list.add(new Food(R.drawable.food6,"Foood6"));
        list.add(new Food(R.drawable.food7,"Foood7"));
        list.add(new Food(R.drawable.food8,"Foood8"));
        list.add(new Food(R.drawable.food9,"Foood9"));
        list.add(new Food(R.drawable.f10,"Foood10"));

    }
}
