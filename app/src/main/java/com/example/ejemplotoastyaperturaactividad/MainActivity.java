package com.example.ejemplotoastyaperturaactividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutarToast(View view){
        Toast notificacion = Toast.makeText(this,
                "Ejecutando Toast",Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void abrirAcercaDe(View view){
        Intent ventana = new Intent(this, AcercaDe.class);
        startActivity(ventana);
    }
}
