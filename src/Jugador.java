
/**
* @author Daniela Colamai y Fernanda Gonzalez
*
*/
 
import java.util.Random;
import java.util.Vector;

public class Jugador {
	private String nombre;
	private Mazo mazoJugador;
	private boolean esGanador;

	/**
	 * Constructor
	 */
	public Jugador(String n){
		this.nombre = n;
		this.mazoJugador = new Mazo();
		this.esGanador = false;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el mazoJugador
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
	
	/**
	 * @return the esGanador
	 */
	public boolean esGanador() {
		return esGanador;
	}

	/**
	 * @param esGanador the esGanador to set
	 */
	public void setEsGanador(boolean esGanador) {
		this.esGanador = esGanador;
	}
	
	/**
	 * @return la primer carta del mazo
	 */
	public Carta obtenerPrimerCarta() {
        return this.mazoJugador.getCartas().get(0);
    }
	
	/**
	 * Obtiene la primer carta, la borra del mazo en la que esta y la retorna.
	 * @return la primer carta de un mazo
	 */
	public Carta dameCarta() {
		Carta c =this.obtenerPrimerCarta();
		this.mazoJugador.borrarPrimerCarta();
		return c;
    }
	
	/**
	 * Agrega una carta al mazo
	 * @param nueva
	 */
    public void agregarCarta(Carta nueva) {
        this.mazoJugador.agregarCartaAlFinal(nueva);
    }
    
    /**
     * Agrega varias cartas a un mazo
     * @param cartas
     */
    public void agregarCartas(Vector<Carta> cartas){
		for (int i=0;i<cartas.size();i++){
			this.mazoJugador.agregarCartaAlFinal(cartas.elementAt(i));
		}
	}

    /**
     * 
     * @return la cantidad de cartas de un mazo
     */
	public int canCartas() {
		return this.mazoJugador.cantCartas();
	}
	
	/**
	 * 
	 * @return el nombre del atriburo por el cual se va a jugar
	 */
	public String seleccionAtribAleatorio() {
		Random aleatorio = new Random();
        
        int cantAtrib = this.mazoJugador.getCartas().get(0).getCantAtrib();
        String atrib = this.obtenerPrimerCarta().getAtributos().get(aleatorio.nextInt(cantAtrib)).getNombre();

        return atrib;
    }

}
