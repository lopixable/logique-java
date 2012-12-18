import java.util.Scanner;

public class Max3 {
    public static void main(String args[]) {

        int a;
        int b;
        int c;

        Scanner clavier = new Scanner (System.in);

        a = clavier.nextInt();
        b = clavier.nextInt();
        c = clavier.nextInt();

        System.out.println("Le maximum des 3 nombres est "+max2(max2(a,b),c));

    }
    public static int max2(int a, int b) {
        if (a > b) {
                return a;
        } else {
                return b;
        }
    }
}
