package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class DonationProjectActivity extends Activity {
    ImageView img_projectImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_donationproject);
        img_projectImage = findViewById(R.id.img_projectImage);
        img_projectImage.setImageResource(R.drawable.orphanstudents);
    }
}

