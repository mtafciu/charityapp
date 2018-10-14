package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class InterestsActivity extends Activity {
    Button btn_proceed;
    CheckBox cb_Animals;
    CheckBox cb_Children;
    CheckBox cb_Education;
    CheckBox cb_Environment;
    CheckBox cb_Health;
    CheckBox cb_HumanRights;
    CheckBox cb_Elderly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_interests);

        btn_proceed = findViewById(R.id.btn_proceed);
        btn_proceed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(InterestsActivity.this, VolunteerActivity.class);
                startActivity(intent);
            }
        });

        cb_Animals = findViewById(R.id.cb_Animals);
        cb_Animals.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                    cb_Animals.setChecked(true);

            }
        });

        cb_Children = findViewById(R.id.cb_Children);
        cb_Children.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                    cb_Children.setChecked(true);

            }
        });

        cb_Education = findViewById(R.id.cb_Education);
        cb_Education.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                    cb_Education.setChecked(true);

            }
        });

        cb_Environment = findViewById(R.id.cb_Environment);
        cb_Environment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                    cb_Environment.setChecked(true);

            }
        });

        cb_Health = findViewById(R.id.cb_Health);
        cb_Health.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                    cb_Health.setChecked(true);

            }
        });

        cb_HumanRights = findViewById(R.id.cb_HumanRights);
        cb_HumanRights.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                    cb_HumanRights.setChecked(true);
            }

        });

        cb_Elderly = findViewById(R.id.cb_Elderly);
        cb_Elderly.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                    cb_Elderly.setChecked(true);

            }
        });
    }
}
