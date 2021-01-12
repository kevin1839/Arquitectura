/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import static MVP.MMovimiento.PAPEL;
import static MVP.MMovimiento.PIEDRA;
import static MVP.MMovimiento.TIJERA;

/**
 *
 * @author Sebastian F
 */
public class MComparador {
    
     public int compareMoves(MMovimiento uv,MMovimiento otherMove) {
        // Empate
        if (uv == otherMove) {
            return 0;
        }

        switch (uv) {
            case PIEDRA:

                return (otherMove == TIJERA ? 1 : -1);
            case PAPEL:

                return (otherMove == PIEDRA ? 1 : -1);
            case TIJERA:

                return (otherMove == PAPEL ? 1 : -1);
        }

        // Nunca debería llegar hasta aquí
        return 0;
    }

    public String resultado(int compareMoves, MMovimiento usuarioMove, MMovimiento computadoraMove) {
       int usuarioPuntos=0;
       int computadoraPuntos=0;
       int cantidadDeJuegos=0;
       
     
        switch (compareMoves) {
            case 0: // Empate

                System.out.println("Empate!");
                break;
            case 1: // Gana Usuario
                System.out.println(usuarioMove + " le gana a " + computadoraMove + ". Ganaste!");
                usuarioPuntos++;
                break;
            case -1: // Gana Computadora
                System.out.println(computadoraMove + " le gana a " + usuarioMove + ". Perdiste.");
                computadoraPuntos++;
                break;
        }
        cantidadDeJuegos++;
        return "";
    }
    

  
    
}
