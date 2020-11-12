package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.work.fb.FbActivity;

public class WorkActivity extends AppCompatActivity {

    private TextView tvFb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        initView();
    }

    private void initView() {
        tvFb = (TextView) findViewById(R.id.tv_fb);

        tvFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WorkActivity.this, FbActivity.class));
            }
        });
    }
}