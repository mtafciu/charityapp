package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class ShopActivity extends Activity {
    ImageButton btn_shop_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_shop);

        btn_shop_back = findViewById(R.id.btn_shop_back);
        btn_shop_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(ShopActivity.this, ProfileActivity.class); //返回頁面1
                startActivity(intent);
                finish();
            }
        });
    }
}