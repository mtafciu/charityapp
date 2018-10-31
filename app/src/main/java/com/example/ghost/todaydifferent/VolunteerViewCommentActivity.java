package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VolunteerViewCommentActivity extends Activity {
    ImageButton btn_vol_view_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_vol_view_comment);

        btn_vol_view_back = findViewById(R.id.btn_vol_view_back);
        btn_vol_view_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerViewCommentActivity.this, ProfileActivity.class); //返回頁面1
                startActivity(intent);
                finish();
            }
        });
    }
}