package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RankingActivity extends Activity {
    ImageButton btn_rank_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_ranking);

        btn_rank_back = findViewById(R.id.btn_rank_back);
        btn_rank_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(RankingActivity.this, ProfileActivity.class); //返回頁面1
                startActivity(intent);
                finish();
            }
        });


    }

}