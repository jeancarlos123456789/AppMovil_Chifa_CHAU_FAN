package com.example.chifachaufanapplication.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.chifachaufanapplication.R;
import com.example.chifachaufanapplication.ReportesCliente.DatosCliente;

import java.util.List;

public class datoclienteadapter  extends ArrayAdapter<DatosCliente> {
        Context context;
//ImageLoader queue;

private class ViewHolder {
    //NetworkImageView image;
    TextView NombreCliente;
    TextView NombreMesa;
    TextView Precio;
    //ImageButton btnAddToBag;

    private ViewHolder() {
    }
}

    public datoclienteadapter(Context context,
                               List<DatosCliente> items) {
        super(context, 0, items);
        this.context = context;
        // this.queue = _queue;
    }



    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final DatosCliente rowItem = (DatosCliente) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_datocliente_item, null);
            holder = new ViewHolder();
//            holder.image = (ImageView) convertView.findViewById(R.id.image);
//            holder.image = (NetworkImageView)convertView.findViewById(R.id.image);
            holder.NombreCliente = (TextView) convertView.findViewById(R.id.NombreCliente);
            holder.NombreMesa = (TextView) convertView.findViewById(R.id.NombreMesa);
            holder.Precio = (TextView) convertView.findViewById(R.id.Precio);

//            holder.category = (TextView) convertView.findViewById(R.id.category);
//            holder.btnAddToBag = (ImageButton) convertView.findViewById(R.id.btnAddToBag);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.NombreCliente.setText(rowItem.NombreCliente);
        holder.NombreMesa.setText(rowItem.NombreMesa);
        holder.Precio.setText(rowItem.Precio);
//        holder.category.setText(rowItem.getCategory());
//
//        if ( rowItem.getSmallImage() != null ) {
//            holder.image.setImageUrl(
//                    rowItem.getSmallImage(), queue);
//        }

//        holder.btnAddToBag.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                ProductListActivity activity = (ProductListActivity) context;
//                activity.selectProduct(position);
//
//            }
//        });


//        holder.image.setImageBitmap(rowItem.getSmallBitMap());
        return convertView;
    }
}

