/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import java.util.Scanner;

/**
 *
 * @author Sebastian F
 */
public class VistaConsola implements Interfaz{
    private Presentador presenter;
    private Scanner in = new Scanner(System.in);
    
   
    @Override
    public void iniciar(){
        this.ConJugador();
      //  this.repetir();
    }
    
    public void repetir(){
         
        for (int i = 1; i <= 5; i++) {
        System.out.println("【" + i + "Round]");
        procesar();
        }
        
    }
        
    public void procesar(){
        
        presenter.operar(getJugador());
        
    }
    
    public void procesar2(){
           presenter.operar2(getJugador(),getJugador());
    }
    
    public String leerUsuario(){
        try {
            return in.nextLine();
        } catch (Exception e) {
            System.out.println("Error: ");
            return leerUsuario();
        }
    }



    @Override
    public String getJugador() {
        System.out.println("Ingrese opcion: ");
        return leerUsuario();
    }
    
    public String getJugador2(){
         System.out.println("Ingrese opcion: ");
        return leerUsuario();
    }

    @Override
    public void Presentador(Presentador p) {
         presenter = p;
    }
    
  

    @Override
    public void setSalida(String s) {
     System.out.println(s);
    }
    
    public void menu(){
        System.out.println("-------PIEDRA, PAPEL O TIJERA");
        int op=0;
        System.out.println("Elija la opcion que desee:");
        
        do{
            System.out.println("1. Jugar contra la maquina");
            System.out.println("2. Jugar contra jugador");
            System.out.println("3. Salir");
       
            op=in.nextInt();
         switch(op) {
             case 1:
                 this.repetir();
                // break;
             case 2:
                 break;
             default:
         } 
        }while(op!=3);
    }
    
    public void ConJugador(){
        procesar2();
    }
    
}
