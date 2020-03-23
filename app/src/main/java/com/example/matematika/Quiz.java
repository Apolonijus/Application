package com.example.matematika;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Random;

public class Quiz extends AppCompatActivity {
    int x;
    int y;
    int z;

    int right=0;
    int wrong=0;



//    int[]{[] rezultatas = new int[100][100];
//public static final String TEXT = "text";
//    public  static final  String SHARED_PREFS = "sharedPrefs";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        Button button_rand = findViewById(R.id.button_rand);
        Button button_check = findViewById(R.id.button_check);
        Button button = findViewById(R.id.button_back);


       // TextView tx_res = findViewById(R.id.result_2);







        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }


        });



        // private EditText editText;




        button_rand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random rand = new Random();
                Random rand2 = new Random();
                Random rand3 = new Random();

                int number = rand.nextInt(10);
                int number2 = rand2.nextInt(25);
                int number3 = rand3.nextInt(4);

                x=number;
                y=number2;
                z=number3;

                TextView myText = findViewById(R.id.textView2);
                TextView myText2 = findViewById(R.id.textView3);




                String myString = String.valueOf(number);
                String myString2 = String.valueOf(number2);


                myText.setText(myString);
                myText2.setText(myString2);

                TextView tx4_3= findViewById(R.id.textView4);
                tx4_3.setText("");

                if (z==0)
                {
                    TextView tx5_1 = findViewById(R.id.textView);
                    tx5_1.setText("+");

                }
                else if (z==1)
                {
                    TextView tx5_2 = findViewById(R.id.textView);
                    tx5_2.setText("-");
                }
                else if (z==2)
                {
                    TextView tx5_2 = findViewById(R.id.textView);
                    tx5_2.setText("*");
                }
                else if (z==3)
                {
                    TextView tx5_2 = findViewById(R.id.textView);
                    tx5_2.setText("/");
                }



            }
        });


        button_check.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
              EditText tx= findViewById(R.id.editText);
             // TextView tx_res = findViewById(R.id.result);


                double amount = Double.parseDouble(tx.getText().toString());

                // TextView myText3 = (TextView)findViewById(R.id.textView4);
             // String myString3 = String.valueOf(amount);
             // myText3.setText(myString3);


                TextView tx2= findViewById(R.id.textView3);
                double amount_y = Integer.parseInt(tx2.getText().toString());

                //int sum = amount + amount_y;

                TextView tx3 = findViewById(R.id.textView2);
                double amount_x = Integer.parseInt(tx3.getText().toString());
               // int sum = amount+amount_x+amount_y;

                    // TextView myText4 =   (TextView) findViewById(R.id.textView4);
                     //String myString4 = String.valueOf(sum);
                    // myText4.setText(myString4);

              //  TextView tx4 = (TextView) findViewById(R.id.textView4);
               // tx4.setText("Sveikas");


                if (z==0)
                {
                    if ((amount_x + amount_y) == amount )
                    {

                        TextView tx4 = findViewById(R.id.textView4);
                        tx4.setText("Teisingai");

                        right++;

                        TextView tx_result = findViewById(R.id.result);
                        String myString_resp = String.valueOf(right);
                        String myString_resm = String.valueOf(wrong);
                        tx_result.setText(myString_resp + " / " + myString_resm);

SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(Quiz.this);
SharedPreferences.Editor editor = prefs.edit();

editor.putInt("right",right);
editor.apply();







                        //                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(Quiz.this);
//                SharedPreferences.Editor editor = prefs.edit();
//
//                editor.putInt("right",right);
//                editor.putInt("wrong", wrong);
//                editor.apply();


                       //  right = Integer.parseInt(tx_result.getText().toString());
                       // tx_result.setText(right);

                    }

                    else
                    {
                        TextView tx4_1 = findViewById(R.id.textView4);
                        tx4_1.setText("Neteisinga");

                        wrong++;

                        TextView tx_result = findViewById(R.id.result);
                        String myString_resp = String.valueOf(right);
                        String myString_resm = String.valueOf(wrong);
                        tx_result.setText(myString_resp + " / " + myString_resm);
                    }
                }
                else if (z==1)
                {
                    if ((amount_x - amount_y) == amount )
                    {
                        TextView tx4 = findViewById(R.id.textView4);
                        tx4.setText("Teisingai");

                        right++;

                        TextView tx_result = findViewById(R.id.result);
                        String myString_resp = String.valueOf(right);
                        String myString_resm = String.valueOf(wrong);
                        tx_result.setText(myString_resp + " / " + myString_resm);

                    }

                    else
                    {
                        TextView tx4_1 = findViewById(R.id.textView4);
                        tx4_1.setText("Neteisinga");

                        wrong++;

                        TextView tx_result = findViewById(R.id.result);
                        String myString_resp = String.valueOf(right);
                        String myString_resm = String.valueOf(wrong);
                        tx_result.setText(myString_resp + " / " + myString_resm);
                    }
                }
                else if (z==2)
                {
                    if ((amount_x * amount_y) == amount )
                    {
                        TextView tx4 = findViewById(R.id.textView4);
                        tx4.setText("Teisingai");

                        right++;

                        TextView tx_result = findViewById(R.id.result);
                        String myString_resp = String.valueOf(right);
                        String myString_resm = String.valueOf(wrong);
                        tx_result.setText(myString_resp + " / " + myString_resm);
                    }

                    else
                    {
                        TextView tx4_1 = findViewById(R.id.textView4);
                        tx4_1.setText("Neteisinga");

                        wrong++;

                        TextView tx_result = findViewById(R.id.result);
                        String myString_resp = String.valueOf(right);
                        String myString_resm = String.valueOf(wrong);
                        tx_result.setText(myString_resp + " / " + myString_resm);
                    }
                }
                else if (z==3)
                {
                    double dot = amount_x/amount_y;
                    new DecimalFormat("##.#").format(dot);
                    new DecimalFormat("##.#").format(amount);


                    if (dot == amount )
                    {
                        TextView tx4 = findViewById(R.id.textView4);
                      //  tx4.setText(new DecimalFormat("##.#").format(dot));
                     //   TextView tx4 = (TextView) findViewById(R.id.textView4);

                        tx4.setText("Teisingai");

                        right++;

                        TextView tx_result = findViewById(R.id.result);
                        String myString_resp = String.valueOf(right);
                        String myString_resm = String.valueOf(wrong);
                        tx_result.setText(myString_resp + " / " + myString_resm);
                    }

                    else
                    {
                        TextView tx4_1 = findViewById(R.id.textView4);
                        tx4_1.setText("Neteisinga");

                        wrong++;

                        TextView tx_result = findViewById(R.id.result);
                        String myString_resp = String.valueOf(right);
                        String myString_resm = String.valueOf(wrong);
                        tx_result.setText(myString_resp + " / " + myString_resm);
                    }
                }





            }
        });




    }

   /* public void saveData() {
        TextView tx4 = findViewById(R.id.result);
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(TEXT, tx4.get
                .getText().toString());

    }
public  void  loadData(){
SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
right = sharedPreferences.getInt(TEXT, Integer.parseInt(""));

}*/

    private void backActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
