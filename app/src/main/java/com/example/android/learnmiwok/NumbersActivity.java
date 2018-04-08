package com.example.android.learnmiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> wordList = new ArrayList<Word>();

        wordList.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        wordList.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        wordList.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        wordList.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        wordList.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        wordList.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        wordList.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        wordList.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        wordList.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        wordList.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter wordAdapter = new WordAdapter(this, wordList, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
