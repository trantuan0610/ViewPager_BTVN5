package com.tuantran.viewpagertablayout_buoioir5_bi2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.tuantran.viewpagertablayout_buoioir5_bi2.Fragment.Tab1_Fragment;
import com.tuantran.viewpagertablayout_buoioir5_bi2.Fragment.Tab2_Fragment;
import com.tuantran.viewpagertablayout_buoioir5_bi2.Fragment.Tab3_Fragment;

public class MyViewpagerAdapter extends FragmentStateAdapter {

    public MyViewpagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
      switch (position){
          case 0:
              return new Tab1_Fragment();
          case 1:
              return new Tab2_Fragment();
          case 2:
              return new Tab3_Fragment();
          default:
              return new Tab1_Fragment();
      }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
