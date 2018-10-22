package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VolunteerProjectTicketActivity extends Activity {
    ImageButton btn_vol_pj_tk_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_volunteerproject_ticket);

        btn_vol_pj_tk_back = findViewById(R.id.btn_vol_pj_tk_back);
        btn_vol_pj_tk_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectTicketActivity.this, VolunteerProjectJoinActivity.class);
                startActivity(intent);
                //finish();
            }
        });
    }
}