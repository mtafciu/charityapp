package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class CertificateActivity extends Activity {

    ImageButton btn_cer_thx_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_certificate);


        btn_cer_thx_back = findViewById(R.id.btn_cer_thx_back);
        btn_cer_thx_back.setOnClickListener(new View.OnClickListener() {

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