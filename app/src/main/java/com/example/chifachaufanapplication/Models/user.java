package com.example.chifachaufanapplication.Models;

import java.util.ArrayList;
import java.util.List;

public class user {
    public String username;
    public  String password;


    public static Boolean passwordIsValid(String User, String Password){

        for (user i: getuser()){
            if(i.username.equals(User) && i.password.equals(Password)){
                return true;
            }
        }

        return false;
    }
    public static List<user> getuser(){
        ArrayList<user> list = new ArrayList<user>();
        user o = new user();
        o.username = "chifachaufan@gmail.com";
        o.password = "Chifa.chaufan2019";
        list.add(o);

        user t = new user();
        t.username = "jean";
        t.password = "123456";
        list.add(t);

        return list;

    }
}
