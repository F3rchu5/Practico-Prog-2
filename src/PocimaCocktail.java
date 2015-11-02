import java.util.Vector;


public class PocimaCocktail extends Pocima{
	private Vector<Pocima> pocimas;
	
	public PocimaCocktail(Vector<Pocima> vPocimas) {
		this.pocimas = new Vector<Pocima>();	
		this.pocimas = vPocimas;		
	}

	protected double calcular(Atributo a,double v){
		for (int i=0;i<pocimas.size();i++){
			v += pocimas.get(i).calcular(a, v);
		}
		return v; 
	} 
	
}
