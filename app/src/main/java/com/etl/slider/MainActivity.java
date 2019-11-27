package com.etl.slider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {


    private ViewPager viewPager;

    private Adapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        viewPager=findViewById(R.id.viewpager);

        myadapter = (Adapter) new SlideAdapter(this);
        viewPager.setAdapter((PagerAdapter) myadapter);
    }
}
