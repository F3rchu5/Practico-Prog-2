
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;
 
public class Mazo {
	private Vector<Carta> cartas = new Vector<Carta>();
	
	/**
	 * Constructor sin parametros
	 */
	public Mazo(){
		cartas = new Vector<Carta>();
	}
	
	/**
	 * Constructor con un vector de cartas
	 * @param cartas
	 */
	public Mazo(Vector<Carta> cartas){
		this.cartas = cartas;
	}

	/**
	 * Constructor del Mazo General
	 * @param rutaArchivo
	 */
	public Mazo(String rutaArchivo) {
        cartas = this.leerCartas(rutaArchivo);
    }

	/**
	 * @return las cartas
	 */
	public Vector<Carta> getCartas() {
		return cartas;
	}

	/**
	 * @param cartas the cartas to set
	 */
	public void setCartas(Vector<Carta> cartas) {
		this.cartas = cartas;
	}
	
	/**
	 * Agrega una carta al principio del mazo
	 * @param c
	 */
	public void agregarCarta(Carta c){
		this.cartas.add(0,c);
	}
	
	/**
	 * Agrega una carta al final del mazo
	 * @param cNueva
	 */
	public void agregarCartaAlFinal(Carta cNueva) {
        this.cartas.add(this.cartas.size(),cNueva);
	}
	
	/**
	 * Agrega varias cartas a un mazo
	 * @param cartas
	 */
	public void agregarCartas(Vector<Carta> cartas){
		for (int i=0;i<cartas.size();i++){
			this.cartas.add(cartas.elementAt(i));
		}
	}
	
	/**
	 * 
	 * @return una carta si no devuelve NULL
	 */
	public Carta cartaActual() {
        if (!cartas.isEmpty()) {
            return cartas.get(cartas.size() - 1);
        } 
        else {
            return null;
        }
    }
	
	/**
	 * Borra la carta en donde estoy parado
	 */
	public void borrarCartaActual() {
        if (!this.cartas.isEmpty()) {
            this.cartas.remove(this.cartas.size() - 1);
        }
    }
	
	/**
	 * Borra la primer carta del mazo
	 */
	public void borrarPrimerCarta() {
        if (!this.cartas.isEmpty()) {
            this.cartas.remove(0);
        } 
    }
	
	/**
	 * @param rutaArchivo
	 * @return el mazo general del juego, que fue leido desde el archivo
	 */
	private Vector<Carta> leerCartas(String rutaArchivo){
		Vector<Carta> cartasLeidas=new Vector<Carta>();
        Vector<Atributo> atributos;
        String nombreAtrib;
        int valorAtrib, condicion;
        
        try {
            InputStream is = new FileInputStream(rutaArchivo);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String linea = br.readLine();
            while(linea != null){
                String[] valores = linea.split(","); 
                String nombre=valores[0];
                atributos=new Vector<Atributo>();
                for(int i=1; i <= (valores.length)-3; i = i + 3){
                	nombreAtrib = valores[i];
                    valorAtrib = Integer.parseInt(valores[i + 1]);
                    condicion = Integer.parseInt(valores[i + 2]);
                	if (condicion == 0){
                		Atributo a=new AtributoPorMayor(nombreAtrib, valorAtrib, condicion);
                        atributos.add(a);
                	}
                	else
                		if (condicion == 1){
                			Atributo a=new AtributoPorMenor(nombreAtrib, valorAtrib, condicion);
                            atributos.add(a);
                		}
                }
                Carta c = new Carta(nombre,atributos);
                cartasLeidas.add(c);
                linea=br.readLine();
            }
            br.close();
            return cartasLeidas;
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
            return cartasLeidas;
        } catch (IOException ex) {
            System.out.println("Conflicto acceso archivo");
            return cartasLeidas;
        }
    }
	
	/**
	 * controla que una carta tiene la misma cantidad de atributos
	 * @return Verdadedo o Falso
	 */
	public boolean esCartaValida() {
        Vector<Atributo> atrib1;
        Vector<Atributo> atrib2;
        Carta primerCarta;

        primerCarta = this.cartaActual();
        atrib1 = primerCarta.getAtributos();

        for (Carta card: this.cartas) {
            if (primerCarta.getCantAtrib() == card.getCantAtrib()) {
                atrib2 = card.getAtributos();

                if (!atrib1.equals(atrib2)) {
                    //los atributos son distintos
                    return false;
                }
            } 
            else {
                //la cantidad de atributos es distinta
                return false;
            }
        }
        return true;
    }
	
	/**
	 * @return la cantidad de cartas que tiene un mazo
	 */
	public int cantCartas(){
		return this.cartas.size();
	}

	@Override
    public String toString() {
        String toReturn="";
        for(Carta c: this.cartas){
            toReturn=toReturn+"\n"+c.toString();
        }
        return toReturn;
    }
	
}
