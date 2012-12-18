public class TabEntMaxMin {
    public static void main (String[] args) {

	// Exemple d'utilisation

	int[] tabEnt = {13,92,-20,7,0,29,-4,44,102,51};

	System.out.println("Le nombre maximum du tableau d'entiers est "+maximum(tabEnt));
	System.out.println("Le nombre minimum du tableau d'entiers est "+minimum(tabEnt));
    }

    public static int maximum (int[] tabEnt) {

	int max = tabEnt[0];
	int n = tabEnt.length;

	for (int i = 1; i < n; i++) {
	    if (tabEnt[i] > max) {
		max = tabEnt[i];
	    }
	}
	
	return max;
    }

    public static int minimum (int[] tabEnt) {

        int min = tabEnt[0];
	int n = tabEnt.length;

        for (int i = 1; i < n; i++) {
            if (tabEnt[i] < min) {
                min = tabEnt[i];
            }   
        }   
            
        return min;
    }
}
