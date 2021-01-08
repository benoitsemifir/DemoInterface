package des;

import java.lang.Math;

import interfaces.Lancable;

public class De implements Lancable {
	
	private int valeur;
	private int nombreFaces = 6;
	
	/**
	 * M�thode qui lance le d� � 6 faces pour mettre � jour la valeur du d�
	 */
	public void lancer() {
		// G�n�rer al�atoirement un nombre entre 1 et 6
		// Math.ceil fait l'arrondi sup�rieur de la valeur pass�e en param�tre (attention �a retourne un double)
		// c'est la raison pour laquelle on cast le r�sultat en int => (int) Math.ceil(valeur)
		// Math.random() retourne un nombre al�atoire en tre 0 et 1 en (en double)
		this.valeur = (int) Math.ceil( Math.random() * nombreFaces);
	}	
	
	public int getValeur() {
		return this.valeur;
	}

	@Override
	public String toString() {
		return "De [valeur=" + valeur + ", nombreFaces=" + nombreFaces + "]";
	}
}
