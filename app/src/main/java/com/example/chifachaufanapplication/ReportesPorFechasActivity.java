package com.example.chifachaufanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.chifachaufanapplication.ReportesCliente.DatosCliente;
import com.example.chifachaufanapplication.adapters.datoclienteadapter;

public class ReportesPorFechasActivity extends AppCompatActivity {
    ListView DatosClienteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes_por_fechas);
        DatosClienteList = findViewById(R.id.listadeDatoscliente);

        datoclienteadapter adapter = new datoclienteadapter(
                this, DatosCliente.getData());

        DatosClienteList.setAdapter(adapter);

    }
}
