
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		Vector<Pocima> pocimasARepartir = new Vector<Pocima>();
		Pocima fortalecedora = new Incrementa("Fortalecedora",20);      //1
		pocimasARepartir.add(fortalecedora);
		Pocima fortPlus = new Incrementa("Fortalecedora Plus",50);      //2
		pocimasARepartir.add(fortPlus);
		Pocima selecFuerza = new Incrementa("Selectiva Fuerza",35);     //3
		pocimasARepartir.add(selecFuerza);
		Pocima selecPeso = new Incrementa("Selectiva Peso",43);         //4
		pocimasARepartir.add(selecPeso);
		Pocima kripto = new Decrementa("Kriptonita",25);                //1
		pocimasARepartir.add(kripto);
		Pocima reduPlomo = new Decrementa("Reductor de Plomo",55);      //2
		pocimasARepartir.add(reduPlomo);
		Pocima kriptoAzul = new Decrementa("Kriptonita Azul",95);       //3
		pocimasARepartir.add(kriptoAzul);
		Pocima kriptoFalsa = new Decrementa("Kriptonita Falsa",5);      //4
		pocimasARepartir.add(kriptoFalsa);
		Pocima vFijo1 = new ValorFijo("Valor Fijo",5);                  //1
		pocimasARepartir.add(vFijo1);
		Pocima vFijo2 = new ValorFijo("Valor Fijo",5);                  //2
		pocimasARepartir.add(vFijo2);
		Pocima vFijo3 = new ValorFijo("Valor Fijo",5);                  //3
		pocimasARepartir.add(vFijo3);
		Pocima vFijo4 = new ValorFijo("Valor Fijo",5);                  //4
		pocimasARepartir.add(vFijo4);
		Pocima pLimitada1 = new PocimaLimitada("Pócima Limitada",20,10); //1
		pocimasARepartir.add(pLimitada1);
		Pocima pLimitada2 = new PocimaLimitada("Pócima Limitada",20,10); //2
		pocimasARepartir.add(pLimitada2);
		Pocima pLimitada3 = new PocimaLimitada("Pócima Limitada",20,10); //3
		pocimasARepartir.add(pLimitada3);
		
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
