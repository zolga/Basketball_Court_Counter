package com.olgazelenko.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int ONE_POINT = 1;
    final int TWO_POINTS = 2;
    final int THREE_POINTS = 3;
    final String STATE_TEAM_A = "TEAM_A";
    final String STATE_TEAM_B = "TEAM_B";

    TextView scoreTeamAView;
    TextView scoreTeamBView;

    public int scoreTeamA;
    public int scoreTeamB;


    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_TEAM_A, scoreTeamA);
        outState.putInt(STATE_TEAM_B, scoreTeamB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt(STATE_TEAM_A);
        scoreTeamB = savedInstanceState.getInt(STATE_TEAM_B);
        setScore();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialStates();
        if (savedInstanceState == null) {
            scoreTeamA = 0;
            scoreTeamB = 0;
            setScore();
        }
    }

    /**
     * This method is called from the onCreate method and initial all the views.
     */
    private void initialStates() {
        scoreTeamAView = findViewById(R.id.team_a);
        scoreTeamBView = findViewById(R.id.team_b);
    }

    /**
     * This method displays current score of two teams.
     */
    private void setScore() {
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
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
    /**
     * Restore both teams score to zero.
     */
    public void resetScore(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
