
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		Vector<Pocima> pocimasARepartir = new Vector<Pocima>();
		
		Pocima fortalecedora = new Incrementa("Fortalecedora",20);       //1
		pocimasARepartir.add(fortalecedora); 
		Pocima fortPlus = new Incrementa("Fortalecedora Plus",50);       //2
		pocimasARepartir.add(fortPlus);
		Pocima selecFuerza = new Incrementa("Selectiva Fuerza",35);      //3
		pocimasARepartir.add(selecFuerza);
		Pocima selecPeso = new Incrementa("Selectiva Peso",43);          //4
		pocimasARepartir.add(selecPeso);
		Pocima kripto = new Decrementa("Kriptonita",25);                 //1
		pocimasARepartir.add(kripto);
		Pocima reduPlomo = new Decrementa("Reductor de Plomo",55);       //2
		pocimasARepartir.add(reduPlomo);
		Pocima kriptoAzul = new Decrementa("Kriptonita Azul",95);        //3
		pocimasARepartir.add(kriptoAzul);
		Pocima kriptoFalsa = new Decrementa("Kriptonita Falsa",5);       //4
		pocimasARepartir.add(kriptoFalsa);
		Pocima vFijo1 = new ValorFijo("Valor Fijo",5);                   //1
		pocimasARepartir.add(vFijo1);
		Pocima vFijo2 = new ValorFijo("Valor Fijo",5);                   //2
		pocimasARepartir.add(vFijo2);
		Pocima vFijo3 = new ValorFijo("Valor Fijo",5);                   //3
		pocimasARepartir.add(vFijo3);
		Pocima vFijo4 = new ValorFijo("Valor Fijo",5);                   //4
		pocimasARepartir.add(vFijo4);
		Pocima pLimitada1 = new PocimaLimitada("P�cima Limitada",20,10); //1
		pocimasARepartir.add(pLimitada1);
		Pocima pLimitada2 = new PocimaLimitada("P�cima Limitada",20,10); //2
		pocimasARepartir.add(pLimitada2);
		Pocima pLimitada3 = new PocimaLimitada("P�cima Limitada",20,10); //3
		pocimasARepartir.add(pLimitada3);
		Pocima pLimitada4 = new PocimaLimitada("P�cima Limitada",20,10); //4
		pocimasARepartir.add(pLimitada4);
		Vector<Pocima> vPoc1 = new Vector<Pocima>();
		vPoc1.add(pLimitada1);
		vPoc1.add(selecPeso);
		vPoc1.add(vFijo4);
		Pocima cocktail1 = new PocimaCocktail(vPoc1); 					 //1
		pocimasARepartir.add(cocktail1);
		Vector<Pocima> vPoc2 = new Vector<Pocima>();
		vPoc2.add(pLimitada1);
		Pocima cocktail2 = new PocimaCocktail(vPoc2);                    //2
		pocimasARepartir.add(cocktail2);
		Vector<Pocima> vPoc3 = new Vector<Pocima>();
		vPoc3.add(cocktail1);
		vPoc3.add(cocktail2);
		Pocima cocktail3 = new PocimaCocktail(vPoc3);                    //3
		pocimasARepartir.add(cocktail3);
		Vector<Pocima> vPoc4 = new Vector<Pocima>();
		vPoc4.add(fortalecedora);
		vPoc4.add(cocktail1);
		vPoc4.add(selecFuerza);
		vPoc4.add(kriptoFalsa);
		vPoc4.add(pLimitada3);
		Pocima cocktail4 = new PocimaCocktail(vPoc4); 					 //4
		pocimasARepartir.add(cocktail4);
		
		
		Collections.shuffle(pocimasARepartir);
		
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
        
        System.out.println("Desea jugar con p�cimas? (1 = Si o 0 = No)");
		int respuesta = sc.nextInt();
		while ((respuesta != 1) && (respuesta != 0)){
			System.out.println("El valor ingresado NO es correcto. Por favor ingrese si o no: ");
			respuesta = sc.nextInt();
		}
		if (respuesta == 0){
			juegoNuevo.repartirCartas(mazoLeido, j1, j2);
		}
		else{
			juegoNuevo.repartirCartasConPocimas(mazoLeido, pocimasARepartir, j1, j2);
		}
		
        juegoNuevo.Jugar(mazoLeido, j1, j2);
        
		System.out.println("Juego Terminado!");
        sc.close();

	}

}
