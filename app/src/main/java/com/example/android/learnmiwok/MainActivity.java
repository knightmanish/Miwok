package com.example.android.learnmiwok;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NumbersActivity.class);
                if (intent != null) {
                    startActivity(intent);
                }
            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FamilyActivity.class);
                if (intent != null) {
                    startActivity(intent);
                }            }
        });
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ColorsActivity.class);
                if (intent != null) {
                    startActivity(intent);
                }            }
        });
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PhrasesActivity.class);
                if (intent != null) {
                    startActivity(intent);
                }            }
        });
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.numbers:
//                openNumbers(view);
//                break;
//            default:
//                break;
//        }
//    }

//    public void openNumbers(View view) {
////        Log.i("MainActiviy","in openNumbers");
//        Intent intent = new Intent(this, NumbersActivity.class);
//        if (intent != null) {
//            startActivity(intent);
//        }
//    }

//    public void openColors(View view) {
//        Intent intent = new Intent(this, ColorsActivity.class);
//        if (intent != null) {
//            startActivity(intent);
//        }
//    }
//
//    public void openFamily(View view) {
//        Intent intent = new Intent(this, FamilyActivity.class);
//        if (intent != null) {
//            startActivity(intent);
//        }
//    }
//
//    public void openPhrases(View view) {
//        Intent intent = new Intent(this, PhrasesActivity.class);
//        if (intent != null) {
//            startActivity(intent);
//        }
//    }
}
