package com.example.chifachaufanapplication.ReportesCliente;

import java.util.ArrayList;

public class DatosCliente {

    public  String NombreCliente;
    public  String NombreMesa;
    public  String Precio;

    public  DatosCliente(String _NombreCliente, String _NombreMesa, String _Precio) {
        this.NombreCliente = _NombreCliente;
        this.NombreMesa = _NombreMesa;
        this.Precio = _Precio;
    }

    public  String toString () {
        return this.NombreCliente;
    }

    // DATOS FICTICIOS 1
    public  static ArrayList<DatosCliente> getData () {
        ArrayList<DatosCliente> datosClientes = new ArrayList<>();
        datosClientes.add(new DatosCliente("Yesenia Quispe Aguilar",
        "Mesa01","s/70.00"));


        datosClientes.add(new DatosCliente("Jean Carlos Diaz Espejo",
                "Mesa02","s/60.00"));


        datosClientes.add(new DatosCliente("Joram Delgado Chavez",
                "Mesa03","s/80.00"));

        return datosClientes;
    }

}

