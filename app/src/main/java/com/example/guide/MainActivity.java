package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView mTextView =findViewById(R.id.textView);
        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
                myImageView.setImageResource(R.drawable.presentation);
        Button mButton= findViewById(R.id.button);
    }
}