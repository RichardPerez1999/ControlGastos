package com.example.controldegastos.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.controldegastos.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1);
        switch ( position){
            case 0:
                DiaFragment diaFragment= new DiaFragment(mContext);
                return diaFragment;
            case 1:
                MesFragment mesFragment= new MesFragment();
                return mesFragment;
        }
        return  null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch ( position){
            case 0:
                return "Dia";
            case 1:
                return "mes";
        }
        return  null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}