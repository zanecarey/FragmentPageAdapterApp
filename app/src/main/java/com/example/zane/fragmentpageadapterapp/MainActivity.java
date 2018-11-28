package com.example.zane.fragmentpageadapterapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsStagePagerAdapter adapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        adapter = new SectionsStagePagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);

        setUpViewPager(mViewPager);

    }

    private void setUpViewPager(ViewPager viewPager){
        SectionsStagePagerAdapter adapter = new SectionsStagePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "Fragment1");
        adapter.addFragment(new Fragment2(), "Fragment2");
        adapter.addFragment(new Fragment3(), "Fragment3");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
