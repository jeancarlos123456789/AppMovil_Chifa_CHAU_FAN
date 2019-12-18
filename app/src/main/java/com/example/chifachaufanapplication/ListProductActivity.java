package com.example.chifachaufanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.chifachaufanapplication.Models.Products;
import com.example.chifachaufanapplication.adapters1.ProductAdapter;

public class ListProductActivity extends AppCompatActivity {
   ListView productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);
        productList = findViewById(R.id.listaproductos);

        ProductAdapter adapter = new ProductAdapter(
                this, Products.getData());

        productList.setAdapter(adapter);

    }
}
