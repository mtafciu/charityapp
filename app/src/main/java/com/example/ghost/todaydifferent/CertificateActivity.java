package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class CertificateActivity extends Activity {

    ImageButton btn_cert_back;
    Button btn_cert_pro;
    Button btn_cert_rank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_certificate);


        btn_cert_back = findViewById(R.id.btn_cert_back);
        btn_cert_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(CertificateActivity.this, ProfileActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_cert_rank = findViewById(R.id.btn_cert_rank);
        btn_cert_rank.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(CertificateActivity.this, RankingActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        btn_cert_pro = findViewById(R.id.btn_cert_pro);
        btn_cert_pro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(CertificateActivity.this, ProfileActivity.class);
                startActivity(intent);
                //finish();
            }
        });

    }

}