package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VolunteerThanksActivity extends Activity {

    ImageButton btn_vol_thx_nav_back;
    Button btn_vol_thx_back;
    Button btn_vol_thx_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_volunteerthanks);

        btn_vol_thx_nav_back = findViewById(R.id.btn_vol_thx_nav_back);
        btn_vol_thx_nav_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerThanksActivity.this, VolunteerProjectActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_vol_thx_back = findViewById(R.id.btn_vol_thx_back);
        btn_vol_thx_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerThanksActivity.this, VolunteerProjectActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_vol_thx_share = findViewById(R.id.btn_vol_thx_share);
        btn_vol_thx_share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerThanksActivity.this, VolunteerCommentActivity.class);
                startActivity(intent);
                //finish();
            }
        });

    }

}