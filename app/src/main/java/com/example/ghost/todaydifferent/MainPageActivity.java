package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPageActivity extends Activity {
    Button btn_log_in;
    Button btn_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        btn_log_in = findViewById(R.id.btn_main_log_in);

        btn_log_in.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainPageActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_sign_up = findViewById(R.id.btn_main_sign_up);

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainPageActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}