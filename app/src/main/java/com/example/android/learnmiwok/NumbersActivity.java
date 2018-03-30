package com.example.android.learnmiwok;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.rootView);

        ArrayList<String> numbersList = new ArrayList<String>();

        for(int i = 0; i < 1000; i++){
            numbersList.add(String.valueOf(i));
        }

        for (String number : numbersList) {
            TextView textView = new TextView(this);
            textView.setText(number);
            linearLayout.addView(textView);
            textView.setWidth(linearLayout.getWidth());
            textView.setTextSize(32);
            textView.setBackgroundColor(Color.LTGRAY);
        }
    }
}
