package com.example.controldegastos;
import cz.msebera.android.httpclient.Header;
import com.google.gson.*;
import com.loopj.android.http.*;
import com.example.controldegastos.ui.main.Gasto;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Efectivo extends AppCompatActivity {

    EditText Monto, Fecha, Descrip;
    Button buttonAgregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);
    }
}
