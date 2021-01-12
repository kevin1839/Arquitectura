package MVC;

public class Controlador {
    private Modelo model;
    private VistaJuego vistaJuego;
    public Controlador(Modelo model, VistaJuego vistaJuego) {
        this.model = model;
        this.vistaJuego = vistaJuego;
    }
    public void jugarMaquina (){
        vistaJuego.elegir();
        model.setJugador1(vistaJuego.getOpcion());
        model.resultado();
        vistaJuego.setResultado(model.getResultado());
        System.out.println("\n //////////////////////////////////////////");
        System.out.println(this.vistaJuego.getResultado() + " /// Porque la computadora escogió -> " + this.model.getJugador2());
        System.out.println("////////////////////////////////////////// \n");
    }
}
