package com.riner.ingroup;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.riner.ingroup.adapter.TabFragmentAdapter;



public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initTab();
        initToolbar();

        TextView text  = (TextView) findViewById(R.id.textView4);
    }


    private void initTab(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        TabFragmentAdapter adapter = new TabFragmentAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabl);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);

        toolbar.setTitleTextColor(0xFFFFFFFF);
        toolbar.inflateMenu(R.menu.menu);
    }
}
