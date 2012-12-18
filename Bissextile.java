import java.util.Scanner;

public class Bissextile {
    public static void main (String[] args) {
	
	// Exemple d'utilisation

	Scanner clavier = new Scanner(System.in);
	int année;

	année = clavier.nextInt();

	if (estBissextile(année)) {
	    System.out.println("L'année "+année+" est bissextile.");
	} else {
	    System.out.println("L'année "+année+" n'est pas bissextile.");
	}
    }
    public static boolean estBissextile (int année) {

	if ((année % 4 == 0) && (année % 100 != 0) || (année % 400 == 0)) {
	    return true;
	} else {
	    return false;
	}

    }

}
