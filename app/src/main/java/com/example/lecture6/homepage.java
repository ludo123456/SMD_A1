package com.example.lecture6;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class homepage extends AppCompatActivity {
    RecyclerView rv;
    List<itemModel> ls;

    myAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new home()).commit();
        BottomNavigationView navbar = findViewById(R.id.navbar);


//        ls = new ArrayList<>();
//        ls.add(new itemModel("item name 1" , "price 1", "loc 1", "date 1"));
//        ls.add(new itemModel("item name 2" , "price 2", "loc 2", "date 2"));
//        ls.add(new itemModel("item name 3" , "price 3", "loc 3", "date 3"));
//        ls.add(new itemModel("item name 4" , "price 4", "loc 4", "date 4"));
//        ls.add(new itemModel("item name 5" , "price 5", "loc 5", "date 5"));
//        ls.add(new itemModel("item name 6" , "price 6", "loc 6", "date 6"));
//        adapter = new myAdapter(homepage.this,ls);
//        RecyclerView.LayoutManager lm = new LinearLayoutManager(homepage.this,RecyclerView.HORIZONTAL,false);

//        rv = findViewById(R.id.rv);





//        View v = getLayoutInflater().inflate(R.layout.fragment_home,null);
//        rv = (RecyclerView) v.findViewById(R.id.rv);
        navbar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment my = new home();
                int id = item.getItemId();
                if (id==R.id.home){
                    my = new home();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,my).commit();

                return true;
            }
        });



//        rv.setLayoutManager(lm);
//        rv.setAdapter(adapter);

    }
}