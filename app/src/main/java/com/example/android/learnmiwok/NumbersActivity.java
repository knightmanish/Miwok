package com.example.android.learnmiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbersList = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            numbersList.add(String.valueOf(i));
        }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbersList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
//
//
//        for (String number : numbersList) {
//            TextView textView = new TextView(this);
//            textView.setText(number);
//            linearLayout.addView(textView);
//            textView.setWidth(linearLayout.getWidth());
//            textView.setTextSize(32);
//            textView.setBackgroundColor(Color.LTGRAY);
//        }
    }
}
