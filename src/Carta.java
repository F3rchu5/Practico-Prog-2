/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

import java.util.Vector;

public class Carta {
	private String nombre;
    private Vector<Atributo> atributos = new Vector<>();
    private int condicion;

    public Carta(String nombre, Vector<Atributo> atributos, int condicion) {
        this.nombre=nombre;
        this.atributos = atributos;
        this.condicion = condicion;
    }
    
    public Carta(String nombre, Vector<Atributo> atributos) {
        this.nombre=nombre;
        this.atributos = atributos;
    }
    
    /*public Carta(String[] valores) {
        nombre=valores[0];
        atributos=new Vector<>();
        for(int i=1;i<valores.length-3;i=i+3){
            Atributo a=new Atributo(valores[i],new Integer(valores[i+1]),new Integer(valores[i+2]));
            atributos.add(a);
        }
    }*/

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
	 * @return the atributos
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
	 * @return the condicion
	 */
	public int getCondicion() {
		return condicion;
	}

	/**
	 * @param condicion the condicion to set
	 */
	public void setCondicion(int condicion) {
		this.condicion = condicion;
	}
	
	/**
	 * @return la cantidad de atributos de una carta
	 */
    public int getCantAtrib(){
    	return this.atributos.size();
    }
	
}
