package com.nataliasep.piedrapapeltijeras;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView IVImagen = findViewById(R.id.IVImagen);
        Button BPiedra = findViewById(R.id.BPiedra);
        Button BPapel = findViewById(R.id.BPapel);
        Button BTijeras = findViewById(R.id.BTijeras);
        Button BRestart = findViewById(R.id.BRestart);
        TextView TResultado = findViewById(R.id.TResultado);
        Juego juego = new Juego();

        View.OnClickListener listener = view -> {
            int id = view.getId();
            Juego.Imagen imagen = juego.lanzarApuesta();
            switch (imagen) {
                case PIEDRA:
                   IVImagen.setImageResource(R.drawable.pedra);
                   if (id == R.id.BPiedra){
                       TResultado.setText("Has empatado");
                   }else if (id == R.id.BPapel){
                       TResultado.setText("¡¡Has ganado :) !!!!");
                   }else{
                       TResultado.setText("Pierdes >:(");
                   }
                   break;

                case PAPEL:
                    IVImagen.setImageResource(R.drawable.paper);
                    if (id == R.id.BPiedra){
                        TResultado.setText("Pierdes >:(");
                    }else if (id == R.id.BPapel){
                        TResultado.setText("Has empatado");
                    }else{
                        TResultado.setText("¡¡Has ganado :) !!!!");
                    }
                    break;

                case TIJERAS:
                    IVImagen.setImageResource(R.drawable.tisores);
                    if (id == R.id.BPiedra){
                        TResultado.setText("¡¡Has ganado :) !!!!");
                    }else if (id == R.id.BPapel){
                        TResultado.setText("Pierdes >:(");
                    }else{
                        TResultado.setText("Has empatado");
                    }
                    break;
            }

        };
        BPiedra.setOnClickListener(listener);
        BPapel.setOnClickListener(listener);
        BTijeras.setOnClickListener(listener);


    }



}