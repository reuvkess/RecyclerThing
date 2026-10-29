package com.example.recyclerviewtest;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Item> items;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        items = new ArrayList<Item>();
        recyclerView = findViewById(R.id.recycler);
        Item item1 = new Item("RP", "NN", R.drawable.ic_launcher_background);
        Item item2 = new Item("TJ", "IZ", R.drawable.ic_launcher_background);
        Item item3 = new Item("PP", "IP", R.drawable.ic_launcher_background);
        Item item4 = new Item("IL", "LK", R.drawable.ic_launcher_background);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        MyAdapter adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}