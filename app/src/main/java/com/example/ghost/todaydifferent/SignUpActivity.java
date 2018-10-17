package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;




public class SignUpActivity extends Activity {
    ImageButton img_btn_location;
    EditText et_location;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_signup);

        img_btn_location = findViewById(R.id.img_btn_Location);
        et_location = findViewById(R.id.et_Location);

        img_btn_location.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_location.setText("Mannheim");
            }
        });

        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(SignUpActivity.this, InterestsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
