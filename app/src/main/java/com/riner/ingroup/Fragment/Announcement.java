package com.riner.ingroup.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.riner.ingroup.R;

public class Announcement extends AbstractFragment {

    private static  final  int LAYOUT = R.layout.announcement_fragment;

    public static  Announcement getInstance(Context context){

        Bundle args = new Bundle();
        Announcement fragment = new Announcement();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.Announcement_item));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        final TextView textView = (TextView) view.findViewById(R.id.announcement_welcome_text);

        textView.setText(R.string.announcement_welcome_text);

        FloatingActionButton fba = view.findViewById(R.id.fab);

        fba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Кнопка работает");
            }
        });

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
