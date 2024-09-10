package com.example.moodleui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new USTHHome();
            case 1:
                return new Notifacations_Fragment();
            case 2:
                return new CalenderFragment();
            case 3:
                return new SiteBlog_Fragment();
            case 4:
                return new More_Fragment();
            default:
                return new USTHHome();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }
}