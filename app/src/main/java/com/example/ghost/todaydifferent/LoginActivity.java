package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginActivity extends Activity {
    Button btn_log_in;
    Button btn_sign_up;
    ImageButton btn_volunteer;
    ImageButton btn_donation;
    ImageButton btn_profile;
    ImageButton btn_news;
    EditText et_main_email;
    TextView tv_login_check_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);

        final GlobalVariable gv = (GlobalVariable)getApplicationContext();

        et_main_email = findViewById(R.id.et_main_email);
        tv_login_check_account = findViewById(R.id.tv_login_check_account);

        btn_log_in = findViewById(R.id.btn_main_log_in);
        btn_log_in.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(et_main_email.getText().toString().equals(getString(R.string.email_lukas))) {
                    tv_login_check_account.setVisibility(View.GONE);

                    gv.setLogin(true);
                    gv.setUserName(getString(R.string.user_lukas));

                    Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    finish();

                } else if (et_main_email.getText().toString().equals(getString(R.string.email_amy))) {
                    tv_login_check_account.setVisibility(View.GONE);

                    gv.setLogin(true);
                    gv.setUserName(getString(R.string.user_amy));

                    Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    finish();

                } else {
                    tv_login_check_account.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_sign_up = findViewById(R.id.btn_main_sign_up);

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_news = findViewById(R.id.btn_main_news);
        btn_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(LoginActivity.this, NewsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_volunteer = findViewById(R.id.btn_main_vol);
        btn_volunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(gv.getLogin() == true) {
                    Intent intent = new Intent();
                    intent.setClass(LoginActivity.this, VolunteerActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        btn_donation = findViewById(R.id.btn_main_do);
        btn_donation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gv.getLogin() == true) {
                    Intent intent = new Intent();
                    intent.setClass(LoginActivity.this, DonationActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        btn_profile = findViewById(R.id.btn_main_pro);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gv.getLogin() == true) {
                    Intent intent = new Intent();
                    intent.setClass(LoginActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}