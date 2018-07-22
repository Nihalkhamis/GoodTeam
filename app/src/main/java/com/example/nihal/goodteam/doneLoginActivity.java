package com.example.nihal.goodteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class doneLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Info> infos = new ArrayList<>();

        String names[] = {"Nihal" , "Nadine" , "Toka" , "Aly" , "Amr"};
        int ids[] = {10 , 20 , 30 , 40};

        for (int i=0; i<ids.length; i++){

            Info info = new Info(names[i],ids[i]);
            infos.add(info);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        InfoAdapter infoAdapter = new InfoAdapter(infos);
        recyclerView.setAdapter(infoAdapter);

    }
}
