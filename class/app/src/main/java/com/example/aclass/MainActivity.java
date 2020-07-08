package com.example.aclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokmon> a = new ArrayList<>();
        pokmon p1 = new pokmon("Charizard",R.drawable.charizard,84,78,534);
        a.add(p1);
        RecyclerView rv = findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager x = new LinearLayoutManager(this);
        rv.setLayoutManager(x);

    }
}

























