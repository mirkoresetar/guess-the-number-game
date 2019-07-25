package vjezbaKnjiga;

import javax.swing.JOptionPane;

public class PogaðanjeBrojeva {
	int zamišljenBroj;
	int pokušanBroj;
	boolean pogodak;

	PogaðanjeBrojeva() {

		zamišljenBroj = (int) (100 * Math.random()) + 1;
		pogodak = false;

		System.out.println("Zamislio sam  broj izmeðu 1 i 100.");
		System.out.println("Pokušaj ga pogoditi!");
		try {
			while (!pogodak) {
				System.out.println(pokušanBroj);
				pokušanBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
				if (pokušanBroj < zamišljenBroj)
					System.out.println("Zamislio sam veæi broj :-(");
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
