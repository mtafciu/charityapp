package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RankingActivity extends Activity {
    ImageButton btn_rank_back;
    ImageView rank_user_img;
    TextView rank_user_name;
    TextView rank_user_pts;
    TextView txt_rank_lukas;
    TextView txt_rank_amy;

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

        txt_rank_lukas = findViewById(R.id.txt_rank_lukas);
        txt_rank_lukas.setText(gv.getLukasPoint()+" pts");

        txt_rank_amy = findViewById(R.id.txt_rank_amy);
        txt_rank_amy.setText(gv.getAmyPoint()+" pts");


        rank_user_img = findViewById(R.id.rank_user_img);
        rank_user_img.setImageResource(((gv.getUserName().equals(getResources().getString(R.string.user_lukas))) ? R.drawable.lukas_img : R.drawable.amy_img));

        rank_user_name = findViewById(R.id.rank_user_name);
        rank_user_name.setText((gv.getUserName().equals(getResources().getString(R.string.user_lukas))) ? R.string.user_lukas : R.string.user_amy);

        rank_user_pts = findViewById(R.id.rank_user_pts);
        rank_user_pts.setText((gv.getUserName().equals(getResources().getString(R.string.user_lukas))) ? gv.getLukasPoint() + " pts" : gv.getAmyPoint() + " pts");

    }
}