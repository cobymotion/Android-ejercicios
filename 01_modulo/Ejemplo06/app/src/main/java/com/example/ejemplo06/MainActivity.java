package com.example.ejemplo06;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtCategoria)
    TextView txtCategoria;
    @BindView(R.id.listCategoria)
    ListView lista;

    private String productos[] = {"Computadora","Mouse","Dulces"
                                ,"Lapices","Lentes","Reloj",
                                "Cuchara","Celular", "Mesa",
                                "Refrigerador","Horno","Audifonos"};

    private String categorias[] = {"Electronica","Electronica",
                                "Dulceria","Papeleria","Papeleria",
                                "Moda","Perfumeria","Hogar",
                                "Electronicos","Hogar",
                                "Electrodomesticos","Electrodomesticos"
                                ,"Electronica"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                                productos);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtCategoria.setText("Categoria:"+
                        categorias[position]);
            }
        });

    }
}
