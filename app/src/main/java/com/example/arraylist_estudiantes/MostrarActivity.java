package com.example.arraylist_estudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MostrarActivity extends AppCompatActivity {

    Button jbtregresar;
    ListView jlvestudiantes;
    ArrayList<ClsEstudiantes> alestudiantes;
    ClsEstudiantes objestudiantes;
    ArrayAdapter<ClsEstudiantes> adestudiantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        getSupportActionBar().hide();
        jbtregresar=findViewById(R.id.btregresar);
        jlvestudiantes=findViewById(R.id.lvestudiantes);
        alestudiantes=(ArrayList<ClsEstudiantes>) getIntent().getSerializableExtra("Listas");
        adestudiantes=new ArrayAdapter<ClsEstudiantes>(this, android.R.layout.simple_list_item_1,alestudiantes);
        jlvestudiantes.setAdapter(adestudiantes);

    }

    public void Regresar(View view){
        Intent intregresar=new Intent(this,MainActivity.class);
        startActivity(intregresar);
    }
}