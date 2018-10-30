package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DonationCommentActivity extends Activity {
    ImageButton btn_do_pj_cmt_nav_back;
    Button btn_do_pj_cmt_back;
    Button btn_do_pj_cmt_publish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_do_comment);

        btn_do_pj_cmt_nav_back = findViewById(R.id.btn_do_pj_cmt_nav_back);
        btn_do_pj_cmt_nav_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationCommentActivity.this, DonationThanksActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_do_pj_cmt_back = findViewById(R.id.btn_do_pj_cmt_back);
        btn_do_pj_cmt_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationCommentActivity.this, DonationThanksActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_do_pj_cmt_publish = findViewById(R.id.btn_do_pj_cmt_publish);
        btn_do_pj_cmt_publish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

            }
        });
    }
}
