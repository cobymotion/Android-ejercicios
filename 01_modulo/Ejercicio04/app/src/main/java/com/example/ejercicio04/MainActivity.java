package com.example.ejercicio04;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.CheckBox;

import com.google.android.material.textfield.TextInputEditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edNumero)
    TextInputEditText edNumero;
    @BindView(R.id.checkBold)
    CheckBox chkBold;
    @BindView(R.id.checkItalic)
    CheckBox chkItalic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.checkBold)
    public void checkBold(){
       verificaCambios();
    }

    @OnClick(R.id.checkItalic)
    public void checkItalic(){
       verificaCambios();
    }

    private void verificaCambios() {
        if(chkBold.isChecked() && chkItalic.isChecked())
            edNumero.setTypeface(null, Typeface.BOLD_ITALIC);

    }

}
