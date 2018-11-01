package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class VolunteerProjectTicketActivity extends Activity {
    ImageButton btn_vol_pj_tk_back;
    Button btn_vol_pj_tk_pro;
    Button btn_vol_pj_tk_more;
    ImageView vol_ticket_qrcode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_volunteerproject_ticket);

        btn_vol_pj_tk_back = findViewById(R.id.btn_vol_pj_tk_back);
        btn_vol_pj_tk_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectTicketActivity.this, VolunteerProjectRefugeeActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_vol_pj_tk_pro = findViewById(R.id.btn_vol_pj_tk_pro);
        btn_vol_pj_tk_pro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectTicketActivity.this, ProfileActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_vol_pj_tk_more = findViewById(R.id.btn_vol_pj_tk_more);
        btn_vol_pj_tk_more.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectTicketActivity.this, VolunteerActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        vol_ticket_qrcode = findViewById(R.id.vol_ticket_qrcode);
        vol_ticket_qrcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                GlobalVariable gv = (GlobalVariable)getApplicationContext();
                // volunteer 1 hr, earning 100 pts
                gv.setLukasPoint(gv.getLukasPoint() + 100);

                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerProjectTicketActivity.this, VolunteerThanksActivity.class);
                startActivity(intent);
                //finish();
            }
        });
    }
}