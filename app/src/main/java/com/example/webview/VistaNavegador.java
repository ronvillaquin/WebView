package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VistaNavegador extends AppCompatActivity {

    // como trabajamos con un webview se crea defaul sin privado ni publico porque lo necesitamos
    // que tenga todo el acceso

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_navegador);

        wv1 = (WebView)findViewById(R.id.webView);

        //creamos la varible para recibir el dato que trae el activiti anterior
        String dato = getIntent().getStringExtra("web");

        //con estas ineas cargamos el sitio web o le decimos que navegue dentro de nuestra app
        //con setwebviewclient abre la web dentro de nuestra app mediante el webview
        wv1.setWebViewClient(new WebViewClient());
        // ahora le clocamos la direccion web a la que deseamos ingresar
        //como programador se prevee lo que ingresa el usuario y se coloca todo lo que necesita
        // una web para el acceso
        wv1.loadUrl("https://"+dato);
    }

    public void btnCerrar(View vista){
        // para ahorrarce todas las lineas de abajo esta el metodo finish() ppara finalizar
        //el activity doonde estamos y regresa a un activiti anterior
        finish();

        // con el metodo finish() ahraams estas lineas y mata el activity y vuelve a la pantalla anterior
        //Intent i = new Intent(this, MainActivity.class);
        // startActivity(i);

        // tambien hay que darle permisos para que pueda navegar desde nuestra app
        // en la capeta app y manifest y android manifest
        // se abre el archivo y se coloca una linea de codigo para los permisos
        // el codigo se pne al final de la linea o una linea abajo de donde dice package
        //<uses-permission android:name="android.permission.INTERNET"/>
        //con esa linea se da los permisos para que use el internet al igual q otros componentes del celular
    }
}
