package com.pinguo.random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

    private static String[] mems = {"王勤龙", "车星", "唐松", "马睿", "何林峰", "刘博", "殷宇", "谢朝军", "王朋", "曾传猛", "周为"};




    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        tv = (TextView)findViewById(R.id.text);
        btn = (Button)findViewById(R.id.btn);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < mems.length; i++) {
            sb.append(mems[i]);
            sb.append(", ");
        }

        tv.setText(sb.toString());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(mems[getRandom(mems.length)]);
            }
        });
    }

    private int getRandom(int max) {
        return (int)(System.currentTimeMillis() % max);
    }


}
