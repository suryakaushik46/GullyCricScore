package com.example.testliquidslide1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class ViewPager extends FragmentPagerAdapter {
    public ViewPager(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        int x=position%2;
        switch(x){
            case 0:return new FragmentA();
            case 1:return new Fragment_B();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
