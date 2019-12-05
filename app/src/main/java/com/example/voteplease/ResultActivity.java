package com.example.voteplease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
        TextView candidate1;
        TextView candidate2;
        TextView candidate3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        candidate1 = findViewById(R.id.cand1);
        candidate2 = findViewById(R.id.cand2);
        candidate3= findViewById(R.id.cand3);


//        Intent i = getIntent();
        Intent i = getIntent();
        String txt = i.getExtras().getString("candidate 1");
        candidate1.setText(txt);

        String txt2 = i.getExtras().getString("candidate 2");
        candidate2.setText(txt2);

        String txt3 = i.getExtras().getString("candidate 3");
        candidate3.setText(txt3);




    }
}
