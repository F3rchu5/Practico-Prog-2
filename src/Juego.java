import java.util.Vector;


public class Juego {
	private Jugador j1;
	private Jugador j2;
	final static int CANTCARTAS =32;	
	
	public Juego(Jugador ju1,Jugador ju2) {
		this.j1=ju1;
		this.j2=ju2;
		}
	
	Mazo mazoGral = new Mazo("rutaArchivo");
	
	
	public void repartirCartas(  Mazo mazoGral){
		int cantCartas=(CANTCARTAS/2);
		Mazo mazoJ1= new Mazo();
		Mazo mazoJ2= new Mazo();
		 while ((mazoGral != null) &&(CANTCARTAS == mazoGral.cantCartas())){
			  for (int i=0;i<cantCartas;i++){
				  mazoJ1.agregarCartaAlFinal(mazoGral.getCartas());
				  mazoGral.borrarCartaActual();
			  }
			  for (int j=cantCartas;j<CANTCARTAS;j++){
				  mazoJ2.agregarCartaAlFinal(mazoGral.getCartas());
				  mazoGral.borrarCartaActual();
			  } 
		 }
		 
	}
	
	public void compararCartas(Mazo mJ1,Mazo mJ2){
		Mazo paño= new Mazo ();
		int atributoAleatorio=Mazo.seleccionAtribAleatorio();
		if (mJ1.cartaActual().getAtributos().get(atributoAleatorio)){
			

		//atributoAleatorio
		
		
	}
	
	public void mostrarGanador(){
		
	}
	
	public void Jugar(Mazo mJ1,Mazo mJ2){
		
        do {
            compararCartas(mJ1, mJ2);
            
            
        } while (mJ1!=null)&&(mJ2!=null));

        mostrarGanador();
        

	}
	}
}