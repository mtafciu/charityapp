package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class DonationActivity extends Activity {

    ImageButton btn_volunteer;
    ImageButton btn_donation;
    ImageButton btn_profile;
    LinearLayout ll_do_project_1;
    Spinner spinner_type;
    Spinner spinner_filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_donation);

        spinner_type = findViewById(R.id.spinner_donate_type);
        ArrayAdapter<CharSequence> typeList = ArrayAdapter.createFromResource(DonationActivity.this,
                R.array.do_type_list,
                android.R.layout.simple_spinner_dropdown_item);
        spinner_type.setAdapter(typeList);


        spinner_filter = findViewById(R.id.spinner_donate_progress);
        ArrayAdapter<CharSequence> filterList = ArrayAdapter.createFromResource(DonationActivity.this,
                R.array.do_sort_list,
                android.R.layout.simple_spinner_dropdown_item);
        spinner_filter.setAdapter(filterList);

        ll_do_project_1 = findViewById(R.id.ll_do_project_1);
        ll_do_project_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationActivity.this, DonationProjectActivity.class);
                startActivity(intent);
            }
        });

        btn_volunteer = findViewById(R.id.btn_volunteer);
        btn_volunteer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationActivity.this, VolunteerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_donation = findViewById(R.id.btn_donation);
        btn_donation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationActivity.this, DonationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_profile = findViewById(R.id.btn_profile);
        btn_profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(DonationActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

}