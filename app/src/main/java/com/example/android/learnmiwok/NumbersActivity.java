package com.example.android.learnmiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        ArrayList<Word> wordList = new ArrayList<Word>();
        for (int i = 0; i < 1000; i++) {
            wordList.add(new Word(String.valueOf(i), String.valueOf(i)));
        }

        WordAdapter wordAdapter = new WordAdapter(this, wordList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
