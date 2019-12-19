package com.example.chifachaufanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MenuInicioActivity extends AppCompatActivity {

    ImageButton btnReportes;
    ImageButton btnEstadoReserva;
    ImageButton btnCarta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicio);

        btnReportes = findViewById(R.id.btnReportes);
        btnEstadoReserva = findViewById(R.id.btnEstadoReserva);
        btnCarta = findViewById(R.id.btnCarta);


        btnReportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MenuInicioActivity.this,
                        ReportesPorFechasActivity.class);
                startActivity(o);
            }
        });

        btnEstadoReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MenuInicioActivity.this,
                        ReportesPorFechasActivity.class);
                startActivity(o);
            }
        });

        btnCarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MenuInicioActivity.this,
                        //cambiar a carta no olvidar
                        ReportesPorFechasActivity.class);
                startActivity(o);
            }
        });

    }
}
