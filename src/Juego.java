
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

import java.util.Vector;

public class Juego {
	private Mazo mazoGral;
	
	/**
	 * Constructor
	 * @param mazoGral
	 */
	public Juego(Mazo mazoGral) {
		 this.mazoGral=mazoGral;
	}
	
	/**
	 * @return el mazoGral
	 */
	public Mazo getMazoGral() {
		return mazoGral;
	}

	/**
	 * Reparte las cartas del mazo Gral entre los jugadores.
	 * @param mazoGral
	 * @param j1
	 * @param j2
	 */
	public void repartirCartas(Mazo mazoGral, Jugador j1, Jugador j2){
		
		Mazo mazoJ1=j1.getMazoJugador();
		Mazo mazoJ2=j2.getMazoJugador();
                     
		while (mazoGral.cantCartas()!=0){
			mazoJ1.agregarCarta(mazoGral.cartaActual());
			mazoGral.borrarCartaActual();
			if (mazoGral.cantCartas()>0) {
				mazoJ2.agregarCarta(mazoGral.cartaActual());
				mazoGral.borrarCartaActual();
			}
		}  
	 }
	
	/**
	 * Reparte las cartas del mazo Gral y las pociones entre los jugadores.
	 * @param mazoGral
	 * @param aRepartir
	 * @param j1
	 * @param j2
	 */
	public void repartirCartasConPocimas(Mazo mazoGral, Vector<Pocima> aRepartir, Jugador j1, Jugador j2){
		
		Mazo mazoJ1=j1.getMazoJugador();
		Mazo mazoJ2=j2.getMazoJugador();
		
		while (mazoGral.cantCartas()!=0){
			Carta c1=mazoGral.cartaActual();
			mazoGral.borrarCartaActual();
			if (!aRepartir.isEmpty()){
				c1.agregarPocima(aRepartir.elementAt(0));
				aRepartir.removeElementAt(0);
			}
			mazoJ1.agregarCarta(c1);
			if (mazoGral.cantCartas()>0) {
				Carta c2 = mazoGral.cartaActual();
				mazoGral.borrarCartaActual();
				if (!aRepartir.isEmpty()){
					c2.agregarPocima(aRepartir.elementAt(0));
					aRepartir.removeElementAt(0);
				}
				mazoJ2.agregarCarta(c2);
			}
		}  
	}
		
	
	/**
	 * Hace la comparación del atributo elegido aleatoriamente.
	 * @param mj1
	 * @param mj2
	 * @param atributoAleatorio
	 */
	public void compararCartas(Jugador mj1, Jugador mj2, String atributoAleatorio){
		
		Carta c1 = mj1.dameCarta();
		System.out.println("La carta 1 es: " + c1);
		Carta c2 = mj2.dameCarta();
		System.out.println("La carta 2 es: " + c2);					
		
		boolean ganador =false;
		Vector<Carta> pozo = new Vector<Carta>();
		
		while (!ganador) {
			
			Atributo a1 = c1.obtenerUnAtributo(atributoAleatorio);
			System.out.println("El atributo de la carta 1 es: " + a1);
			Atributo a2 = c2.obtenerUnAtributo(atributoAleatorio);
			System.out.println("El atributo de la carta 2 es: " + a2);
			
			int result = a1.comparar(a2);	
			
			if (result==1){           //gano a2
				mj2.agregarCarta(c1);
				mj2.agregarCarta(c2);
				mj2.agregarCartas(pozo);
				mj2.setEsGanador(true);
				mj1.setEsGanador(false);
				ganador=true;
			}
			else{
				if (result ==-1){     //gano a1
					mj1.agregarCarta(c1);
					mj1.agregarCarta(c2);
					mj1.agregarCartas(pozo);
					mj1.setEsGanador(true);
					mj2.setEsGanador(false);
					ganador=true;
				}
				else {                //empate
		             pozo.add(c1);
		             pozo.add(c2);
		             
		             if  (mj1.getMazoJugador().cantCartas()>0) {
					      c1 = mj1.dameCarta();
					      System.out.println("La carta 1 es: " + c1);
		             } 
		             else{
		            	 if (mj2.getMazoJugador().cantCartas()>0) {
		            		 mj2.setEsGanador(true);
		            		 mj1.setEsGanador(false);
		            		 ganador=true;
		            		 mj2.agregarCartas(pozo);
		            	 } 
		            	 else
		            	    ganador=true;	 
		             }
		             if(mj2.getMazoJugador().cantCartas()>0) {
					      c2 = mj2.dameCarta();
					      System.out.println("La carta 2 es: " + c1);
		             } 
		             else {
		            	 if(mj1.getMazoJugador().cantCartas()>0){
		            		 mj1.setEsGanador(true);
		            		 mj2.setEsGanador(false);
		            		 ganador=true;
		            		 mj1.agregarCartas(pozo);
		            	 } 
		            	 else
		            		 ganador=true;
		            }
				}
			}
		}
	}
		
	/**
	 * Selecciona el atributo por el cual se va jugar, compara las cartas y informa como salio el juego.
	 * @param mazoGral
	 * @param j1
	 * @param j2
	 */
	public void Jugar(Mazo mazoGral, Jugador j1, Jugador j2){
		
		j1.setEsGanador(true);
		int i = 0;
		do {
			if (j1.esGanador()){
				String atrAleatorio= j1.seleccionAtribAleatorio();
				System.out.println(" ");
				System.out.println("El atributo por el que se va a compara es: " + atrAleatorio);
				compararCartas(j1,j2, atrAleatorio); 
				i++;
			}
			else{
				if (j2.esGanador()){
					String atrAleatorio= j2.seleccionAtribAleatorio();
					System.out.println(" ");
					System.out.println("El atributo por el que se va a compara es: " + atrAleatorio);
					compararCartas(j1,j2, atrAleatorio);
					i++;
				}
			}
			if (j1.esGanador())
				System.out.println("La ronda " + i + " la gano el jugador 1: " + j1.getNombre());
			else
				System.out.println("La ronda " + i + " la gano el jugador 2: " + j2.getNombre());
		    
		} while (j1.canCartas()!=0 && j2.canCartas()!=0);
		System.out.println(" ");
       if (j1.canCartas()>0)
    	   System.out.println("El ganador del juego es: " + j1.getNombre());
       else{
    	   if (j2.canCartas()>0)
    		   System.out.println("El ganador del juego es: " + j2.getNombre());  	
	       else
	    	   System.out.println("El juego termino en EMPATE.");
       }
	}   
	
}
