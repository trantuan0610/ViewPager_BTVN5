package com.tuantran.viewpagertablayout_buoioir5_bi2.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tuantran.viewpagertablayout_buoioir5_bi2.Model.Item;
import com.tuantran.viewpagertablayout_buoioir5_bi2.Adapter.ItemAdapter;
import com.tuantran.viewpagertablayout_buoioir5_bi2.R;

import java.util.ArrayList;

public class Tab1_Fragment extends Fragment {
    RecyclerView recyclerView;
    ItemAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.fragmet_tab1,container,false);
       recyclerView=(RecyclerView) rootView.findViewById(R.id.recycle1);

       recyclerView.setLayoutManager( new LinearLayoutManager(getActivity()));

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Item1D"));
        items.add(new Item("Item1E"));
        items.add(new Item("Item1F"));
        items.add(new Item("Item1D"));
        items.add(new Item("Item1D"));
        items.add(new Item("Item1D"));
        items.add(new Item("Item1D"));
        adapter =new ItemAdapter(items,getContext());
        recyclerView.setAdapter(adapter);
        return rootView;

    }
}
