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
import java.util.Random;
import java.util.Vector;
 
public class Mazo {
	private static Vector<Carta> cartas = new Vector<>();
	
	public Mazo(){
		Mazo.cartas = null;
	}
	
	public Mazo(Vector<Carta> cartas2){
		Mazo.cartas = cartas2;
	}

	public Mazo(String rutaArchivo) {
        leerCartas(rutaArchivo);
    }

	/**
	 * @return the cartas
	 */
	public Vector<Carta> getCartas() {
		return cartas;
	}

	/**
	 * @param cartas the cartas to set
	 */
	public void setCartas(Vector<Carta> cartas) {
		Mazo.cartas = cartas;
	}
	
	public void agregarCarta(Carta c){
		Mazo.cartas.add(c);
	}
	
	public void agregarCartaAlFinal(Vector<Carta> cNueva) {
        for (Carta carta : cNueva) {
            Mazo.cartas.add(0, carta);
        }
    }
	
	public static Carta cartaActual() {
        if (!cartas.isEmpty()) {
            return cartas.get(cartas.size() - 1);
        } 
        else {
            return null;
        }
    }
	
	public void borrarCartaActual() {
        if (!Mazo.cartas.isEmpty()) {
            Mazo.cartas.remove(Mazo.cartas.size() - 1);
        }
    }
	
	public void borrarPrimerCarta() {
        if (!Mazo.cartas.isEmpty()) {
            Mazo.cartas.remove(0);
        } 
    }
	
	private void leerCartas(String rutaArchivo){
		Vector<Atributo> cartaLeida=new Vector<>();
		Atributo nuevoAtrib = null;
        String nombreCarta, nombreAtrib;
        int valorAtrib, condicion;

        
        
        try {
            InputStream is = new FileInputStream(rutaArchivo);
            InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
            
            String linea = br.readLine();
            while(linea != null){
                String[] valores = linea.split(",");
                nombreCarta = valores[0];
                for (int i = 1; i < valores.length-3; i = i + 3) {
                	nombreAtrib = valores[i];
                    valorAtrib = Integer.parseInt(valores[i + 1]);
                    condicion = Integer.parseInt(valores[i + 2]);
                    nuevoAtrib = new Atributo(nombreAtrib, valorAtrib, condicion);
                    cartaLeida.add(nuevoAtrib);
                }

                Carta c = new Carta(nombreCarta, cartaLeida);
                Mazo.cartas.add(c);
                linea = br.readLine();
            }   
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        } catch (IOException ex) {
            System.out.println("Conflicto acceso archivo");
        }
	}
	
	public boolean esCartaValida() {
        Vector<Atributo> atrib1;
        Vector<Atributo> atrib2;
        Carta primerCarta;

        primerCarta = Mazo.cartaActual();
        atrib1 = primerCarta.getAtributos();

        for (Carta card: Mazo.cartas) {
            if (primerCarta.getCantAtrib() == card.getCantAtrib()) {
                atrib2 = card.getAtributos();

                if (!atrib1.equals(atrib2)) {
                    //System.out.println("atributos distintos");
                    return false;
                }
            } 
            else {
                //System.out.println("distinta cantidad");
                return false;
            }
        }
        return true;
    }
	
	public static int seleccionAtribAleatorio() {
        Random aleatorio = new Random();
        int indice, cantAtrib;

        cantAtrib = cartaActual().getCantAtrib();
        indice = aleatorio.nextInt(cantAtrib - 1);

        return indice;
    }

}
