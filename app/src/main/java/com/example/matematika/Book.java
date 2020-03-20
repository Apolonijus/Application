package com.example.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Book extends AppCompatActivity {

    private Button button_back;
    TextView text;

    ArrayList<String> original_data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        button_back = findViewById(R.id.button_back);
        text = findViewById(R.id.Intro);

        Scanner data_in = new Scanner(getResources().openRawResource(R.raw.sample));
        while ( (data_in.hasNext()))
        {
            original_data.add(data_in.nextLine());
        }
        text.setText("");
        for (int j=0; j< original_data.size(); j++)
        {
            text.append(original_data.get(j)+"\n");
        }


        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
