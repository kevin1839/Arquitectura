package MVC;

import MVC.Controlador;
import MVC.Modelo;
public class JanKenPonMVC {
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        MVC.VistaJuego vista = new MVC.VistaJuego();
        
        Controlador controlador = new Controlador(mod, vista);
        for (int i = 1; i < 6; i++) {
            System.out.println("ROUND N°"+i);
            controlador.jugarMaquina();
        }
    }
    
}
