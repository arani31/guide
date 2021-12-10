package com.example.guide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.animation.AnimationUtils;

public class prix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prix);

        Button bH= findViewById(R.id.Hebergement);
        Button bVol = findViewById(R.id.Vol);
        Button bVH = findViewById(R.id.VH);
        Button bLoc = findViewById(R.id.Loc);

        bLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://voiture.opodo.fr/fr/?clientId=314911#/searchcars");
            }
        });

        bH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://www.booking.com/dealspage.fr.html?selected_currency=EUR&lang=fr&label=opo-link-fr-seodp-conf-pc-of&aid=361908");
            }
        });

        bVol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://www.opodo.fr/billets-avion/");
            }
        });

        bVH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://www.opodo.fr/vacances/");
            }
        });
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}