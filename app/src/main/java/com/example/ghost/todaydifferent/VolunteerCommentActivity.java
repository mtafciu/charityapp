package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VolunteerCommentActivity extends Activity {
    Button btn_vol_pj_cmt_back;
    Button btn_vol_pj_cmt_donate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_vol_comment);

        btn_vol_pj_cmt_back = findViewById(R.id.btn_vol_pj_cmt_back);
        btn_vol_pj_cmt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerCommentActivity.this, DonationProjectActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_vol_pj_cmt_donate = findViewById(R.id.btn_vol_pj_cmt_donate);
        btn_vol_pj_cmt_donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerCommentActivity.this, DonationThanksActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
