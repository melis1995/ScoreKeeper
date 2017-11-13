package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA;
    int scoreTeamB;
    public void pointA(View view) {
        scoreTeamA += 15;
        displayForTeamA(scoreTeamA);
        if (scoreTeamA==45)
        {
            displayForTeamA(40);
        }
        if (scoreTeamA>45)
        {
            displayForTeamA(40);
            TextView mTextView = (TextView) findViewById(R.id.gameA);
            mTextView.setText("GAME");
            scoreTeamA=0;
            scoreTeamB=0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
    }
    public void pointB(View view) {
        scoreTeamB += 15;
        displayForTeamB(scoreTeamB);
        if (scoreTeamB==45)
        {
            displayForTeamB(40);
        }
        if (scoreTeamB>45)
        {
            displayForTeamB(40);
            TextView mTextView = (TextView) findViewById(R.id.gameB);
            mTextView.setText("GAME");
            scoreTeamA=0;
            scoreTeamB=0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        }

    public void displayForTeamA(int scoreTeamA) {
        TextView scoreTeamAView = (TextView) findViewById(R.id.teamA);
        scoreTeamAView.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB(int scoreTeamB) {
        TextView scoreTeamBView = (TextView) findViewById(R.id.teamB);
        scoreTeamBView.setText(String.valueOf(scoreTeamB));
    }

}
