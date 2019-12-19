package com.example.chifachaufanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrarseActivity extends AppCompatActivity {

    Button btnRegresar;
    Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        btnRegresar = findViewById(R.id.btnRegresar);
        btnAceptar = findViewById(R.id.btnAceptar);

        //        Regresar
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(RegistrarseActivity.this,
                        LoginActivity.class);
                startActivity(o);
            }
        });

//        Aceptar
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(RegistrarseActivity.this,
                        LoginActivity.class);
                startActivity(o);
            }
        });

    }
}
