package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DonationProjectNowActivity extends Activity {
    Button btn_do_pj_sign_back;
    Button btn_do_pj_sign_donate;
    Button btn_donate_100;
    Button btn_donate_10;
    Button btn_donate_20;
    Button btn_donate_50;
    Button btn_one_time;
    Button btn_monthly;
    Button btn_annually;
    Button btn_credit_card;
    Button btn_debit;
    Button btn_paypal;
    EditText et_donate;
    int donation_money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_donation_now);

        et_donate = findViewById(R.id.et_donate);
        et_donate.setText("0");

        btn_donate_100 = findViewById(R.id.btn_donate_100);
        btn_donate_100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_donate.setText("100");
                btn_donate_100.setBackgroundColor(getResources().getColor(R.color.colorLight));
                btn_donate_10.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_donate_20.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_donate_50.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                donation_money = 100;
            }
        });

        btn_donate_10 = findViewById(R.id.btn_donate_10);
        btn_donate_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_donate.setText("10");
                btn_donate_100.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_donate_10.setBackgroundColor(getResources().getColor(R.color.colorLight));
                btn_donate_20.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_donate_50.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                donation_money = 10;
            }
        });

        btn_donate_20 = findViewById(R.id.btn_donate_20);
        btn_donate_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_donate.setText("20");
                btn_donate_100.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_donate_10.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_donate_20.setBackgroundColor(getResources().getColor(R.color.colorLight));
                btn_donate_50.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                donation_money = 20;
            }
        });

        btn_donate_50 = findViewById(R.id.btn_donate_50);
        btn_donate_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_donate.setText("50");
                btn_donate_100.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_donate_10.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_donate_20.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_donate_50.setBackgroundColor(getResources().getColor(R.color.colorLight));
                donation_money = 50;
            }
        });

        btn_one_time = findViewById(R.id.btn_one_time);
        btn_one_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_one_time.setBackgroundColor(getResources().getColor(R.color.colorLight));
                btn_annually.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_monthly.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
            }
        });

        btn_annually = findViewById(R.id.btn_annually);
        btn_annually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_one_time.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_annually.setBackgroundColor(getResources().getColor(R.color.colorLight));
                btn_monthly.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
            }
        });

        btn_monthly = findViewById(R.id.btn_monthly);
        btn_monthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_one_time.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_annually.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_monthly.setBackgroundColor(getResources().getColor(R.color.colorLight));
            }
        });

        btn_credit_card = findViewById(R.id.btn_credit_card);
        btn_credit_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_credit_card.setBackgroundColor(getResources().getColor(R.color.colorLight));
                btn_debit.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_paypal.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
            }
        });

        btn_paypal = findViewById(R.id.btn_paypal);
        btn_paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_credit_card.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_debit.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_paypal.setBackgroundColor(getResources().getColor(R.color.colorLight));
            }
        });

        btn_debit = findViewById(R.id.btn_debit);
        btn_debit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_credit_card.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
                btn_debit.setBackgroundColor(getResources().getColor(R.color.colorLight));
                btn_paypal.setBackgroundColor(getResources().getColor(R.color.lighterGrey));
            }
        });

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

                GlobalVariable gv = (GlobalVariable)getApplicationContext();
                // donate 1 euro, earning 10 pts
                gv.setAmyPoint(gv.getAmyPoint() + 10 * Integer.parseInt(et_donate.getText().toString()));

                Intent intent = new Intent();
                intent.setClass(DonationProjectNowActivity.this, DonationThanksActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
