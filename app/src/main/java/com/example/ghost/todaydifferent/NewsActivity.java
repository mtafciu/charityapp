package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class NewsActivity extends Activity {
    Button btn_log_in;
    Button btn_sign_up;
    ImageButton btn_volunteer;
    ImageButton btn_donation;
    ImageButton btn_profile;
    LinearLayout ll_news_login_block;

    LinearLayout ll_news_project_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_news);

        final GlobalVariable gv = (GlobalVariable)getApplicationContext();

        ll_news_login_block = findViewById(R.id.ll_news_login_block);
        if (gv.getLogin() == true) {
            ll_news_login_block.setVisibility(View.GONE);
        } else {
            ll_news_login_block.setVisibility(View.VISIBLE);
        }

        btn_log_in = findViewById(R.id.btn_news_log_in);
        btn_log_in.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(NewsActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_sign_up = findViewById(R.id.btn_news_sign_up);
        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(NewsActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });


        ll_news_project_1 = findViewById(R.id.ll_news_project_1);
        ll_news_project_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NewsActivity.this, NewsProjectActivity.class);
                startActivity(intent);
            }
        });

        btn_volunteer = findViewById(R.id.btn_news_vol);
        btn_volunteer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsActivity.this,
                        ((gv.getLogin() == false) ? LoginActivity.class : VolunteerActivity.class));
                startActivity(intent);
                finish();
            }
        });

        btn_donation = findViewById(R.id.btn_news_do);
        btn_donation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(NewsActivity.this,
                        ((gv.getLogin() == false) ? LoginActivity.class : DonationActivity.class));
                startActivity(intent);
                finish();
            }
        });

        btn_profile = findViewById(R.id.btn_news_pro);
        btn_profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(NewsActivity.this,
                        ((gv.getLogin() == false) ? LoginActivity.class : ProfileActivity.class));
                startActivity(intent);
                finish();
            }
        });
    }
}