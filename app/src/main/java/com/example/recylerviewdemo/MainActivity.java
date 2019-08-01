package com.example.recylerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User one","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User two","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User tree","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User four","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User five","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User six","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User seven","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User one","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User two","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User tree","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User four","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User five","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User six","My name is Shuvo"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User seven","My name is Shuvo"));


        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}
