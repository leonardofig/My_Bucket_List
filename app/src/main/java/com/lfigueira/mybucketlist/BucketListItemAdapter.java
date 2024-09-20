package com.lfigueira.mybucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListItemAdapter extends RecyclerView.Adapter<BucketListItemAdapter.BucketListItemViewHolder> {

    private final BucketListItem[] bucketListItems;

    public BucketListItemAdapter(BucketListItem[] bucketListItems) {
        this.bucketListItems = bucketListItems;
    }

    @Override
    public int getItemCount() {
        return bucketListItems.length;
    }

    @NonNull
    @Override
    public BucketListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bucket_list_item, parent,false);
        return new BucketListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListItemViewHolder holder, int position) {
        holder.bind(bucketListItems[position]);
    }


    static class BucketListItemViewHolder extends RecyclerView.ViewHolder{

        private final TextView itemName;

        public BucketListItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.text_view_item);
        }

        public void bind(BucketListItem bucketListItem) {
            itemName.setText(bucketListItem.name);
        }
    }

}

