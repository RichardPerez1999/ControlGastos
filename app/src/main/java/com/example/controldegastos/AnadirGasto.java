package com.example.controldegastos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AnadirGasto extends AppCompatActivity {

    private Spinner spinnerCat, spinnerFrec;
    private EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadirgasto);
        spinnerCat = (Spinner)findViewById(R.id.spinnerCat);
        spinnerFrec = (Spinner)findViewById(R.id.spinnerFrec);

        String [] categoriasArray ={"Comida","Ocio","Transporte","Estudio"};
        String [] frecuenciasArray ={"1 vez","1 a 2 veces","2 a 4 veces","5 o mas"};

        ArrayAdapter <String> adapterCat = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, categoriasArray);
        spinnerCat.setAdapter(adapterCat);
        ArrayAdapter <String> adapterFrec = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, frecuenciasArray);
        spinnerFrec.setAdapter(adapterFrec);
    }
}
