package com.example.rathore.assignment64;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Rathore on 3/29/2017.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {


    public TabsPagerAdapter(FragmentManager fm){super(fm);}

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0 :

                return new AudioFragment();
            case 1:

                return new VideoFragment();

        }


        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
