package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;
import static com.example.android.courtcounter.R.id.teamAscore;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle bundle = this.getIntent().getExtras();


        TextView teamAName = (TextView) findViewById(R.id.finalTeamAName);
        TextView teamBName = (TextView) findViewById(R.id.finalTeamBName);
        TextView teamAScore = (TextView) findViewById(R.id.finalTeamAScore);
        TextView teamBScore = (TextView) findViewById(R.id.finalTeamBScore);


        String nameTeamA = bundle.getString("teamAName");
        String nameTeamB = bundle.getString("teamBName");
        String scoreTeamA = bundle.getString("teamAscore");
        String scoreTeamB = bundle.getString("teamBscore");


        teamAName.setText(nameTeamA);
        teamBName.setText(nameTeamB);
        teamAScore.setText(scoreTeamA);
        teamBScore.setText(scoreTeamB);

    }


    public void newGame(View v){

       // Intent intention = new Intent(this, Main2Activity.class);
       // startActivity(intention);

        startActivity(new Intent(getApplicationContext(),Main2Activity.class));  // same as startActivity(new Intent (this, Main2Activity.class));

    }
}
