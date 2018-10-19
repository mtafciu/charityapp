package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class NewsActivity extends Activity {
    Button btn_log_in;
    Button btn_sign_up;
    ImageButton btn_volunteer;
    ImageButton btn_donation;
    ImageButton btn_profile;
    ImageButton btn_news;

    LinearLayout ll_news_project_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_news);


        btn_log_in = findViewById(R.id.btn_news_log_in);
        btn_log_in.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(NewsActivity.this, ProfileActivity.class);
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
                intent.setClass(NewsActivity.this, VolunteerProjectActivity.class);
                startActivity(intent);
            }
        });

        btn_news = findViewById(R.id.btn_news_news);
        btn_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                /*Intent intent = new Intent();
                intent.setClass(NewsActivity.this, NewsActivity.class);
                startActivity(intent);
                finish();*/
            }
        });

        btn_volunteer = findViewById(R.id.btn_news_vol);
        btn_volunteer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NewsActivity.this, VolunteerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_donation = findViewById(R.id.btn_news_do);
        btn_donation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NewsActivity.this, DonationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_profile = findViewById(R.id.btn_news_pro);
        btn_profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NewsActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}