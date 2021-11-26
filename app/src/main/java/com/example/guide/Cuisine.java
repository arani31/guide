package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Cuisine extends AppCompatActivity {
    ImageButton mrecette ;
    ImageButton mrestaurant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);
       mrecette = (ImageButton) findViewById(R.id.recette);
       mrestaurant =(ImageButton)findViewById(R.id.restuarant) ;

       mrecette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cuisine.this, restaurant.class);
                startActivity(intent);
            }
        });
        mrestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cuisine.this, recette.class);
                startActivity(intent);
            }
        });
    }



}