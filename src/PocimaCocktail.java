
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

import java.util.Vector;


public class PocimaCocktail extends Pocima{
	private Vector<Pocima> pocimas;
	
	public PocimaCocktail(String n, Vector<Pocima> vPocimas) {
		super.nombre = n;
		this.pocimas = new Vector<Pocima>();	
		this.pocimas = vPocimas;		
	}

	protected double calcular(Atributo a){
		Atributo aCopia = a.getCopia();
		double acumulado = 0;
		for (int i=0;i<pocimas.size();i++){
			
			acumulado= pocimas.get(i).calcular(aCopia);
			aCopia.setValor(acumulado);
		}
		return aCopia.getValor(); 
	} 
	
}
