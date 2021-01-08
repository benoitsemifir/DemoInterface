package des;

import java.lang.Math;

import interfaces.Lancable;

public class De implements Lancable {
	
	private int valeur;
	private int nombreFaces = 6;
	
	/**
	 * Méthode qui lance le dé à 6 faces pour mettre à jour la valeur du dé
	 */
	public void lancer() {
		// Générer aléatoirement un nombre entre 1 et 6
		// Math.ceil fait l'arrondi supérieur de la valeur passée en paramètre (attention ça retourne un double)
		// c'est la raison pour laquelle on cast le résultat en int => (int) Math.ceil(valeur)
		// Math.random() retourne un nombre aléatoire en tre 0 et 1 en (en double)
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
