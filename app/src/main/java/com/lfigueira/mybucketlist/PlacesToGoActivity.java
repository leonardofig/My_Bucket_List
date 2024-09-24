package com.lfigueira.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();

    }

    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Machu Picchu - Peru","Lost city of the Incas high in the Andes.",R.drawable.machu_pichu,5),
                new BucketListEntry("Sistine Chapel - Vatican","Michelangelo's masterpiece of Renaissance art.",R.drawable.sistine_chapel,3.5f),
                new BucketListEntry("Venice - Italy","Romantic canals, gondolas, and historic bridges.",R.drawable.venice,4),
                new BucketListEntry("San Francisco - USA","Iconic Golden Gate Bridge and vibrant culture.",R.drawable.san_francisco,5),
                new BucketListEntry("Santorini - Greece","Stunning sunsets and white-washed villages.",R.drawable.santorini,4),
                new BucketListEntry("Bora Bora - French Polynesia","Overwater bungalows and turquoise waters.",R.drawable.bora_bora,4.5f),
                new BucketListEntry("Bagan, Myanmar","Thousands of ancient temples and pagodas.",R.drawable.bagan_myanmar,5)
        };

        RecyclerView placesToDoList = findViewById(R.id.recycler_view_places_to_go);

        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        placesToDoList.setAdapter(adapter);
    }
}