package com.example.nikhil.curieotest;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    Tab1 t1;
    Tab2 t2;
    Tab3 t3;
    Tab4 t4;
    Tab5 t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                viewPager.setCurrentItem(position, false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        t1 = new Tab1();
        t2 = new Tab2();
        t3 = new Tab3();
        t4 = new Tab4();
        t5 = new Tab5();
        //notifications = new Tab3();
        //settings = new Tab4();
        adapter.addFragment(t1, "Soups");
        adapter.addFragment(t2, "Rice");
        adapter.addFragment(t3,"Breads");
        adapter.addFragment(t4,"Curry");
        adapter.addFragment(t5,"Noodles");
        viewPager.setAdapter(adapter);
    }
}
