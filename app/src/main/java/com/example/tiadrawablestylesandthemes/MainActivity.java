package com.example.tiadrawablestylesandthemes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score1, score2;
    private TextView tvScore1, tvScore2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScore1 = findViewById(R.id.score_1);
        tvScore2 = findViewById(R.id.score_2);


    }

    public void decreaseScore(View view) {
        int viewId = view.getId();

        switch (viewId){

            case R.id.decreaseTeam1:
                score1--;
                tvScore1.setText(String.valueOf(score1));
                break;
            case R.id.decreaseTeam2:
                score2--;
                tvScore2.setText(String.valueOf(score2));
                break;
        }

    }

    public void increaseScore(View view) {
        int viewId = view.getId();

        switch (viewId) {
            case R.id.increaseTeam1:
                score1++;
                tvScore1.setText(String.valueOf(score1));
                break;
            case R.id.increaseTeam2:
                score2++;
                tvScore2.setText(String.valueOf(score2));
                break;
        }
    }
}