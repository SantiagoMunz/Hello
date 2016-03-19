package com.xingtingbao.xingtingbao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BaoxianMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baoxian_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_baoxian, new BaoxianMainFragment()).commit();
        }
    }

}
