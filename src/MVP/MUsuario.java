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
public class MUsuario {
    
    public MMovimiento getMov(String usuarioInput){

    usuarioInput = usuarioInput.toUpperCase();
    char firstLetter = usuarioInput.charAt(2);
    if (firstLetter == 'E' || firstLetter == 'P' || firstLetter == 'J') {
        // Usuario ha ingresado un dato válido
        switch (firstLetter) {
        case 'E':
            return MMovimiento.PIEDRA;
        case 'P':
            return MMovimiento.PAPEL;
        case 'J':
            return MMovimiento.TIJERA;
        }
    }
        System.out.println("");
    // Usuario no ha ingresado un dato válido. Solicitar nuevamente.
    return getMov(usuarioInput);
    }
    
  
 
}
