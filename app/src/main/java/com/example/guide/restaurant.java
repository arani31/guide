package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class restaurant extends AppCompatActivity {

        private ArrayList<lieux> lieuxList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        lieuxList = new ArrayList<>();

        Resources res =getResources();
        String [] allLieux = res.getStringArray(R.array.lieux );
        String [] alladress = res.getStringArray(R.array.adresse);
        pupoluatelieuxList (allLieux ,alladress);

         LieuxAdapter adapter =new LieuxAdapter(getApplicationContext(), R.layout.list_item,lieuxList);
    ListView listview =findViewById(R.id.lieux_list);
    listview.setAdapter(adapter);
    }
    public void pupoluatelieuxList(String[] lieux, String [] adresse){

       lieuxList.add(new lieux( lieux[0], adresse[0],R.drawable.ocean ));
    }

}