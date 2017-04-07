package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // gets the xml layout of activity_main

        Bundle bundle = this.getIntent().getExtras(); // creates a new bundle object to get the intent and extras
        // from the former one
        TextView teamAId = (TextView) findViewById(R.id.teamADisplay);
        TextView teamBId = (TextView) findViewById(R.id.teamBDisplay);

        String teama = bundle.getString("teamA");
        String teamb = bundle.getString("teamB");


        teamAId.setText(teama);
        teamBId.setText(teamb);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    public void addThreeForTeamA(View v){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.teamAscore);

        scoreView.setText(String.valueOf(score));
    }

    public void addTwoForTeamA(View view){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }


    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.teamBscore);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View f){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view){
        scoreTeamB= scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

//    public void endGame(View v){
//        TextView finalTeamAName = (TextView) findViewById(R.id.teamADisplay);
//        TextView finalTeamAScore = (TextView) findViewById(R.id.teamAscore);
//        TextView finalTeamBName = (TextView) findViewById(R.id.teamBDisplay);
//        TextView finalTeamBScore = (TextView) findViewById(R.id.teamBscore);
//
//        Intent intent1 = new Intent(MainActivity.this, Main3Activity.class);
//
//        Bundle bundle = new Bundle();
//        bundle.putString("teamAName", String.valueOf(finalTeamAName.getText()));
//        bundle.putString("teamAscore", String.valueOf(finalTeamAScore.getText()));
//        bundle.putString("teamBName", String.valueOf(finalTeamBName.getText()));
//        bundle.putString("teamBscore", String.valueOf(finalTeamBScore.getText()));
//        intent1.putExtras(bundle);
//        startActivity(intent1);
//    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id1 = item.getItemId();
        if (id1 == R.id.newGame){

            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
            finish();
        }

        else if (id1 == R.id.finalScore){
            TextView finalTeamAName = (TextView) findViewById(R.id.teamADisplay);
        TextView finalTeamAScore = (TextView) findViewById(R.id.teamAscore);
        TextView finalTeamBName = (TextView) findViewById(R.id.teamBDisplay);
        TextView finalTeamBScore = (TextView) findViewById(R.id.teamBscore);

        Intent intent1 = new Intent(MainActivity.this, Main3Activity.class);

        Bundle bundle = new Bundle();
        bundle.putString("teamAName", String.valueOf(finalTeamAName.getText()));
        bundle.putString("teamAscore", String.valueOf(finalTeamAScore.getText()));
        bundle.putString("teamBName", String.valueOf(finalTeamBName.getText()));
        bundle.putString("teamBscore", String.valueOf(finalTeamBScore.getText()));
        intent1.putExtras(bundle);
        startActivity(intent1);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
