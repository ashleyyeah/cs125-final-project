package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wlist);
        // All of this is to make TextViews uneditable.
        TextView danc100 = findViewById(R.id.danc100);
        TextView thea110 = findViewById(R.id.thea110);
        TextView fr156 = findViewById(R.id.fr156);
        TextView muse250 = findViewById(R.id.muse250);
        TextView cpsc113 = findViewById(R.id.cpsc113);
        TextView glbl100 = findViewById(R.id.glbl100);
        TextView ansc250 = findViewById(R.id.ansc250);
        TextView scan251 = findViewById(R.id.scan251);
        TextView ger251 = findViewById(R.id.ger251);
        TextView rst242 = findViewById(R.id.rst242);

        danc100.setKeyListener(null);
        thea110.setKeyListener(null);
        fr156.setKeyListener(null);
        muse250.setKeyListener(null);
        cpsc113.setKeyListener(null);
        glbl100.setKeyListener(null);
        ansc250.setKeyListener(null);
        scan251.setKeyListener(null);
        ger251.setKeyListener(null);
        rst242.setKeyListener(null);
    }
}
