package main;

import des.De;
import des.De10;
import des.De20;
import interfaces.Lancable;

public class Run {

	public static void main(String[] args) {
		
		Lancable[] gobelet = new Lancable[20];
		
		gobelet[0] = new De();
		gobelet[1] = new De10();
		gobelet[2] = new De20();
		
		// pour chaques dé "lancable" dans gobelet => effectuer une action

		for (Lancable de : gobelet) {
			
			if(de != null) {
				de.lancer();
				System.out.println(de);
			}
		}
		
		/*

			Pour chaque element dans un "tableau"
			
			for ( TypeElement element : tableauElement){

				//Effectuer une action
				element.faireQQC();
				System.out.println(element.attribut);

			}

		 */

	}

}
