package com.example.arraylist_estudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText jetcarnet,jetnombre,jetcarrera,jetsemestre;
    Button jbtguardar,jbtconsultar,jbteliminar,jbtcancelar,jbtpasar;
    ClsEstudiantes objestudiantes=new ClsEstudiantes();
    ArrayList<ClsEstudiantes> alestudiantes;
    int pos,sw;


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
        alestudiantes=new ArrayList<ClsEstudiantes>();

    }

    public void Guardar(View view){
        String carnet, nombre,carrera,semestre;
        carnet=jetcarnet.getText().toString();
        nombre=jetnombre.getText().toString();
        carrera=jetcarrera.getText().toString();
        semestre=jetsemestre.getText().toString();
        if (carnet.isEmpty() || nombre.isEmpty() || carrera.isEmpty() || semestre.isEmpty()){
            Toast.makeText(this,"Todos los datos son requeridos",Toast.LENGTH_LONG).show();
            jetcarnet.requestFocus();
        }
        else{
            if(sw==1) {
                alestudiantes.get(pos).setNombre(nombre);
                alestudiantes.get(pos).setCarrera(carrera);
                alestudiantes.get(pos).setSemestre(semestre);
                Toast.makeText(this, "Registro Modificado", Toast.LENGTH_LONG).show();
                limpiar_datos();
                sw=0;
            }else{
                consultar_datos();
                if (sw==0) {
                    objestudiantes = new ClsEstudiantes(carnet, nombre, carrera, semestre);
                    alestudiantes.add(objestudiantes);
                    Toast.makeText(this, "Registro guardado con exito", Toast.LENGTH_LONG).show();
                    limpiar_datos();
                }
                else{
                    limpiar_datos();
                    Toast.makeText(this,"Estudiante ya registrado",Toast.LENGTH_LONG).show();
                    sw=0;
                }

            }



        }
    }

    public void Consultar(View view){
        consultar_datos();
    }

    public void Eliminar(View view){
        if(sw==1){
            alestudiantes.remove(pos);
            Toast.makeText(this, "Registo Eliminado", Toast.LENGTH_SHORT).show();
            limpiar_datos();
            sw=0;
        }else{
            Toast.makeText(this, "Debe primero buscar", Toast.LENGTH_SHORT).show();
            jetcarnet.requestFocus();
        }
    }

    public void Cancelar(View view){
        limpiar_datos();
    }

    private void limpiar_datos(){
        jetcarnet.setText("");
        jetnombre.setText("");
        jetcarrera.setText("");
        jetsemestre.setText("");
        jetcarnet.requestFocus();
    }

    private void consultar_datos(){
        String carnet;
        pos=0;
        sw=0;
        carnet=jetcarnet.getText().toString();
        if(carnet.isEmpty()){
            Toast.makeText(this,"El numero de carnet es requerido",Toast.LENGTH_LONG).show();
            jetcarnet.requestFocus();
        }else{
            while (pos<alestudiantes.size() && sw==0){
                objestudiantes=alestudiantes.get(pos);
                if(objestudiantes.getCarnet().equals(carnet))
                    sw=1;
                else
                    pos++;
            }
            if (sw==0)
                Toast.makeText(this,"Estudiante no registrado",Toast.LENGTH_LONG).show();
            else {
                jetnombre.setText(objestudiantes.getNombre());
                jetcarrera.setText(objestudiantes.getCarrera());
                jetsemestre.setText(objestudiantes.getSemestre());
            }
            jetcarnet.requestFocus();
        }
    }
}