package com.lfigueira.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);

        RecyclerView thingsToDoList = findViewById(R.id.recycler_view_places_to_go);

        BucketListItem[] bucketListItems = {
                new BucketListItem("Machu Picchu - Peru"),
                new BucketListItem("Sistine Chapel - Vatican"),
                new BucketListItem("Venice - Italy"),
                new BucketListItem("San Francisco - USA"),
                new BucketListItem("Santorini - Greece"),
                new BucketListItem("Bora Bora - French Polynesia"),
                new BucketListItem("Bagan, Myanmar")
        };

        BucketListItemAdapter adapter = new BucketListItemAdapter(bucketListItems);
        thingsToDoList.setAdapter(adapter);
    }
}