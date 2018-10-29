package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NewsProjectActivity extends Activity {
    Button btn_news_pro_login;
    Button btn_news_pro_sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_newsproject);

        btn_news_pro_login = findViewById(R.id.btn_news_pro_login);
        btn_news_pro_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NewsProjectActivity.this, MainPageActivity.class);
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


    }
}

