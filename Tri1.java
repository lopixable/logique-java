public class Tri1 {

    // Exemple d'utilisation

    public static void main (String[] args) {
	
	int[] tab = {5,0,41,9,22,14,7,19,4,2};
	int indiceMin;
	int tmp;
	int n = tab.length;

	for (int i = 0; i < n-1; i++) {

	    indiceMin = positionMin(tab, i, n-1);
	    tmp = tab[i];
	    tab[i] = tab[indiceMin];
	    tab[indiceMin] = tmp;
	}

	for (int a = 0; a < n; a++) {

	    System.out.print(tab[a]+" ");
	}

	System.out.println();
    }

    public static int positionMin (int[] tab, int debut, int fin) {

	int indiceMin = debut;
	
	for (int i = debut+1; i <= fin; i++) {

	    if (tab[i] < tab[indiceMin]) {

		indiceMin = i;
	    }
	}

	return indiceMin;
    }
}
