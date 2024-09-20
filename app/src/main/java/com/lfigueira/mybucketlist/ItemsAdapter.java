package com.lfigueira.mybucketlist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {

    private final Item[] items;

    public ItemsAdapter(Item[] items) {
        this.items = items;
    }



    @Override
    public int getItemCount() {
        return items.length;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
       holder.bind(items[position]);
       holder.itemView.setOnClickListener(v -> {
           Context context = v.getContext();

           Class<?> activityClass = items[position].getActivityClass();

           if (activityClass != null) {
               Intent intent = new Intent(context, activityClass);
               context.startActivity(intent);
           } else {
               Toast.makeText(context, "Activity not found for this item", Toast.LENGTH_SHORT).show();
           }
       });

    }

    static class ItemViewHolder extends RecyclerView.ViewHolder{

        private final ImageView itemImage;
        private final TextView itemTitle;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.image_view_list_item);
            itemTitle = itemView.findViewById(R.id.text_view_item_title);
        }

        public void bind(Item item){
            itemTitle.setText(item.name);
            itemImage.setImageResource(item.image);

        }

    }

}
