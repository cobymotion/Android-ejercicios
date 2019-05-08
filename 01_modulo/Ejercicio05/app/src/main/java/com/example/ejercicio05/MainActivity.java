package com.example.ejercicio05;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtMensaje)
    TextView mensaje;
    @BindView(R.id.spinner)
    Spinner mySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        String []opciones = {"Negritas","Cursivas"};
        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,opciones);
        mySpinner.setAdapter(adapter);
        mySpinner.setOnItemSelectedListener(new AdapterView
                .OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent,
                                       View view, int position,
                                       long id) {
                String opcion = mySpinner.getSelectedItem().toString();
                switch (opcion){
                    case "Negritas":
                        mensaje.setTypeface(null, Typeface.BOLD);
                        break;
                    case "Cursivas":
                        mensaje.setTypeface(null, Typeface.ITALIC);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
