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
    Spinner spinner_type;
    Spinner spinner_filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_shop);

        spinner_type = findViewById(R.id.spinner_type);
        ArrayAdapter<CharSequence> typeList = ArrayAdapter.createFromResource(ShopActivity.this,
                R.array.shop_type_list,
                android.R.layout.simple_spinner_dropdown_item);
        spinner_type.setAdapter(typeList);


        spinner_filter = findViewById(R.id.spinner_filter);
        ArrayAdapter<CharSequence> filterList = ArrayAdapter.createFromResource(ShopActivity.this,
                R.array.shop_filter_list,
                android.R.layout.simple_spinner_dropdown_item);
        spinner_filter.setAdapter(filterList);


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