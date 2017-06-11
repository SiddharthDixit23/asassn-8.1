package com.acadgild.siddharth.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ListView mlv;
    private Button mb,mr;
    String[] subject = new String[]{"English","Hindi","Maths","Alphabet","Computers","Zebra"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mr = (Button)findViewById(R.id.button2);
        mb = (Button)findViewById(R.id.button);
        mlv = (ListView)findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,subject);
        mlv.setAdapter(adapter);
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arrays.sort(subject);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,subject);
                mlv.setAdapter(adapter);
            }
        });

        mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arrays.sort(subject, Collections.reverseOrder());
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,subject);
                mlv.setAdapter(adapter);
            }
        });
    }
}
