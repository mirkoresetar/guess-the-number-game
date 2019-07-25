package vjezbaKnjiga;

import javax.swing.JOptionPane;

public class Poga�anjeBrojeva {
	int zami�ljenBroj;
	int poku�anBroj;
	boolean pogodak;

	Poga�anjeBrojeva() {

		zami�ljenBroj = (int) (100 * Math.random()) + 1;
		pogodak = false;

		System.out.println("Zamislio sam  broj izme�u 1 i 100.");
		System.out.println("Poku�aj ga pogoditi!");
		try {
			while (!pogodak) {
				System.out.println(poku�anBroj);
				poku�anBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
				if (poku�anBroj < zami�ljenBroj)
					System.out.println("Zamislio sam ve�i broj :-(");
				else if (poku�anBroj > zami�ljenBroj)
					System.out.println("Zamislio sam manji broj :-(");
				else {
					System.out.println("Bravo! Pogodak! :-)");
					pogodak = true;
				}
			}
		} catch (Exception e) {
			System.out.println("Pogre�an unos ! ");
			
		}

	}

}
