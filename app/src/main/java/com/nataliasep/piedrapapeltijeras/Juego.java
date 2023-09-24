package com.nataliasep.piedrapapeltijeras;

import java.util.Random;

public class Juego {

   public enum Imagen {
        PIEDRA, PAPEL, TIJERAS
    }
    public Imagen lanzarApuesta() {
        Random random = new Random();
        int aleatorio = random.nextInt(3);
        if (aleatorio == 0){
            return Imagen.PIEDRA;
        }else if( aleatorio == 1){
            return Imagen.PAPEL;
        }else {
            return Imagen.TIJERAS;
        }

    }
}
