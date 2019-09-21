package com.example.pohs.DashBoard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SectionPageDepterforSH extends FragmentPagerAdapter {
    public SectionPageDepterforSH(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Store store = new Store();
                return store;


            case 1:
                Orders orders = new Orders();
                return orders;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "STORE";
            case 1:
                return "ORDERS";
            default:
                return null;
        }


    }
}
