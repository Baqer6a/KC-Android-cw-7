package com.example.cw7a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Items> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items Item1 = new Items("cheese", 2.0 , R.drawable.cheese);
        Items Item2 = new Items("chocolate", 1.0 , R.drawable.chocolate);
        Items Item3 = new Items("coffee", 3.0 , R.drawable.coffee);
        Items Item4 = new Items("fries", 1.0 , R.drawable.fries);
        Items Item5 = new Items("honey", 5.0 , R.drawable.honey);

        item.add(Item1);
        item.add(Item2);
        item.add(Item3);
        item.add(Item4);
        item.add(Item5);

        ItemAdapter itemAdapter = new ItemAdapter(this, 0, item);
        ListView lista = findViewById(R.id.lista);
        lista.setAdapter(itemAdapter);

    }
}