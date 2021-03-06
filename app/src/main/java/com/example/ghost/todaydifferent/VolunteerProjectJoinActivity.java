package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VolunteerProjectJoinActivity extends Activity {
    Button btn_vol_pj_sign_back;
    Button btn_vol_pj_sign_sign;
    ImageButton btn_vol_pj_join_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_volunteerproject_join);

        btn_vol_pj_join_back = findViewById(R.id.btn_vol_pj_join_back);
        btn_vol_pj_join_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectJoinActivity.this, VolunteerProjectRefugeeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_vol_pj_sign_back = findViewById(R.id.btn_vol_pj_sign_back);
        btn_vol_pj_sign_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectJoinActivity.this, VolunteerProjectRefugeeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_vol_pj_sign_sign = findViewById(R.id.btn_vol_pj_sign_sign);
        btn_vol_pj_sign_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectJoinActivity.this, VolunteerProjectTicketActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
