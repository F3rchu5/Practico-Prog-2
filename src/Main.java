
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
		
		Pocima fortalecedora = new PocimaModificadora("Fortalecedora",20);       //1
		pocimasARepartir.add(fortalecedora); 
		Pocima fortPlus = new PocimaModificadora("Fortalecedora Plus",50);       //2
		pocimasARepartir.add(fortPlus);
		Pocima kripto = new PocimaModificadora("Kriptonita",-25);                //3
		pocimasARepartir.add(kripto);
		Pocima reduPlomo = new PocimaModificadora("Reductor de Plomo",-55);      //4
		pocimasARepartir.add(reduPlomo);
		Pocima selecFuerza = new PocimaSelectivaAtributo("fuerza",-35);          //1
		pocimasARepartir.add(selecFuerza);
		Pocima selecPeso = new PocimaSelectivaAtributo("peso",-43);              //2
		pocimasARepartir.add(selecPeso);
		Pocima selecFuerza2 = new PocimaSelectivaAtributo("Fuerza",-35);         //3
		pocimasARepartir.add(selecFuerza2);
		Pocima selecPeso2 = new PocimaSelectivaAtributo("Peso",-43);             //4
		pocimasARepartir.add(selecPeso2);
		Pocima vFijo1 = new ValorFijo("Valor Fijo",5);                           //1
		pocimasARepartir.add(vFijo1);
		Pocima vFijo2 = new ValorFijo("Valor Fijo",5);                           //2
		pocimasARepartir.add(vFijo2);
		Pocima vFijo3 = new ValorFijo("Valor Fijo",5);                           //3
		pocimasARepartir.add(vFijo3);
		Pocima vFijo4 = new ValorFijo("Valor Fijo",5);                           //4
		pocimasARepartir.add(vFijo4);
		Pocima pLimitada1 = new PocimaLimitada("Pócima Limitada");               //1
		pocimasARepartir.add(pLimitada1);
		Pocima pLimitada2 = new PocimaLimitada("Pócima Limitada");               //2
		pocimasARepartir.add(pLimitada2);
		Pocima pLimitada3 = new PocimaLimitada("Pócima Limitada");               //3
		pocimasARepartir.add(pLimitada3);
		Pocima pLimitada4 = new PocimaLimitada("Pócima Limitada");               //4
		pocimasARepartir.add(pLimitada4);
		Vector<Pocima> vPoc1 = new Vector<Pocima>();
		vPoc1.add(pLimitada1);
		vPoc1.add(selecPeso);
		vPoc1.add(vFijo4);
		Pocima cocktail1 = new PocimaCocktail("Cocktail 1",vPoc1); 			     //1
		pocimasARepartir.add(cocktail1);
		Vector<Pocima> vPoc2 = new Vector<Pocima>();
		vPoc2.add(pLimitada1);
		Pocima cocktail2 = new PocimaCocktail("Cocktail 2",vPoc2);               //2
		pocimasARepartir.add(cocktail2);
		Vector<Pocima> vPoc3 = new Vector<Pocima>();
		vPoc3.add(cocktail1);
		vPoc3.add(cocktail2);
		Pocima cocktail3 = new PocimaCocktail("Cocktail 3",vPoc3);               //3
		pocimasARepartir.add(cocktail3);
		Vector<Pocima> vPoc4 = new Vector<Pocima>();
		vPoc4.add(fortalecedora);
		vPoc4.add(cocktail1);
		vPoc4.add(selecFuerza);
		vPoc4.add(kripto);
		vPoc4.add(pLimitada3);
		Pocima cocktail4 = new PocimaCocktail("Cocktail 4",vPoc4); 		         //4
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
        
        System.out.println("Desea jugar con pócimas? (1 = Si o 0 = No)");
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
