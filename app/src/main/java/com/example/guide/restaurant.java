package com.example.guide;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;



public class restaurant extends AppCompatActivity {

    private ListView maListViewPerso;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        //Récupération de la listview créée dans le fichier main.xml
        maListViewPerso = (ListView) findViewById(R.id.listviewperso);

        //Création de la ArrayList qui nous permettra de remplir la listView
        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> map;

        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "The Ocean, The Kingsbury");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "48 Janadhipathi Mawatha,Colombo ");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.ocean));
        //enfin on ajoute cette hashMap dans la arrayList
        listItem.add(map);

        //On refait la manip plusieurs fois avec des données différentes pour former les items de notre ListView

        map = new HashMap<String, String>();
        map.put("titre", "Shang Palace");
        map.put("description", "02 1 Galle Face Shangri-La Hotel, Colombo ");
        map.put("img", String.valueOf(R.drawable.shang));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("titre", "Flow");
        map.put("description", "200 Union Place Hilton Colombo Residences, Colombo");
        map.put("img", String.valueOf(R.drawable.flow));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("titre", "Capital Bar & Grill");
        map.put("description", "02 1 Galle Face, Colombo Shangri-La Hotel, Colombo");
        map.put("img", String.valueOf(R.drawable.capital));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("titre", "Noodles Restaurant");
        map.put("description","Galle Road A2 Cinnamon Grand Colombo, Colombo");
        map.put("img", String.valueOf(R.drawable.noddle));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("titre", "Graze Kitchen");
        map.put("description","Number 2 Sir Chittampalam A Gardiner Mawatha Hilton Colombo");
        map.put("img", String.valueOf(R.drawable.graze));
        listItem.add(map);
        //Création d'un SimpleAdapter qui se chargera de mettre les items présents dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.affichageitem,
                new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});

        //On attribue à notre listView l'adapter que l'on vient de créer
        maListViewPerso.setAdapter(mSchedule);

        //Enfin on met un écouteur d'évènement sur notre listView
        maListViewPerso.setOnItemClickListener(new OnItemClickListener() {
            @Override
            @SuppressWarnings("unchecked")
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                //on récupère la HashMap contenant les infos de notre item (titre, description, img)
                HashMap<String, String> map = (HashMap<String, String>) maListViewPerso.getItemAtPosition(position);
                //on créé une boite de dialogue
                AlertDialog.Builder adb = new AlertDialog.Builder(restaurant.this);
                //on attribue un titre à notre boite de dialogue
                adb.setTitle("Sélection Item");
                //on insère un message à notre boite de dialogue, et ici on affiche le titre de l'item cliqué
                adb.setMessage("Votre choix : "+map.get("titre"));
                //on indique que l'on veut le bouton OK à notre boite de dialogue
                adb.setPositiveButton("OK", null);
                //on affiche la boite de dialogue
                adb.show();
            }
        });

    }
}