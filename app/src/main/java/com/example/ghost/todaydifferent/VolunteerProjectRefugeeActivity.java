package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VolunteerProjectRefugeeActivity extends Activity {
    Button btn_vol_pro_ref_back;
    Button btn_vol_pro_ref_sign;
    Button btn_vol_view_cmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_volunteerproject_refugee);

        btn_vol_pro_ref_back = findViewById(R.id.btn_vol_pro_ref_back);
        btn_vol_pro_ref_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectRefugeeActivity.this, VolunteerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_vol_view_cmt = findViewById(R.id.btn_vol_view_cmt);
        btn_vol_view_cmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectRefugeeActivity.this, VolunteerViewCommentActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_vol_pro_ref_sign = findViewById(R.id.btn_vol_pro_ref_sign);
        btn_vol_pro_ref_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectRefugeeActivity.this, VolunteerProjectJoinActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
