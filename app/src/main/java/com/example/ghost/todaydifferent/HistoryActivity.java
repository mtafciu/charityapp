package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class HistoryActivity extends Activity {
    ImageButton btn_his_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_history);

        btn_his_back = findViewById(R.id.btn_his_back);
        btn_his_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(HistoryActivity.this, ProfileActivity.class); //返回頁面1
                startActivity(intent);
                finish();
            }
        });


    }

}