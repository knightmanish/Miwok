package com.example.android.learnmiwok;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbers(View view) {
//        Log.i("MainActiviy","in openNumbers");
        Intent intent = new Intent(this, NumbersActivity.class);
        if (intent != null) {
            startActivity(intent);
        }
    }

    public void openColors(View view) {
        Intent intent = new Intent(this, ColorsActivity.class);
        if (intent != null) {
            startActivity(intent);
        }
    }

    public void openFamily(View view) {
        Intent intent = new Intent(this, FamilyActivity.class);
        if (intent != null) {
            startActivity(intent);
        }
    }

    public void openPhrases(View view) {
        Intent intent = new Intent(this, PhrasesActivity.class);
        if (intent != null) {
            startActivity(intent);
        }
    }
}
