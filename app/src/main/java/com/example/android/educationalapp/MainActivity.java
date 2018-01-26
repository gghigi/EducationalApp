package com.example.android.educationalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    int score = 0;


    RadioButton surfer_radiobutton;
    RadioButton eleven_radiobutton;
    RadioButton andy_irons_radiobutton;
    RadioButton forty_six_radiobutton;
    CheckBox santa_barbara_checkbox;
    CheckBox gold_coast_checkbox;
    CheckBox jadaipur_checkbox;
    CheckBox north_shore_checkbox;
    CheckBox milan_checkbox;
    EditText plain_text_input;
    EditText plain_text_input_two;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Figure out if right buttons checked

        surfer_radiobutton = findViewById(R.id.surfer_radiobutton);
        eleven_radiobutton = findViewById(R.id.eleven_radiobutton);
        andy_irons_radiobutton = findViewById(R.id.andy_irons_radiobutton);
        forty_six_radiobutton = findViewById(R.id.forty_six_radiobutton);
        santa_barbara_checkbox = findViewById(R.id.santa_barbara_checkbox);
        gold_coast_checkbox = findViewById(R.id.gold_coast_checkbox);
        milan_checkbox = findViewById(R.id.milan_checkbox);
        north_shore_checkbox = findViewById(R.id.north_shore_checkbox);
        jadaipur_checkbox = findViewById(R.id.jadaipur_checkbox);
        plain_text_input = findViewById(R.id.plain_text_input);
        plain_text_input_two = findViewById(R.id.plain_text_input_two);


    }

    /**
     * This method is called to check the answers.
     */
    public void onClickBtn(View view) {
        // Check for right answers and scores one point each
        if (surfer_radiobutton.isChecked()) {
            score += 1;
        }
        if (eleven_radiobutton.isChecked()) {
            score += 1;
        }
        if (andy_irons_radiobutton.isChecked()) {
            score += 1;
        }
        if (forty_six_radiobutton.isChecked()) {
            score += 1;
        }
        if (santa_barbara_checkbox.isChecked() && gold_coast_checkbox.isChecked() && north_shore_checkbox.isChecked()) {
            score += 1;

        } else if (jadaipur_checkbox.isChecked() || (milan_checkbox.isChecked())){
            score = 0;
        }
        String questionThree = plain_text_input.getText().toString();
        if (questionThree.equals("Kelly Slater")) {
            score += 1;
        }
        String questionSeven = plain_text_input_two.getText().toString();
        if (questionSeven.equals("Robert")) {
            score += 1;
        }
        showToast();





    }

    public void showToast () {
        if (score == 7) {
            Toast.makeText(this, "Good job, you scored " + score + " out of 7", Toast.LENGTH_LONG).show();

        }
        if (score < 7) {
            Toast.makeText(this, "Not this time! You scored " + score + " out of 7. Try again", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "Yo bro! stomp that reset button", Toast.LENGTH_LONG).show();
        }

    }


    /**
     * this method is called when the button Reset is clicked.
     */
    public void resetScores(View v) {
        score = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}