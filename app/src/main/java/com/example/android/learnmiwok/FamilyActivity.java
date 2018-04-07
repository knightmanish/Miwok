package com.example.android.learnmiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> wordList = new ArrayList<Word>();
        wordList.add(new Word("father", "әpә", R.drawable.family_father));
        wordList.add(new Word("mother", "әṭa", R.drawable.family_mother));
        wordList.add(new Word("son", "angsi", R.drawable.family_son));
        wordList.add(new Word("daughter", "tune", R.drawable.family_daughter));
        wordList.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        wordList.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        wordList.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        wordList.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        wordList.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        wordList.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

        WordAdapter wordAdapter = new WordAdapter(this, wordList, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
