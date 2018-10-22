package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class DonationActivity extends Activity {

    ImageButton btn_volunteer;
    ImageButton btn_donation;
    ImageButton btn_profile;
    ImageButton btn_news;
    LinearLayout ll_do_project_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_donation);

        ll_do_project_1 = findViewById(R.id.ll_do_project_1);
        ll_do_project_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationActivity.this, DonationProjectActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_news = findViewById(R.id.btn_do_news);
        btn_news.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationActivity.this, NewsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_volunteer = findViewById(R.id.btn_do_vol);
        btn_volunteer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationActivity.this, VolunteerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_donation = findViewById(R.id.btn_do_do);
        btn_donation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                /*Intent intent = new Intent();
                intent.setClass(DonationActivity.this, DonationActivity.class);
                startActivity(intent);
                finish();*/
            }
        });

        btn_profile = findViewById(R.id.btn_do_pro);
        btn_profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

}