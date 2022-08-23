package com.example.cw7a;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter {
    List<Items> itemsList;
    public ItemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        itemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View V = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);
        Items itemv = itemsList.get(position);

        TextView tName = V.findViewById(R.id.itemName);
        TextView tprice = V.findViewById(R.id.itemPrice);
        ImageView iimage = V.findViewById(R.id.itemImage);

        tName.setText(itemv.getItemName());
        tprice.setText(String.valueOf(itemv.getItemPrice()));
        iimage.setImageResource(itemv.getItemImage());


     return V;
    }
}
