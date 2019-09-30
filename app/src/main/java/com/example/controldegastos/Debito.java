package com.example.controldegastos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Debito extends AppCompatActivity {
    private Spinner spinnerTar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debito);
        spinnerTar = (Spinner)findViewById(R.id.spinner3);
        String [] Tipos ={"Visa", "MasterCard" ,"Diners Club","American Express"};

        ArrayAdapter<String> adapterCat = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, Tipos);
        spinnerTar.setAdapter(adapterCat);
    }
}
