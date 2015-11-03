import java.util.Vector;


public class PocimaCocktail extends Pocima{
	private Vector<Pocima> pocimas;
	
	public PocimaCocktail(Vector<Pocima> vPocimas) {
		this.pocimas = new Vector<Pocima>();	
		this.pocimas = vPocimas;		
	}

	protected double calcular(Atributo a,double v){
		Atributo aux = a.getCopia();
		double acumulado = 0;
		for (int i=0;i<pocimas.size();i++){
			
			acumulado= pocimas.get(i).calcular(aux, v);
			aux.setValor(acumulado);
		}
		return aux.getValor(); 
	} 
	
}
