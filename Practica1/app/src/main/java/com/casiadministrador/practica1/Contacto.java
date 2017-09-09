package com.casiadministrador.practica1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class Contacto implements Serializable {
        String Usuario;
        String Email;
        String Twitter;
        String Telefono;
        String Fecha;


public Contacto (String usuario,String email,String twitter,String Telefono,String Fecha){
    this.Usuario= usuario;
    this.Email=email;
    this.Fecha=Fecha;
    this.Twitter=twitter;
    this.Telefono=Telefono;
}


public String getUsuario() {return Usuario;}
    public String getEmail() {return Email;}
}




