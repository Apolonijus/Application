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
    private EditText editText;
    private Button checkbutton;



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

        checkbutton= (Button) findViewById(R.id.button_check);

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


        checkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              EditText tx= (EditText) findViewById(R.id.editText);
             int amount = Integer.parseInt(tx.getText().toString());
             // TextView myText3 = (TextView)findViewById(R.id.textView4);
             // String myString3 = String.valueOf(amount);
             // myText3.setText(myString3);


                TextView tx2= (TextView) findViewById(R.id.textView3);
                int amount_y = Integer.parseInt(tx2.getText().toString());
                //int sum = amount + amount_y;

                TextView tx3 = (TextView) findViewById(R.id.textView2);
                int amount_x = Integer.parseInt(tx3.getText().toString());
                int sum = amount+amount_x+amount_y;

                    // TextView myText4 =   (TextView) findViewById(R.id.textView4);
                     //String myString4 = String.valueOf(sum);
                    // myText4.setText(myString4);

              //  TextView tx4 = (TextView) findViewById(R.id.textView4);
               // tx4.setText("Sveikas");




                if ((amount_x + amount_y) == amount ) {
                    TextView tx4 = (TextView) findViewById(R.id.textView4);
                    tx4.setText("Atsakymas yra teisingas");
                }

                else
                {
                    TextView tx4_1 = (TextView) findViewById(R.id.textView4);
                    tx4_1.setText("Deja, atsakymas nera teisingas");
                }

            }
        });






    }
    private void backActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
