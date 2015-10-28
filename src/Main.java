
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String ruta = "../TPE/cartas.txt";
		System.out.println("JUEGO DE CARTAS: ENFRENTAMIENTO DE SUPERHEROES!!!");
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el nombre del primer jugador: ");
		String nombrej1 = sc.nextLine();
		Jugador j1=new Jugador(nombrej1);
		System.out.println("Ingrese el nombre del segundo jugador: ");
		String nombrej2 = sc.nextLine();
		Jugador j2=new Jugador(nombrej2);
		System.out.println("JUGADOR 1: "+nombrej1);
		System.out.println("JUGADOR 2: "+nombrej2);
		
		Mazo mazoLeido=new Mazo(ruta);
        
        Juego juegoNuevo = new Juego(mazoLeido);
        juegoNuevo.repartirCartas(mazoLeido, j1, j2);
        juegoNuevo.Jugar(mazoLeido, j1, j2);
        
        sc.close();

	}

}
