package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class NewsProjectActivity extends Activity {
    Button btn_news_pro_login;
    Button btn_news_pro_sign;
    Button btn_news_pro_rel;
    LinearLayout ll_news_project_login_block;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_newsproject);

        final GlobalVariable gv = (GlobalVariable)getApplicationContext();

        ll_news_project_login_block = findViewById(R.id.ll_news_project_login_block);
        if (gv.getLogin() == true) {
            ll_news_project_login_block.setVisibility(View.GONE);
        } else {
            ll_news_project_login_block.setVisibility(View.VISIBLE);
        }


        btn_news_pro_login = findViewById(R.id.btn_news_pro_login);
        btn_news_pro_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NewsProjectActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_news_pro_sign = findViewById(R.id.btn_news_pro_sign);
        btn_news_pro_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NewsProjectActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_news_pro_rel = findViewById(R.id.btn_news_pro_rel);
        btn_news_pro_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NewsProjectActivity.this, DonationActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

