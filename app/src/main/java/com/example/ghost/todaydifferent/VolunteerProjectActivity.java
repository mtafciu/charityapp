package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class VolunteerProjectActivity extends Activity {
    ImageView img_projectImage;
    Button btn_vol_pro_back;
    Button btn_vol_pro_sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_volunteerproject);

        btn_vol_pro_back = findViewById(R.id.btn_vol_pro_back);
        btn_vol_pro_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectActivity.this, VolunteerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_vol_pro_sign = findViewById(R.id.btn_vol_pro_sign);
        btn_vol_pro_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectActivity.this, VolunteerThanksActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
