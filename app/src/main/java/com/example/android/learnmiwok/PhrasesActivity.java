package com.example.android.learnmiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> wordList = new ArrayList<Word>();
        wordList.add(new Word("Where are you going?", "minto wuksus"));
        wordList.add(new Word("What is your name?", "tinnә oyaase'nә"));
        wordList.add(new Word("My name is...", "oyaaset..."));
        wordList.add(new Word("How are you feeling?", "michәksәs?"));
        wordList.add(new Word("I’m feeling good.", "kuchi achit"));
        wordList.add(new Word("Are you coming?", "әәnәs'aa?"));
        wordList.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        wordList.add(new Word("I’m coming.", "әәnәm"));
        wordList.add(new Word("Let’s go.", "yoowutis"));
        wordList.add(new Word("Come here.", "әnni'nem"));

        WordAdapter wordAdapter = new WordAdapter(this, wordList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
