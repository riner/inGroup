package com.riner.ingroup.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.riner.ingroup.Fragment.AbstractFragment;
import com.riner.ingroup.Fragment.Chat;
import com.riner.ingroup.Fragment.Announcement;
import com.riner.ingroup.Fragment.New;

import java.util.HashMap;
import java.util.Map;

public class TabFragmentAdapter  extends FragmentPagerAdapter{
    private Map<Integer, AbstractFragment> tabs;
    private Context context;

    public TabFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        tabs = new HashMap<>();
        tabs.put(0, Chat.getInstance(context));
        tabs.put(1, Announcement.getInstance(context));
        tabs.put(2, New.getInstance(context));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}

