package vjezbaKnjiga;

import javax.swing.JOptionPane;

public class PogađanjeBrojeva {
	int zamišljenBroj;
	int pokušanBroj;
	boolean pogodak;

	PogađanjeBrojeva() {

		zamišljenBroj = (int) (100 * Math.random()) + 1;
		pogodak = false;

		System.out.println("Zamislio sam  broj između 1 i 100.");
		System.out.println("Pokušaj ga pogoditi!");
		try {
			while (!pogodak) {
				System.out.println(pokušanBroj);
				pokušanBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
				if (pokušanBroj < zamišljenBroj)
					System.out.println("Zamislio sam veći broj :-(");
				else if (pokušanBroj > zamišljenBroj)
					System.out.println("Zamislio sam manji broj :-(");
				else {
					System.out.println("Bravo! Pogodak! :-)");
					pogodak = true;
				}
			}
		} catch (Exception e) {
			System.out.println("Pogrešan unos ! ");
			
		}

	}

}
