import java.util.Scanner;

public class MomentSeconde {

    // Exemple d'utilisation

    public static void main (String[] args) {

	Scanner clavier = new Scanner(System.in);
	int h;
	int m;
	int s;
	
	System.out.print("Entrez les heures : ");
	h = clavier.nextInt();
	System.out.print("Entrez les minutes : ");
	m = clavier.nextInt();
	System.out.print("Entrez les secondes : ");
	s = clavier.nextInt();

	System.out.println(h+"h "+m+"m "+s+"s = "+conversionMomentSecondes(h, m, s)+" secondes.");	
    }

    public static int conversionMomentSecondes (int heure, int minute, int seconde) {

	return ( (heure * 3600) + (minute * 60) + seconde );
    }
}
