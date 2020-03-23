package com.example.matematika.Paint;

import android.graphics.Path;

import androidx.appcompat.app.AppCompatActivity;

public class Draw extends AppCompatActivity {

    public int color;
    public int strokeWidth;
    public Path path;

    public Draw (int color, int strokeWidth, Path path)
    {
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }


}
