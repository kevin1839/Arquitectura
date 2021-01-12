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
public interface Interfaz {
    public void Presentador(Presentador p);
    public String getJugador();
    public void iniciar();
    public void setSalida(String s);
   static final String  PIEDRA = "PIEDRA";
 static final String PAPEL = "PAPEL";
 static final String TIJERA = "TIJERA";
}
