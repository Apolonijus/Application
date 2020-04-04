package com.example.matematika;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.matematika.Paint.Main2Activity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private  Button button_book;
    private Button button_pinch;
    private  Button button_ned;
    private Button button_rok;
    private pl.droidsonroids.gif.GifImageButton buuton_paint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


        button_book = findViewById(R.id.book);
        button_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button_pinch = findViewById(R.id.button_ned);
        button_pinch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

        button_ned = findViewById(R.id.button_test_ned);
        button_ned.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_test_n();}
        });

        button_rok = findViewById(R.id.button_test_rok);
        button_rok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_test_r();
            }
        });

        buuton_paint = findViewById(R.id.button_paint);
        buuton_paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_paint();
            }
        });







       // Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openActivity2()
    {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent = new Intent(this, Book.class);
        startActivity(intent);
    }
    public void openActivity()
    {
        Intent intent = new Intent(this, testing.class);
        startActivity(intent);
    }
    public void open_test_n()
    {
        Intent intent = new Intent(this, Testing_Place_N.class);
        startActivity(intent);
    }
    public void open_test_r()
    {
        Intent intent = new Intent(this, Testing_Place_R.class);
        startActivity(intent);
    }
    public void open_paint()
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}

