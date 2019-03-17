package com.example.memoramavalores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuJuego extends AppCompatActivity {

    Button bttnjuego;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_juego);

        bttnjuego=(Button) findViewById(R.id.btnjuego);

        bttnjuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina2 = new Intent(MenuJuego.this,MainActivity.class);
                startActivity(pagina2);
            }
        });

    }
}
