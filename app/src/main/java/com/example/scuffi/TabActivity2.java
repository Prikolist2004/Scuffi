package com.example.scuffi;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.scuffi.ui.main.SectionsPagerAdapter;
import com.example.scuffi.databinding.ActivityTab2Binding;

public class TabActivity2 extends AppCompatActivity {

    private ActivityTab2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTab2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = binding.fab;
        tabs.getTabAt(0).setIcon(R.drawable.homeactiv);
        tabs.getTabAt(1).setIcon(R.drawable.heart);
        tabs.getTabAt(2).setIcon(R.drawable.bug);
        tabs.getTabAt(3).setIcon(R.drawable.notif);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            private int previousPage = viewPager.getCurrentItem();
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


            }

            @Override
            public void onPageSelected(int position) {
                switch (previousPage) {
                    case 0:
                        tabs.getTabAt(0).setIcon(R.drawable.homenoactiv);
                        break;
                    case 1:
                        tabs.getTabAt(1).setIcon(R.drawable.heart);
                        break;
                    case 2:
                        tabs.getTabAt(2).setIcon(R.drawable.bug);
                        break;
                    case 3:
                        tabs.getTabAt(3).setIcon(R.drawable.notif);
                        break;
                }
                switch (position) {
                    case 0:
                        tabs.getTabAt(0).setIcon(R.drawable.homeactiv);
                        break;
                    case 1:
                        tabs.getTabAt(1).setIcon(R.drawable.heartactiv);
                        break;
                    case 2:
                        tabs.getTabAt(2).setIcon(R.drawable.bugactiv);
                        break;
                    case 3:
                        tabs.getTabAt(3).setIcon(R.drawable.notifactiv);
                        break;
                }
                previousPage = position;

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}