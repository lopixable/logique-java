import java.util.Scanner;

public class Swap {
    public static void main (String[] args) {

	// Exemple d'utilisation

	Scanner clavier = new Scanner(System.in);
	int a;
	int b;

	a = clavier.nextInt();
	b = clavier.nextInt();

	System.out.println("La variable a vaut "+a+" et la variable b vaut "+b);
	swap(a,b);

    }
    public static void swap (int a, int b) {

	int tmp;

	tmp = a;
	a = b;
	b = tmp;
	
	System.out.println("La variable a vaut "+a+" et la variable b vaut "+b);
    }
}
