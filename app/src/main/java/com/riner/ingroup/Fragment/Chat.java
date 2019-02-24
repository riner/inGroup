package com.riner.ingroup.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.riner.ingroup.R;

public class Chat extends AbstractFragment {

    private static  final  int LAYOUT = R.layout.chat_fragment;
    public static Chat getInstance(Context context){
        Bundle args = new Bundle();
        Chat fragment = new Chat();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.Chat_item));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
