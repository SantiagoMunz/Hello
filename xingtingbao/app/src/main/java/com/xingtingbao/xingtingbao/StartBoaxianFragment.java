package com.xingtingbao.xingtingbao;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by asus on 2016/3/19.
 */
public class StartBoaxianFragment extends Fragment {
    private Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.baoxian_startbaoxian, container, false);
        button = (Button) root.findViewById(R.id.btnStartBasicmap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.Basic2dmap"));
            }
        });
        return root;
    }
}
