package com.example.logdesign;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class display_product_info extends AppCompatActivity {

    List<Product> productList;
    RecyclerView recyclerView;
    private RecyclerView.Adapter madapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_product_info);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList = new ArrayList<>();


            for(int i=0;i<20;i++)
            {
                productList.add(new Product("1","Vim"));
            }

        ProductAdapter adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);

        madapter=new ProductAdapter(com.example.logdesign.display_product_info.this,productList);
        recyclerView.setAdapter(madapter);
    }
    }
