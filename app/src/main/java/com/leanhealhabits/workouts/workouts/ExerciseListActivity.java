package com.leanhealhabits.workouts.workouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExerciseListActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);


    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
/*
            case R.id.exercise_phases:
                i = new Intent(this, ExercisePhasesActivity.class);
                startActivity(i);
                break;

            case R.id.fourhourbody:
                i = new Intent(this, FourHourBodyActivity.class);
                startActivity(i);
                break;
*/
            //Additional buttons go heere
        }
    }
}
