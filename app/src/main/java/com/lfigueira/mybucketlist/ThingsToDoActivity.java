package com.lfigueira.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        RecyclerView thingsToDoList = findViewById(R.id.recycler_view_things_to_do);

        BucketListItem[] bucketListItems = {
                new BucketListItem("Learn a new language"),
                new BucketListItem("Attend a major music festival"),
                new BucketListItem("Go scuba diving in a coral reef"),
                new BucketListItem("Volunteer abroad for a month or longer"),
                new BucketListItem("Witness the Northern Lights"),
                new BucketListItem("Go on a photography expedition to capture stunning landscapes or wildlife")

        };

        BucketListItemAdapter adapter = new BucketListItemAdapter(bucketListItems);
        thingsToDoList.setAdapter(adapter);
    }
}