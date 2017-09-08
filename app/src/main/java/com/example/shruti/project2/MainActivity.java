package com.example.shruti.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    int x=0;

    public void ptsa3(View view)
    {
        x=x+3;
        displayForTeamA(x);
    }

    public void ptsa6(View view)
    {
        x=x+6;
        displayForTeamA(x);
    }

    public void ptsa1(View view)
    {
        x=x+1;
        displayForTeamA(x);
    }
    public void foula2(View view)
    {
        y=y+2;
        displayForTeamB(y);
    }

    /** for team b*/
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    int y=0;

    public void ptsb3(View view)
    {
        y=y+3;
        displayForTeamB(y);
    }

    public void ptsb6(View view)
    {
        y=y+6;
        displayForTeamB(y);
    }

    public void ptsb1(View view)
    {
        y=y+1;
        displayForTeamB(y);
    }
    public void foulb2(View view)
    {
        x=x+2;
        displayForTeamA(x);
    }

    int z=0;
    public void reset(View view)
    {
        displayForTeamA(z);
        displayForTeamB(z);

    }


}
