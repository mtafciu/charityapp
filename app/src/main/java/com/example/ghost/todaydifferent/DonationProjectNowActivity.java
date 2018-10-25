package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonationProjectNowActivity extends Activity {
    Button btn_do_pj_sign_back;
    Button btn_do_pj_sign_donate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_donation_now);

        btn_do_pj_sign_back = findViewById(R.id.btn_do_pj_sign_back);
        btn_do_pj_sign_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationProjectNowActivity.this, DonationProjectActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_do_pj_sign_donate = findViewById(R.id.btn_do_pj_sign_donate);
        btn_do_pj_sign_donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationProjectNowActivity.this, DonationThanksActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
