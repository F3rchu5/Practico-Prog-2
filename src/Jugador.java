/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

import java.util.Vector;

public class Jugador {
	private Mazo mazoJugador;

	public Jugador(){
		this.mazoJugador = null;
	}
	
	/**
	 * @return the mazoJugador
	 */
	public Mazo getMazoJugador() {
		return mazoJugador;
	}

	/**
	 * @param mazoJugador the mazoJugador to set
	 */
	public void setMazoJugador(Mazo mazoJugador) {
		this.mazoJugador = mazoJugador;
	}
	
	public Carta obtenerCarta() {
        return Mazo.cartaActual();
    }

    public void agregarCarta(Vector<Carta> Nueva) {
        this.mazoJugador.agregarCartaAlFinal(Nueva);
    }

}
