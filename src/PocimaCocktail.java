import java.util.Vector;


public class PocimaCocktail extends Pocima{
	private Vector<Pocima> pocimas= new Vector<Pocima>();
	public PocimaCocktail(String nombre, int valor) {
		super(nombre, valor);	
		
	}

	protected double calcular(Atributo a,double v){
		for (int i=0;i<pocimas.size();i++){
			v=v+pocimas.get(i).calcular(a,this.v);
		}
		return v; 

	}
	
	
	
	

}
