package com.riner.ingroup.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.riner.ingroup.R;

public class New extends AbstractFragment {

    private static final int LAYOUT = R.layout.new_fragment;

    public static  New getInstance(Context context){
        Bundle args = new Bundle();
        New fragment = new New();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.New_item));
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        TextView textView = (TextView) view.findViewById(R.id.new_welcome_text);

        textView.setText(R.string.new_welcome_text);

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
