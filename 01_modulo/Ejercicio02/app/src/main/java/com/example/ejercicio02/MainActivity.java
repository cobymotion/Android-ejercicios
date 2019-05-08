package com.example.ejercicio02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtNumero1)
    EditText txtNyumero1;
    @BindView(R.id.txtNumero2)
    EditText txtNyumero2;

    @BindView(R.id.rdSuma)
    RadioButton rdSuma;
    @BindView(R.id.rdResta)
    RadioButton rdResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnCalculo)
    public void hacerCalculo(){
        int res = 0;
        int num1 = Integer.parseInt(txtNyumero1.getText().toString());
        int num2 = Integer.parseInt(txtNyumero2.getText().toString());
        if(rdSuma.isChecked())
            res= num1 + num2;
        else if(rdResta.isChecked())
            res= num1 - num2;
        Toast.makeText(this, "El resultado de la operacion es " + res,
                 Toast.LENGTH_LONG).show();
    }
}
