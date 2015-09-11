
/**
 * @author FERCHUS
 *
 */

//import java.util.Vector;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ruta = "G:/Facu/TUDAI/Programacion II/TPEspJuego/cartas.txt";
		/*Atributo altura= new Atributo("altura", 205, 1);
        Atributo peso= new Atributo("peso", 205, 1);
        Atributo fuerza= new Atributo("fuerza", 205, 0);
        Atributo peleasGanadas= new Atributo("peleasGanadas", 205, 0);
        Atributo velocidad= new Atributo("velocidad", 205, 0);
        
        Vector<Atributo> atributos= new Vector<>();
        atributos.add(altura);
        atributos.add(peso);
        atributos.add(fuerza);
        atributos.add(peleasGanadas);
        atributos.add(velocidad);
        Carta c1=new Carta("superman",atributos);
        Vector<Carta> cartas=new Vector<>();
        cartas.add(c1);
        
        Mazo m=new Mazo(cartas);
        
        System.out.println("Mazo 1"+m.toString());*/
        
		Mazo mazoLeido=new Mazo(ruta);
        
        System.out.println("Mazo Leido"+mazoLeido.toString());
		

	}

}
