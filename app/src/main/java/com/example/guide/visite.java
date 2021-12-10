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



public class visite extends AppCompatActivity {

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
        map.put("titre", "Gangaramaya Temple");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "Le temple Gangaramaya est l'un des temples les plus importants de Colombo, au Sri Lanka, étant un mélange d'architecture moderne et d'essence culturelle. ");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.ganaya));
        //enfin on ajoute cette hashMap dans la arrayList
        listItem.add(map);

        //On refait la manip plusieurs fois avec des données différentes pour former les items de notre ListView

        map = new HashMap<String, String>();
        map.put("titre", "Dent de Boudha");
        map.put("description", "Le Temple de la Dent, ou Sri Dalada Maligawa, est un temple bouddhiste de Kandy, l'ancienne capitale du Sri Lanka.");
        map.put("img", String.valueOf(R.drawable.boudha));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("titre", "Balade en éléphant");
        map.put("description", "Endroit où se trouver beaucoup d'éléphants dans la nature");
        map.put("img", String.valueOf(R.drawable.elephant));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("titre", "Kandy");
        map.put("description", "Kandy est une grande ville du centre du Sri Lanka. Elle est située sur un plateau entouré de montagnes couvertes de forêt tropicale à la riche biodiversité et qui abritent des plantations de thé");
        map.put("img", String.valueOf(R.drawable.kandy));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("titre", "Lipton");
        map.put("description","Belvédère et café aux vues panoramiques remarquables, à côté de fermes de production de thé historiques.");
        map.put("img", String.valueOf(R.drawable.tea));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("titre", "Sigriya");
        map.put("description","C'est est un site archéologique majeur, ancienne capitale royale du Sri Lanka et un site touristique important. ");
        map.put("img", String.valueOf(R.drawable.sigriya));
        listItem.add(map);



        map = new HashMap<String, String>();
        map.put("titre", "National Parc");
        map.put("description","Parc national du pays ");
        map.put("img", String.valueOf(R.drawable.nationalpark));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("titre", "Temple de Jaffna");
        map.put("description","Lieu religieux ");
        map.put("img", String.valueOf(R.drawable.jaffna));
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
                AlertDialog.Builder adb = new AlertDialog.Builder(visite.this);
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