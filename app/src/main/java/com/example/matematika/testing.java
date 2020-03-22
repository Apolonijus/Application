package com.example.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

public class testing extends AppCompatActivity implements View.OnTouchListener {

    private Button button_back;
    TextView text;
    final static float move = 200;
    float ratio = 1.0f;
    int baseDist;
    float baseRatio;

   // ArrayList<String> original_data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        button_back = findViewById(R.id.button_back);
        text = findViewById(R.id.Intro);
        text.setTextSize(ratio+15);

//        Scanner data_in = new Scanner(getResources().openRawResource(R.raw.sample));
//        while ( (data_in.hasNext()))
//        {
//            original_data.add(data_in.nextLine());
//        }
//        text.setText("");
//        for (int j=0; j< original_data.size(); j++)
//        {
//            text.append(original_data.get(j)+"\n");
//        }


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


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getPointerCount() == 2)
        {
            int action = event.getAction();
            int mainaction = action & MotionEvent.ACTION_MASK;
            if (mainaction == MotionEvent.ACTION_POINTER_DOWN)
            {
                baseDist = getDistance(event);
                baseRatio = ratio;
            }
            else  {
                float scale = (getDistance(event)-baseDist)/move;
                float factor = (float) Math.pow(2, scale);
                ratio= Math.min(1024.0f,Math.max(0.1f, baseRatio*factor));
                text.setTextSize(ratio+15);
            }
        }
        return true;
    }

    private int getDistance(MotionEvent event) {
        int dx = (int) (event.getX(0)-event.getX(1));
        int dy = (int) (event.getY(0)-event.getY(1));
        return (int) (Math.sqrt(dx*dx+dy*dy));
    }
}
