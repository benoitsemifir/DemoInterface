package des;

import interfaces.Lancable;

public class De20 implements Lancable{
	
	int valeur;
	int nombreFaces = 20;
	
	public int getValeur() {
		return valeur;
	}

	public void lancer() {
		this.valeur = (int) Math.ceil( Math.random() * nombreFaces);
	}

	@Override
	public String toString() {
		return "De20 [valeur=" + valeur + ", nombreFaces=" + nombreFaces + "]";
	}
	
}
