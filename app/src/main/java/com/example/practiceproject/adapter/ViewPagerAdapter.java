package com.example.practiceproject.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.practiceproject.fragments.FragmentHome;
import com.example.practiceproject.fragments.FragmentPerson;
import com.example.practiceproject.fragments.FragmentSetting;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentHome();
            case 1:
                return new FragmentPerson();
            case 2:
                return new FragmentSetting();
        }
        return new FragmentHome();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
