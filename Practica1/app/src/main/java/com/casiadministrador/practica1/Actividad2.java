package com.casiadministrador.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class Actividad2 extends AppCompatActivity {
    EditText txtUsuario;
    EditText txtEmail;
    EditText txtTwitter;
    EditText txtTelefono;
    EditText txtFecha;
    Button Guardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        setTitle("Registrar Contacto");
        txtUsuario=(EditText)findViewById(R.id.txtUser);
        txtEmail=(EditText)findViewById(R.id.txtEmail);
        txtTwitter=(EditText)findViewById(R.id.txtTwitter);
        txtTelefono=(EditText)findViewById(R.id.txtTel);
        txtFecha=(EditText)findViewById(R.id.txtFecha);

        Guardar=(Button)findViewById(R.id.btnAgregar);

        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contacto c =new Contacto(txtUsuario.getText().toString(),txtEmail.getText().toString(),txtTwitter.getText().toString(),
                        txtTelefono.getText().toString(),txtFecha.getText().toString());
                        Intent intent=new Intent(getApplication(),Actividad2.class);
                intent.putExtra("user",c);
                setResult(RESULT_OK,intent);
                finish();

            }
        });


    }
}
