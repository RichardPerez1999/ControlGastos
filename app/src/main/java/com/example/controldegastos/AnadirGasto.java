package com.example.controldegastos;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.gson.*;

import com.example.controldegastos.ui.main.Gasto;

import java.net.URL;

public class AnadirGasto extends AppCompatActivity {

    Spinner Cat, mPago;
    EditText Monto, Fecha, Hora, Frec, Desc;
    Button buttonAgregar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadirgasto);

        Cat =(Spinner)findViewById(R.id.spinnerCat);
        Frec =(EditText)findViewById(R.id.InFrec);
        mPago = (Spinner)findViewById(R.id.spinnerMetodo);
        Monto = (EditText)findViewById(R.id.InMonto);
        Fecha = (EditText)findViewById(R.id.InFecha);
        Hora = (EditText)findViewById(R.id.InHora);
        Desc = (EditText)findViewById(R.id.InDescripcion);
        buttonAgregar = (Button)findViewById(R.id.buttonAgregar);

        String [] CategoriasArray = {"Hogar", "Salud", "Transporte", "Ropa y calzado", "Cuentas y pagos", "Seguros", "Estetica", "Diversion", "Otros gastos"};
        String [] MetodosArray;

        ArrayAdapter<String> adapterCat = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, CategoriasArray);
        Cat.setAdapter(adapterCat);

        buttonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gasto gasto = new Gasto(null,(String)Cat.getSelectedItem(),Fecha.getText().toString().toString(),Hora.getText().toString(),mPago.getSelectedItem().toString(),Desc.getText().toString(),Integer.parseInt(Monto.getText().toString()),Integer.parseInt(Frec.getText().toString()));

                new SimpleTask().execute(gasto);
            }
        });

    }



    private class SimpleTask extends AsyncTask<Gasto,Integer,String> {
        protected void onPreExecute() {
            buttonAgregar.setEnabled(false);
        }

        @Override
        protected String doInBackground(Gasto... gastos) {
            gastos.toString();
            Gson gson = new Gson();
            String json = gson.toJson(gastos);
            URL url = null;

            return "Gasto Enviado al servidor";
        }






        protected void onPostExecute (Result result){
            buttonAgregar.setEnabled(true);
        }


        /*
        Se hace visible el botón "Cancelar" y se desactiva
        el botón "Ordenar"
         */



    }



   /* private void EjecutarServicio(){
        Gasto gasto = new Gasto(null,(String)Cat.getSelectedItem(),Fecha.getText().toString().toString(),Hora.getText().toString(),mPago.getSelectedItem().toString(),Desc.getText().toString(),Integer.parseInt(Monto.getText().toString()),Integer.parseInt(Frec.getText().toString()));
        gasto.toString();
        Gson gson = new Gson();
        String json = gson.toJson(gasto);
    }*/
}
