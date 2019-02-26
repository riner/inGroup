package com.riner.ingroup.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;

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

        //Вывод текста на экран
        final TextView text = (TextView) view.findViewById(R.id.welcome_text);

        //Получение текста с поля Сообщение
        final EditText msg = (EditText) view.findViewById(R.id.msgtext);

        //Определение кнопки
        Button btn = (Button) view.findViewById(R.id.send_btn);

        //Вывод текста на главный экран
        text.setText(R.string.welcome_home_page);

        // Определение кнопки и действие кнопки
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text.setText(msg.getText());
            }
        });

        // Вывод view
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
