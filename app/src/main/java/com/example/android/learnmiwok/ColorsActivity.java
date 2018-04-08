package com.example.android.learnmiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    WordAdapter wordAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> wordList = new ArrayList<Word>();
        wordList.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        wordList.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        wordList.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        wordList.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        wordList.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        wordList.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        wordList.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        wordList.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        wordAdapter = new WordAdapter(this, wordList, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (wordAdapter != null) {
            wordAdapter.stopMedia();
            wordAdapter.releaseFcous();
        }
    }
}
