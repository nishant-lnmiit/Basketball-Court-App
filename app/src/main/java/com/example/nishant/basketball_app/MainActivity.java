package com.example.nishant.basketball_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsToA(View view)
    {
        score= score + 3;
        displayA(score);
    }

    public void twoPointsToA(View view)
    {
        score= score + 2;
        displayA(score);
    }

    public void onePointToA(View view)
    {
        score= score + 1;
        displayA(score);
    }

    public void displayA(int var)
    {
        TextView dis = (TextView)findViewById(R.id.score_update);
        dis.setText(String.valueOf(var));
    }

    public void threePointsToB(View view)
    {
        scoreB= scoreB + 3;
        displayB(scoreB);
    }

    public void twoPointsToB(View view)
    {
        scoreB= scoreB + 2;
        displayB(scoreB);
    }

    public void onePointToB(View view)
    {
        scoreB= scoreB + 1;
        displayB(scoreB);
    }

    public void displayB(int dar)
    {
        TextView disB = (TextView)findViewById(R.id.scoreB_update);
        disB.setText(String.valueOf(dar));
    }

    public void reset(View view)
    {
        score= 0;
        scoreB=0;
        displayA(score);
        displayB(scoreB);
        TextView resC = (TextView)findViewById(R.id.winner);
        resC.setText("thank you for playing !!!");

    }
    public void result(View view)
    {
        results(score,scoreB);
    }
    public void results(int var , int dar )
    {
        if(var>dar)
        {
            TextView resA = (TextView)findViewById(R.id.winner);
            resA.setText("Team A is Winner");

        }
        else
        {
            TextView resB = (TextView)findViewById(R.id.winner);
            resB.setText("Team B is Winner");
        }
    }



}
