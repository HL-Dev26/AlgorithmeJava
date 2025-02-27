import java.util.Scanner;

public class EXOTEST000026 {
            /*Exercice 2.6 : Bisextille

            Ecrire un algorithme qui détermine si une année est bissextile.

            Les années bissextiles sont :

            les années divisibles par 4 mais non divisibles par 100
            les années divisibles par 400.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir une année : ");
        int année = scanner.nextInt();

        if (année % 4 == 0 && (année % 100 != 0 || année % 400 == 0)) {
            System.out.println(" L'année " + année + " est bisextille");
        } else {
            System.out.println(" L'année " + année + " n'est pas bisextille");
        }
        scanner.close();

    }
}