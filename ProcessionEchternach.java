package project;
import java.util.Scanner;

public class ProcessionEchternach {
	public static void main (String[] args) {
		int nombre = 1;
		System.out.println("Combien de nombres de la procession d'Echternach faut-il afficher?");
		Scanner clavier = new Scanner(System.in);
		int taille = clavier.nextInt();
		for (int i = 1; i<= taille; i++){
			System.out.print(nombre+" ");
			switch (i%5) {
				case 1:
				case 2:
				case 3: nombre+=1;break;
				case 0:
				case 4: nombre-=1;break;
			}
		}
		System.out.println();
	}
}
