package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class recette extends AppCompatActivity {
    ImageButton mroti;
    ImageButton mpatisse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recette);
       mroti = (ImageButton) findViewById(R.id.roti);
        mpatisse =(ImageButton)findViewById(R.id.patisse);

        mpatisse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(recette.this, patisse.class);
                startActivity(intent);
            }
        });

        mroti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(recette.this, roti.class);
                startActivity(intent);
            }
        });
    }

}