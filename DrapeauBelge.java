package project;

public class DrapeauBelge {
	public static void main (String[] args){
		String noir = "\033[30;40m"; 
		String jaune = "\033[33;43m";
		String rouge = "\033[31;41m";
		String defaut = "\033[0m";
		for (int i = 1; i <= 10; i++) {
			System.out.println(noir + "          " + jaune + "           " + rouge + "          " + defaut);
		}
	}
}
