package com.tuantran.viewpagertablayout_buoioir5_bi2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tuantran.viewpagertablayout_buoioir5_bi2.Model.Item;
import com.tuantran.viewpagertablayout_buoioir5_bi2.R;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    ArrayList<Item> items ;
    Context context;

    public ItemAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View  itemView = layoutInflater.inflate(R.layout.item_list,parent,false);

        return new ItemViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.tv1.setText(items.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
            TextView tv1 ;
            public ItemViewHolder(@NonNull View itemView) {
                super(itemView);
                tv1 = (TextView) itemView.findViewById(R.id.txtTen);

            }
        }
}
