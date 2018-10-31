package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class RankingActivity extends Activity {
    ImageButton btn_rank_back;
    ImageView rank_user_img;
    TextView rank_user_name;
    TextView rank_user_pts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_ranking);

        final GlobalVariable gv = (GlobalVariable)getApplicationContext();

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

        rank_user_img = findViewById(R.id.rank_user_img);
        rank_user_img.setImageResource(((gv.getUserName() == getResources().getString(R.string.user_lukas)) ? R.drawable.lukas_img : R.drawable.amy_img));

        rank_user_name = findViewById(R.id.rank_user_name);
        rank_user_name.setText((gv.getUserName() == getResources().getString(R.string.user_lukas)) ? R.string.user_lukas : R.string.user_amy);

        rank_user_pts = findViewById(R.id.rank_user_pts);
        rank_user_pts.setText((gv.getUserName() == getResources().getString(R.string.user_lukas)) ? "100,000 pts" : "76,000 pts");


    }

}