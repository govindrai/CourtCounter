package com.govindrai.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    public static int teamAScore = 0;
    public static int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increasePoints(View view) {
        String id = getResources().getResourceEntryName(view.getId());
        System.out.println("ID HERE:" + id);

        switch (id) {
            case "three_pointer_button_a":
                teamAScore += 3;
                break;
            case "three_pointer_button_b":
                teamBScore += 3;
                break;
            case "two_pointer_button_a":
                teamAScore += 2;
                break;
            case "two_pointer_button_b":
                teamBScore += 2;
                break;
            case "free_throw_button_a":
                teamAScore += 1;
                break;
            case "free_throw_button_b":
                teamBScore += 1;
                break;
            default:
                System.out.println("I got an id for which I have no idea what to do");
                break;
        }

        updateScores();
    }

    public void updateScores() {
        TextView teamAScoreTextView = (TextView) findViewById(R.id.team_a_score_textview);
        teamAScoreTextView.setText(String.valueOf(teamAScore));
        TextView teamBScoreTextView = (TextView) findViewById(R.id.team_b_score_textview);
        teamBScoreTextView.setText(String.valueOf(teamBScore));
    }

    public void resetScores(View view) {
        teamAScore = teamBScore = 0;
        updateScores();
    }
}

