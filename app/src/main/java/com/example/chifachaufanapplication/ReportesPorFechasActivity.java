package com.example.chifachaufanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chifachaufanapplication.ReportesCliente.DatosCliente;
import com.example.chifachaufanapplication.adapters.datoclienteadapter;

import java.util.Calendar;

public class ReportesPorFechasActivity extends AppCompatActivity {
    ListView DatosClienteList;
    ImageButton btnDate1;
    ImageButton btnDate2;
    Calendar calendar;
    String cero = "0";
    String slash = "/";

    EditText txtFecha1;
    EditText txtFecha2;

//    regresar
    ImageButton btnRegresarFlecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes_por_fechas);
        DatosClienteList = findViewById(R.id.listadeDatoscliente);

        datoclienteadapter adapter = new datoclienteadapter(
                this, DatosCliente.getData());

        DatosClienteList.setAdapter(adapter);

        txtFecha1 = findViewById(R.id.txtFecha1);
        txtFecha2 = findViewById(R.id.txtFecha2);
        btnDate1 = (ImageButton) findViewById(R.id.btnDate1);
        btnDate2 = (ImageButton) findViewById(R.id.btnDate2);

        btnRegresarFlecha = findViewById(R.id.imgbtnRegresarFlecha);


//        Dato1===========================
        btnDate1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });



// Dato2========================

        btnDate2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });

        // regresar
        btnRegresarFlecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(ReportesPorFechasActivity.this,
                        MenuInicioActivity.class);
                startActivity(o);
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();
        calendar = Calendar.getInstance();
        String _date = calendar.get(Calendar.DAY_OF_MONTH) + slash + calendar.get(Calendar.MONTH) + slash + calendar.get(Calendar.YEAR);
//        btnDate.setText(_date);
    }


    private void showDatePicker() {
        DatePickerDialog recogerFecha = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                //Esta variable lo que realiza es aumentar en uno el mes ya que comienza desde 0 = enero
                final int mesActual = month + 1;
                //Formateo el día obtenido: antepone el 0 si son menores de 10
                String diaFormateado = (dayOfMonth < 10)? cero + String.valueOf(dayOfMonth):String.valueOf(dayOfMonth);
                //Formateo el mes obtenido: antepone el 0 si son menores de 10
                String mesFormateado = (mesActual < 10)? cero + String.valueOf(mesActual):String.valueOf(mesActual);
                //Muestro la fecha con el formato deseado
                txtFecha1.setText(diaFormateado + slash + mesFormateado + slash + year);
                txtFecha2.setText(diaFormateado + slash + mesFormateado + slash + year);
//                btnDate


            }
            //Estos valores deben ir en ese orden, de lo contrario no mostrara la fecha actual
            /**
             *También puede cargar los valores que usted desee
             */
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        //Muestro el widget
        recogerFecha.show();
    }


}
