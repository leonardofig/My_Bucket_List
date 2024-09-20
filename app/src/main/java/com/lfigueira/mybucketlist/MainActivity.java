package com.lfigueira.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();


    }

    private void setupClickListeners() {
        RecyclerView list = findViewById(R.id.recycler_view_items);

        Item[] items = {
                new Item("Things to do", R.drawable.things_to_do, ThingsToDoActivity.class),
                new Item("Places to go", R.drawable.places_to_go, PlacesToGoActivity.class)
        };

        ItemsAdapter adapter = new ItemsAdapter(items);
        list.setAdapter(adapter);
    }
}