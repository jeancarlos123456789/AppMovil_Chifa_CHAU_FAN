package com.example.chifachaufanapplication.Models;

import java.util.ArrayList;

public class Products {
   // public String imagen;
    public String name;
    public String cantidad;

    public Products(String _name, String _cant ){
        this.name = _name;
        this.cantidad = _cant;

    }

    public String toString(){
        return this.name;
    }


    //datos eficticios
    public  static ArrayList<Products> getData(){
        ArrayList<Products> products = new ArrayList<>();
        products.add(new Products("Chaufa con piña", "1"));
        products.add(new Products(
                "Chaufa con Tipakay", "1"));
        products.add(new Products("Chaufa con pollo",
                "2"));

        products.add(new Products("Tallarin saltado",
                "1"));

        return products;
    }
}


