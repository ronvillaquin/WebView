package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText caja_texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja_texto = (EditText)findViewById(R.id.caja_texto);
    }

    public void Navegar(View vista){
        Intent siguiente = new Intent(this, VistaNavegador.class);
        siguiente.putExtra("web", caja_texto.getText().toString());
        startActivity(siguiente);
    }
}
