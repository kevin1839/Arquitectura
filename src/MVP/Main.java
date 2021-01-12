/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

/**
 *
 * @author Sebastian F
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //  Modelo modelo = new Modelo();
        Interfaz vista = new VistaConsola();
        Presentador p = new Presentador(vista);
        vista.Presentador(p);
        vista.iniciar();
    }
    
}
