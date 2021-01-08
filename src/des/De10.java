package des;

import interfaces.Lancable;

public class De10 implements Lancable{

	int valeur;
	int nombreFaces = 10 ;
	
	public int getValeur() {
		return this.valeur;
	}
	
	public void lancer() {
		this.valeur = (int) Math.ceil( Math.random() * nombreFaces );
	}

	@Override
	public String toString() {
		return "De10 [valeur=" + valeur + ", nombreFaces=" + nombreFaces + "]";
	}
	
}
