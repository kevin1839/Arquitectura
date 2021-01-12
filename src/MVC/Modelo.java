package MVC;
public class Modelo {
    private String jugador1;
    private String jugador2;
    private String resultado;

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public String resultado(){
        int random = (int) Math.floor(Math.random()*3+1);
        if (random == 1) {
            this.jugador2 = "Piedra";
        }else{
            if (random == 2) {
                this.jugador2 = "Papel";
            }else{
                this.jugador2 = "Tijera";
            }
        }
        if ("Piedra".equals(this.jugador1)) {
            if ("Papel".equals(this.jugador2)) {
                this.resultado = "Perdiste";
              
            }else{
                if ("Tijera".equals(this.jugador2)) {
                    this.resultado = "Ganaste";
                  
                }else{
                    this.resultado = "Empate";
                }
            }
        }else{
            if ("Papel".equals(this.jugador1)) {
                if ("Piedra".equals(this.jugador2)) {
                    this.resultado = "Ganaste";
  
                }else{
                    if ("Tijera".equals(this.jugador2)) {
                        this.resultado = "Perdiste";
                      
                    }else{
                        this.resultado = "Empate";
                    }
                }
            }else{
                if ("Tijera".equals(this.jugador1)) {
                    if ("Papel".equals(this.jugador2)) {
                        this.resultado = "Ganaste";
                       
                    }else{
                        if ("Piedra".equals(this.jugador2)) {
                            this.resultado = "Perdiste";
                           
                    }else{
                            this.resultado = "Empate";
                        }
                    }
                }
            }
        }
        return this.resultado;
    }
}
