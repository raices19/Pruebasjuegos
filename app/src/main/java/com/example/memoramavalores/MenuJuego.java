package com.example.memoramavalores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuJuego extends AppCompatActivity {

    Button bttnregreso;
    TextView puntos, falla, tiempo;

    int intpunto=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_juego);
        getSupportActionBar().hide();

        bttnregreso=(Button) findViewById(R.id.btnregreso);

        bttnregreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina1 = new Intent(MenuJuego.this,MainActivity.class);
                startActivity(pagina1);
            }
        });

    }
}
