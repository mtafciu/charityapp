package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DonationThanksActivity extends Activity {

    ImageButton btn_do_thx_back;
    Button btn_do_thx_back_bottom;
    Button btn_do_thx_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_donationthanks);

        btn_do_thx_back = findViewById(R.id.btn_do_thx_back);
        btn_do_thx_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationThanksActivity.this, DonationProjectActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_do_thx_back_bottom = findViewById(R.id.btn_do_thx_back_bottom);
        btn_do_thx_back_bottom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationThanksActivity.this, DonationProjectActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_do_thx_share = findViewById(R.id.btn_do_thx_share);
        btn_do_thx_share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationThanksActivity.this, DonationCommentActivity.class);
                startActivity(intent);
                //finish();
            }
        });



    }

}