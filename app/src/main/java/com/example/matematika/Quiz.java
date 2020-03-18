package com.example.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Quiz extends AppCompatActivity {
    private Button button;
    int x;
    int y;
    //private EditText editText;
   // private Button checkbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        button = findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }


        });

        button = (Button) findViewById(R.id.button_ans);
       // editText= (EditText) findViewById(R.id.editText);
       // checkbutton= (Button) findViewById(R.id.button_check);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                Random rand2 = new Random();

                int number = rand.nextInt(10);
                int number2 = rand2.nextInt(25);

                x=number;
                y=number2;

                TextView myText = (TextView)findViewById(R.id.textView2);
                TextView myText2 = (TextView) findViewById(R.id.textView3);

                String myString = String.valueOf(number);
                String myString2 = String.valueOf(number2);

                myText.setText(myString);
                myText2.setText(myString2);

            }
        });






    }
    private void backActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
