package com.example.android.soccerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int possessionTeamA = 50;
    int possessionTeamB = 50;
    int shotsA = 0;
    int shotsB = 0;
    int foulA = 0;
    int foulB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addThreePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * COde for reset button
     */

    public void reset(View view) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        possessionTeamA = 50;
        possessionTeamB = 50;
        shotsA = 0;
        shotsB = 0;
        foulA = 0;
        foulB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
        displayPossessionA(50);
        displayPossessionB(50);
        displayShotsA(0);
        displayShotsB(0);
        displayFoulA(0);
        displayFoulB(0);



    }

    /**
     * Code for the possession text
     */
    public void displayPossessionA(int possession) {
        TextView posessionView = (TextView) findViewById(R.id.possessionTeamA);
        posessionView.setText(String.valueOf(possession));


    }

    public void possessionAA(View view)
    {

        possessionTeamA = possessionTeamA + 1;
        displayPossessionA(possessionTeamA);

    }

    public void displayPossessionB (int possession) {
        TextView posessionView = (TextView) findViewById(R.id.possessionTeamB);
        posessionView.setText(String.valueOf(possession));


    }


    public void possessionBB(View view) {

        possessionTeamB = possessionTeamB + 1;
        displayPossessionB(possessionTeamB);

    }

    /**
     * Code for shots
     * @param shots
     */
    public void displayShotsA (int shots) {
        TextView shotsView = (TextView) findViewById(R.id.numberShotsA);
        shotsView.setText(String.valueOf(shots));
    }

    public void shotsAA(View view) {
        shotsA = shotsA + 1;
        displayShotsA(shotsA);
    }

    public void displayShotsB (int shots) {
        TextView shotsView = (TextView) findViewById(R.id.numberShotsB);
        shotsView.setText(String.valueOf(shots));
    }

    public void shotsBB (View view) {
        shotsB = shotsB + 1;
        displayShotsB(shotsB);
    }

    /**
     * Code for foul
     * @param foul
     */
    public void displayFoulA (int foul) {
        TextView foulView = (TextView) findViewById(R.id.numberFoulA);
        foulView.setText(String.valueOf(foul));


    }

    public void foulAA (View view) {
        foulA = foulA + 1;
        displayFoulA(foulA);
    }

    public void displayFoulB (int foul) {
        TextView foulView = (TextView) findViewById(R.id.numberFoulB);
        foulView.setText(String.valueOf(foul));


    }

    public void foulBB (View view) {
        foulB = foulB + 1;
        displayFoulB(foulB);
    }

}