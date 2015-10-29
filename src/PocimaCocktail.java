import java.util.Vector;


public class PocimaCocktail extends Pocima{
	private Vector<Pocima> pocimas= new Vector<Pocima>();
	public PocimaCocktail(String nombre, int valor) {
		super(nombre, valor);	
		
	}

	protected double calcular(Atributo a,double v){
		for (int i=0;i<pocimas.size();i++){
			String nombre = pocimas.get(i).getNombre();
			if (nombre == "Valor Fijo"){
				v = pocimas.get(i).calcular(a, v);
			}
			else{
				if ((nombre == "Selectiva Fuerza") && (a.getNombre() == "fuerza")){
					v += pocimas.get(i).calcular(a, v);
				}
				else{
					if ((nombre == "Selectiva Peso") && (a.getNombre() == "peso")){
						v += pocimas.get(i).calcular(a, v);
					}
					else{
						if(((nombre == "Selectiva Fuerza") && (a.getNombre() != "fuerza")) || ((nombre == "Selectiva Peso") && (a.getNombre() != "peso"))){
							v += 0;
						}
						else{
							v += pocimas.get(i).calcular(a, v);
						}
					}
				}
			}
		}
		return v; 

	} 
	
}
