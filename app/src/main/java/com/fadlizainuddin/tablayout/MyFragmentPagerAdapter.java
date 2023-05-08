package com.fadlizainuddin.tablayout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

// MyFragmentPagerAdapter ini berguna untuk merender 3 buah fragment

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private BeritaFragment _beritaFragment = new BeritaFragment();
    private ECommerceFragment _eCommerceFragment = new ECommerceFragment();
    private KampusFragment _kampusFragment = new KampusFragment();
    private Context _context;
    private int _tabCount;

//    Cara generate otomatis adalah klik kanan, pilih generate, constructor, pilih yang atas + ok, pilih context dan tabCount
    public MyFragmentPagerAdapter(@NonNull FragmentManager fm, Context _context, int _tabCount) {
        super(fm);
        this._context = _context;
        this._tabCount = _tabCount;
    }

//    GetItem berguna untuk fragment mana yang akan di loading, dari kiri dimulai dari 0.
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return _eCommerceFragment;
            case 1:
                return _beritaFragment;
            case 2:
                return _kampusFragment;
        }
        return null;
    }


    @Override
    public int getCount() {
        return _tabCount;
    }
}
