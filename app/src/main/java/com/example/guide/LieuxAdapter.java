package com.example.guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LieuxAdapter extends ArrayAdapter<restaurant> {
    private ArrayList<lieux> lieuxList;

    public LieuxAdapter(@NonNull Context context, int resource, ArrayList<lieux> lieuxList) {
        super(context, resource);
        this.lieuxList = lieuxList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       int phraseIndex = position ;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        ImageView lieuxImage = convertView.findViewById(R.id.image_restaurant);
        TextView titleTextView = convertView.findViewById(R.id.titreresto);
        TextView adressTextView = convertView.findViewById(R.id.adresse);

        lieuxImage.setImageResource(lieuxList.get(position).getRestoImageId());
        titleTextView.setText(lieuxList.get(position).getNomduresto());
        adressTextView.setText(lieuxList.get(position).getAdresseresto());
        return convertView;
    }
}
