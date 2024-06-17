package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class EightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        LinearLayout template1 = findViewById(R.id.template1);
        LinearLayout template2 = findViewById(R.id.template2);

        template1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this,NinthActivity.class);
                startActivity(intent);
            }
        });

        template2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, TenActivity.class);
                startActivity(intent);
            }
        });
    }
}