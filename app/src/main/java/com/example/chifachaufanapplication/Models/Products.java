package com.example.chifachaufanapplication.Models;

import java.util.ArrayList;

public class Products {
    public String name;
    public String descripcion;

    public Products(String _name, String _desc){
        this.name = _name;
        this.descripcion = _desc;
    }

    public String toString(){
        return this.name;
    }


    //datos eficticios
    public  static ArrayList<Products> getData(){
        ArrayList<Products> products = new ArrayList<>();
        products.add(new Products("Galletas",
        "Galletas deliciosas"));
        products.add(new Products("Chocolate",
                "Chocolate sublime"));
        products.add(new Products("Caramelo",
                "Caramelo de limon"));
        return products;
    }
}


