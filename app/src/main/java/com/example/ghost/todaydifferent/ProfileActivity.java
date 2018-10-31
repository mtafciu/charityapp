package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends Activity {
    Button btn_pro_shop;
    Button btn_pro_certificate;
    Button btn_pro_his;
    ImageButton btn_volunteer;
    ImageButton btn_donation;
    ImageButton btn_profile;
    ImageButton btn_news;
    ImageView pro_user_img;
    TextView pro_user_name;
    ImageButton btn_pro_logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_profile);

        final GlobalVariable gv = (GlobalVariable)getApplicationContext();

        btn_pro_logout = findViewById(R.id.btn_pro_logout);
        btn_pro_logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                gv.setLogin(false);
                Intent intent = new Intent();
                intent.setClass(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        pro_user_img = findViewById(R.id.pro_user_img);
        pro_user_img.setImageResource(((gv.getUserName() == getResources().getString(R.string.user_lukas)) ? R.drawable.lukas_img : R.drawable.amy_img));

        pro_user_name = findViewById(R.id.pro_user_name);
        pro_user_name.setText((gv.getUserName() == getResources().getString(R.string.user_lukas)) ? R.string.user_lukas : R.string.user_amy);

        btn_pro_shop = findViewById(R.id.btn_pro_shop);
        btn_pro_shop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(ProfileActivity.this, ShopActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_pro_certificate = findViewById(R.id.btn_pro_certificate);
        btn_pro_certificate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(ProfileActivity.this, CertificateActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_pro_his = findViewById(R.id.btn_pro_his);
        btn_pro_his.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(ProfileActivity.this, HistoryActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_news = findViewById(R.id.btn_pro_news);
        btn_news.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(ProfileActivity.this, NewsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_volunteer = findViewById(R.id.btn_pro_vol);
        btn_volunteer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(ProfileActivity.this, VolunteerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_donation = findViewById(R.id.btn_pro_do);
        btn_donation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(ProfileActivity.this, DonationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_profile = findViewById(R.id.btn_pro_pro);
        btn_profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                /*Intent intent = new Intent();
                intent.setClass(ProfileActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();*/
            }
        });
    }
}