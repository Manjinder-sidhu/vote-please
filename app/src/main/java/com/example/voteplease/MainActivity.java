package com.example.voteplease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

//  int[] candidates ;
    int candidate1_counter = 0 ;
    int candidate2_counter = 0 ;
    int candidate3_counter = 0 ;
    ArrayList<Integer> candidates1 = new ArrayList<Integer>();
    ArrayList<Integer> candidates2 = new ArrayList<Integer>();
    ArrayList<Integer> candidates3 = new ArrayList<Integer>();
    ArrayList<Integer> All_candidates = new ArrayList<Integer>();


    EditText name;
    EditText id;
    ToggleButton toggleButton;
    Button vote ;
    String toggletext = "refuse";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        id = findViewById(R.id.ID);
       final Spinner spinner = findViewById(R.id.Cand_spinner);
       toggleButton = findViewById(R.id.toggle);
        vote = findViewById(R.id.btn);

toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            toggletext = "accept";
            // The toggle is enabled
        } else {
            toggletext = "refuse";
            // The toggle is disabled
        }
    }
});



        vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name1 = name.getText().toString();
                String id1 = id.getText().toString();
                String spinnertext = spinner.getSelectedItem().toString();

                if (name1.isEmpty() || id1.isEmpty() || toggletext == "refuse" || spinnertext.equals("Choose Candidate")) {

                    Toast.makeText(MainActivity.this, " you might have empty fields!!!!", Toast.LENGTH_SHORT).show();


                } else {

//


                    if (toggletext == "accept" && spinnertext.equals("Candidate 1")) {

//                            for (int i = 0; i < All_candidates.size(); i++) {
//                                if (All_candidates.get(i) == (Integer.parseInt(id1))) {
//
//                                    Toast.makeText(MainActivity.this, " you have submitted your vote before 👍", Toast.LENGTH_SHORT).show();
//
//                                }
//                                else{
                        candidates1.add(Integer.parseInt(id1));
                        All_candidates.add(Integer.parseInt(id1));
//
//                                }
//                            }


//                            candidates1.add(Integer.parseInt(id1));
//                            All_candidates.add(Integer.parseInt(id1));

                        Toast.makeText(MainActivity.this, " you have submitted your vote for candidate 1  👍", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, ResultActivity.class);
                        String str1 = Integer.toString(candidates1.size());
                        i.putExtra("candidate 1", str1);
                        startActivity(i);

                    } else if (toggletext == "accept" && spinnertext.equals("Candidate 2")) {

                        candidates2.add(Integer.parseInt(id1));
                        All_candidates.add(Integer.parseInt(id1));

                        Toast.makeText(MainActivity.this, " you have submitted your vote for candidate 2  👍", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, ResultActivity.class);
                        String str1 = Integer.toString(candidates2.size());
                        i.putExtra("candidate 2", str1);
                        startActivity(i);
                    } else if (toggletext == "accept" && spinnertext.equals("Candidate 3")) {

                        candidates3.add(Integer.parseInt(id1));
                        All_candidates.add(Integer.parseInt(id1));

                        Toast.makeText(MainActivity.this, " you have submitted your vote for candidate 3  👍", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, ResultActivity.class);
                        String str1 = Integer.toString(candidates3.size());
                        i.putExtra("candidate 3", str1);
                        startActivity(i);
                    }

                }

            }
        });






    }
}
