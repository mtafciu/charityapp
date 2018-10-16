package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class VolunteerActivity extends Activity {

    ImageButton btn_volunteer;
    ImageButton btn_donation;
    ImageButton btn_profile;
    Spinner spinner_type;
    Spinner spinner_filter;
    TextView txt_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_volunteer);

        spinner_type = findViewById(R.id.spinner_loc);
        ArrayAdapter<CharSequence> typeList = ArrayAdapter.createFromResource(VolunteerActivity.this,
                R.array.vol_loc_list,
                android.R.layout.simple_spinner_dropdown_item);
        spinner_type.setAdapter(typeList);


        spinner_filter = findViewById(R.id.spinner_date);
        ArrayAdapter<CharSequence> filterList = ArrayAdapter.createFromResource(VolunteerActivity.this,
                R.array.vol_date_list,
                android.R.layout.simple_spinner_dropdown_item);
        spinner_filter.setAdapter(filterList);



        btn_volunteer = findViewById(R.id.btn_volunteer);
        btn_volunteer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerActivity.this, VolunteerActivity.class);
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
                intent.setClass(VolunteerActivity.this, DonationActivity.class);
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
                intent.setClass(VolunteerActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });

        txt_profile = findViewById(R.id.txt_listprojecttitle);
        txt_profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(VolunteerActivity.this, VolunteerProjectActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

}