package com.example.a82105.login_ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;

public class RegistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        Intent intent = getIntent();
        String response = intent.getStringExtra("response");

        // response 데이터를 사용하여 UI를 업데이트하거나 다른 작업을 수행할 수 있습니다.
    }
}
