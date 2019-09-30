package com.example.controldegastos.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TableLayout;

import com.example.controldegastos.R;



public class DiaFragment extends Fragment {
    private  TableLayout tableLayout;
    private EditText txtGasto;
    private  EditText txtValor;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_dia, container, false);
        // Inflate the layout for this fragment
        tableLayout=(TableLayout) view.findViewById(R.id.table);
        txtGasto=(EditText) view.findViewById(R.id.txtgasto);
        txtValor=(EditText) view.findViewById(R.id.txtvalor);
        return view;
    }

}
