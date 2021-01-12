package MVC;

import java.util.Scanner;

public class VistaJuego {
    private String opcion;
    private String resultado;
    
    public void elegir(){
        System.out.println("INGRESAR TU OPCIÓN \n Piedra \n Papel \n Tijera");
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.next();
    }
    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
