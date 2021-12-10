package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Button mcuisine = findViewById(R.id.button3);
        Button mbudget = findViewById(R.id.button6);
        Button mprix = findViewById(R.id.button7);
        Button mvisiter = findViewById(R.id.button8);


        mcuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this, Cuisine.class);
                startActivity(intent);
            }
        });

        mbudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this, budget.class);
                startActivity(intent);
            }
        });

        mprix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this, prix.class);
                startActivity(intent);
            }
        });
        mvisiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this, visite.class);
                startActivity(intent);
            }
        });


    }

}


