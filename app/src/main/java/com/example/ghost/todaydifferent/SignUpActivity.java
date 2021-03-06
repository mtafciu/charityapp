package com.example.ghost.todaydifferent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class SignUpActivity extends Activity {
    //ImageButton img_btn_location;
    //EditText et_location;
    Button btn_register;
    Button btn_cancel;
    Spinner spinner_sign_city;
    Spinner spinner_sign_country;
    Spinner spinner_sign_interest;
    EditText et_first_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_signup);

        final GlobalVariable gv = (GlobalVariable)getApplicationContext();

        et_first_name = findViewById(R.id.et_first_name);

        spinner_sign_city = findViewById(R.id.spinner_sign_city);
        ArrayAdapter<CharSequence> cityList = ArrayAdapter.createFromResource(SignUpActivity.this,
                R.array.sign_city_list,
                R.layout.spinner_sign_text);
        spinner_sign_city.setAdapter(cityList);

        spinner_sign_country = findViewById(R.id.spinner_sign_country);
        ArrayAdapter<CharSequence> countryList = ArrayAdapter.createFromResource(SignUpActivity.this,
                R.array.sign_country_list,
                R.layout.spinner_sign_text);
        spinner_sign_country.setAdapter(countryList);

        spinner_sign_interest = findViewById(R.id.spinner_sign_interest);
        ArrayAdapter<CharSequence> interestList = ArrayAdapter.createFromResource(SignUpActivity.this,
                R.array.sign_interest_list,
                R.layout.spinner_sign_text);
        spinner_sign_interest.setAdapter(interestList);


        btn_register = findViewById(R.id.btn_sign_register);
        btn_register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                gv.setLogin(true);
                gv.setUserName(et_first_name.getText().toString());
                Intent intent = new Intent();
                intent.setClass(SignUpActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_cancel = findViewById(R.id.btn_sign_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
