package com.leanhealhabits.workouts.workouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PhaseOneActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase_one);

        View phaseOneButton = this.findViewById(R.id.phase_one_wk_one_lb_one);
        phaseOneButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.phase_one_wk_one_lb_one:
                Intent i = new Intent(this, PhaseOneActivity.class);
                startActivity(i);
                break;

            //Additional buttons go heere
        }
    }

}
