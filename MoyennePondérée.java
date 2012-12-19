package g36134.evaluations.i2;
import pbt.util.*;

public class MoyennePondérée {

    public static void main (String[] args) {

	final int[] PONDÉRATIONS = {5,5,10,10,35,35};
	int[] arguments = traiterArguments(args);
	boolean erreur = false;	

	for (int i = 0; i < arguments.length; i++) {
	    if (arguments[i] < 0 || erreur) {
		erreur = true;
	    }
	}
	
	if (!erreur) {
	    ArraysPbt.display(arguments);
	    System.out.println("La moyenne pondérée des côtes est "+moyennePondérée(arguments, PONDÉRATIONS)+"/20");
	} else {
	    usage();
	}
    }

    public static void usage () {

	System.out.println("Usage: java g36134.evaluations.i2.MoyennePondérée c1 c2 c3 c4 c5 c6");
	System.out.println("Où \"ci\" sont des cotes entières sur 20");
    }

    public static int[] traiterArguments (String[] args) {

	int n = args.length;
	int[] arguments = new int[n];

        if (n == 6) {	// Nombre d'éléments que doit avoir le tableau
	    for (int i = 0; i < n; i++) {
                try {
                    arguments[i] = Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    arguments[i] = -1;
                }
	    }
        } else {
	    arguments[0] = -1;
	}

	return arguments;
    }

    public static double moyennePondérée (int[] valeurs, int[] pondérations) {

	/**
	* Calcul la moyenne pondérée. Les cotes sont sur 20 et la pondérations
	* comprise entre 0 et 100 inclus.
	* @author G36134
	* @param valeurs	tableau d'entiers
	* @param pondérations	tableau d'entiers
	* @return la moyenne pondérée sous forme d'un réel
	*/
	
	int n = valeurs.length;
	int m = pondérations.length;
	int i = 0;
	int j = 0;
	int k = 0;
	double sommesIntermédiaires = 0.0;
	boolean ok1 = true;
	boolean ok2 = true;

	while (i < n && ok1 == true) {	// Vérification des éléments du tableau valeurs
	    if (valeurs[i] < 0 && valeurs[i] > 20) {
		ok1 = false;
	    }

	    i++;
	}

        while (j < m && ok2 == true && ok1 == true) {	// Vérification des éléments du tableau pondérations
            if (valeurs[j] < 0 && valeurs[j] > 100) {
                ok2 = false;
            }

            j++;
        }
	
	while (ok1 && ok2 && k < n) {
	    sommesIntermédiaires = sommesIntermédiaires + valeurs[k] * pondérations[k]/100;
	    k++;
	}
	
	return sommesIntermédiaires;
    }
} 
