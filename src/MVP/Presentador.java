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
public class Presentador {
private Interfaz interfaz;
public MUsuario usuario;
public MUsuario2 usuario2;
public MComputadora computadora;
public MComparador comparar;
public int usuarioPuntos=0;
public int computadoraPuntos=0;
public int cantidadDeJuegos=0;

public Presentador(Interfaz iv){
    interfaz=iv;
    usuario = new MUsuario();
    usuario2=new MUsuario2();
    computadora = new MComputadora();
    comparar=new MComparador();
}

public void operar(String valor){

 MMovimiento usuarioMove = usuario.getMov(valor);
MMovimiento computadoraMove = computadora.getMov();
System.out.println("\nYou played " + usuarioMove + ".");
System.out.println("Computadora played " + computadoraMove + ".\n");
int compareMov = comparar.compareMoves(usuarioMove,computadoraMove);
String resultado=comparar.resultado(compareMov,usuarioMove,computadoraMove);
    System.out.println(resultado);
}

public void operar2(String valor,String valor2){
MMovimiento usuarioMove = usuario.getMov(valor);
MMovimiento usuario2Move = usuario2.getMov(valor2);
System.out.println("\nYou played " + usuarioMove + ".");
System.out.println("Usuario2 played " + usuario2Move + ".\n");
int compareMov = comparar.compareMoves(usuarioMove,usuario2Move);
String resultado=comparar.resultado(compareMov,usuarioMove,usuario2Move);
    System.out.println(resultado);

}
}