package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VolunteerThanksActivity extends Activity {

    ImageButton btn_vo_thx_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_volunteerthanks);


        btn_vo_thx_back = findViewById(R.id.btn_vo_thx_back);
        btn_vo_thx_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerThanksActivity.this, VolunteerProjectActivity.class);
                startActivity(intent);
                //finish();
            }
        });

    }

}