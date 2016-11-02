package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // scores
    private int mTeamAScore;
    private int mTeamBScore;

    // views
    private Button mTeamAAddThreePointsButton;
    private Button mTeamAAddTwoPointsButton;
    private Button mTeamAAddFreeThrowButton;

    private TextView mTeamAScoreTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTeamAScore = 0;
        mTeamBScore = 0;

        mTeamAScoreTV = (TextView) findViewById(R.id.teamAScoreTV);

        mTeamAAddThreePointsButton = (Button) findViewById(R.id.teamAThreePointsButton);
        mTeamAAddThreePointsButton.setOnClickListener(this);

        mTeamAAddTwoPointsButton = (Button) findViewById(R.id.teamATwoPointsButton);
        mTeamAAddTwoPointsButton.setOnClickListener(this);

        mTeamAAddFreeThrowButton = (Button) findViewById(R.id.teamAFreeThrowButton);
        mTeamAAddFreeThrowButton.setOnClickListener(this);

    }

    private void updateTeamAScore(){
        mTeamAScoreTV.setText(String.valueOf(mTeamAScore));
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.teamAThreePointsButton:
                mTeamAScore += 3;
                updateTeamAScore();
                break;

            case R.id.teamATwoPointsButton:
                mTeamAScore += 2;
                updateTeamAScore();
                break;

            case R.id.teamAFreeThrowButton:
                mTeamAScore++;
                updateTeamAScore();
                break;
        }
    }
}
