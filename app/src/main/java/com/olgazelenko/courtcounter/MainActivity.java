package com.olgazelenko.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int ONE_POINT = 1;
    final int TWO_POINTS = 2;
    final int THREE_POINTS = 3;

    TextView scoreTeamAView;
    TextView scoreTeamBView;

    public int scoreTeamA = 0;
    public int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamAView = findViewById(R.id.team_a);
        scoreTeamBView = findViewById(R.id.team_b);
    }
    /**
     * add three point score and displays updated score.
     */
    public void addThreePointsTeamA(View v)
    {
        scoreTeamA = scoreTeamA + THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }
    public void addThreePointsTeamB(View v)
    {
        scoreTeamB = scoreTeamB + THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    /**
     * add two point score and displays updated score.
     */
    public void addTwoPointsTeamA(View v)
    {
        scoreTeamA = scoreTeamA + TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointsTeamB(View v)
    {
        scoreTeamB = scoreTeamB + TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }
    /**
     * add one point score and displays updated score.
     */
    public void addOnePointsTeamA(View v)
    {
        scoreTeamA = scoreTeamA + ONE_POINT;
        displayForTeamA(scoreTeamA);
    }
    public void addOnePointsTeamB(View v)
    {
        scoreTeamB = scoreTeamB + ONE_POINT;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score.
     */
    public void displayForTeamA(int score) {
        scoreTeamAView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        scoreTeamBView.setText(String.valueOf(score));
    }

    public void resetScore(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
