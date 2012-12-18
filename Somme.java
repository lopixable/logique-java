public class Somme {
    public static void main (String[] args) {

	// Exemple d'utilisation
	int[] tabEnt = {13,30,1,39,4,2,15};
	System.out.println(somme(tabEnt));

    }
    public static int somme (int[] tabEnt) {

        int somme;
	int n;
	
	somme = 0;
	n = tabEnt.length;

	for (int i = 0; i < n; i++) {
 	    somme += tabEnt[i];
	}
	
	return somme;
    }
}
