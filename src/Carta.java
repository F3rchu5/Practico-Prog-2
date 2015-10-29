
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

import java.util.Vector;

public class Carta {
	private String nombre;
	private Vector<Atributo> atributos = new Vector<Atributo>();
	private Pocima pocima;
    
    /**
     * Constructor
     * @param nombre
     * @param atributos
     * @param pocima
     */
    public Carta(String nombre, Vector<Atributo> atributos) {
        this.nombre=nombre;
        this.atributos = atributos;
        this.pocima = null;
    }

	/**
	 * @return el nombre de la carta
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
	 * @return el vector atributos
	 */
	public Vector<Atributo> getAtributos() {
		return atributos;
	}

	/**
	 * @param atributos the atributos to set
	 */
	public void setAtributos(Vector<Atributo> atributos) {
		this.atributos = atributos;
	}
	
	/**
	 * @return una pocima pocima
	 */
	public Pocima getPocima() {
		return pocima;
	}

	/**
	 * @param pocima 
	 */
	public void agregarPocima(Pocima pocima) {
		this.pocima = pocima;
	}

	/**
	 * @return la cantidad de atributos de una carta
	 */
    public int getCantAtrib(){
    	return this.atributos.size();
    }
    
    /**
	 * @return el atributo que coincide con el nombre pasado por parametro
	 */
    public Atributo obtenerUnAtributo(String n){
    	int i = 0;
		while (!this.atributos.get(i).getNombre().equals(n) && i<this.atributos.size()){
			i++;
		}
		return this.atributos.get(i);
    }
    
    /**
	 * @param atributos
	 * @param pocima 
	 */
    public void actualizarAtributos(){
    	for (int i=0; i<this.getCantAtrib(); i++){
    		double valor = this.atributos.get(i).getValor();
    		Atributo atributo = this.atributos.get(i);
    		this.atributos.get(i).setValor(this.pocima.calcular(atributo, valor));
    	}
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", atributos=" + atributos
				+ ", pocima=" + pocima + "]";
	}
	
   
    
}
