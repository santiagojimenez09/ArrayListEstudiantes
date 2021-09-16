package com.example.arraylist_estudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText jetcarnet,jetnombre,jetcarrera,jetsemestre;
    Button jbtguardar,jbtconsultar,jbteliminar,jbtcancelar,jbtpasar;
    ClsEstudiantes objestudiantes=new ClsEstudiantes();
    ArrayList<ClsEstudiantes> alestudiantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        jetcarnet=findViewById(R.id.etcarnet);
        jetnombre=findViewById(R.id.etnombre);
        jetcarrera=findViewById(R.id.etcarrera);
        jetsemestre=findViewById(R.id.etsemestre);
        jbtguardar=findViewById(R.id.btguardar);
        jbtconsultar=findViewById(R.id.btconsultar);
        jbteliminar=findViewById(R.id.bteliminar);
        jbtcancelar=findViewById(R.id.btcancelar);
        jbtpasar=findViewById(R.id.btpasar);

    }
}