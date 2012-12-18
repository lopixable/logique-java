import java.util.Scanner;

public class ValeurAbsolue {
    public static void main (String[] args) {

	// Exemple d'utilisation

	Scanner clavier = new Scanner(System.in);
	double nb;

	System.out.print("Entrez un nombre réel : ");
	nb = clavier.nextDouble();

	System.out.println("Sa valeur absolue est "+ valeurAbsolue(nb));

    }

    public static double valeurAbsolue (double nombre) {

	if (nombre < 0) {
	    nombre = (-1) * nombre;
	}
	
	return nombre;

    }
}
