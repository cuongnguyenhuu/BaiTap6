package com.nhc.cuongnguyen.baitap6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProvinceActivity extends AppCompatActivity {
    TextView tinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province);
        Intent intent = getIntent();
        tinh = (TextView) findViewById(R.id.tv_Tinh);
        String str = intent.getStringExtra("tinh");
        tinh.setText(str);
    }
}
