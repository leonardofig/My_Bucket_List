package com.lfigueira.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();

    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("New language","Expand your horizons and connect with different cultures!",R.drawable.learn_new_language,4.5f),
                new BucketListEntry("Music festival","Immerse yourself in a live music and experience a diverse lineup of artists.",R.drawable.music_festival,4),
                new BucketListEntry("Scuba diving","Explore the underwater world and witness the beauty of coral reefs.",R.drawable.coral_reefs,4.5f),
                new BucketListEntry("Volunteer","Make a meaningful contribution to a community in need.",R.drawable.volunteer,4),
                new BucketListEntry("Northern Lights","Experience the magical dance of colors in the night sky.",R.drawable.aurora_borealis,5),
                new BucketListEntry("Photo expedition","Embark on an adventure to document the beauty of nature through your lens.",R.drawable.photography_expedition,3.5f)

        };

        RecyclerView thingsToDoList = findViewById(R.id.recycler_view_things_to_do);

        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        thingsToDoList.setAdapter(adapter);
    }
}