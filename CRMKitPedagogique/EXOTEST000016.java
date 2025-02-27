import java.util.Scanner;

public class EXOTEST000016 {
            /*Exercice 1.6 : Inversion de 2 valeurs

            Lire 2 nombres entier A et B.
            Afficher la valeur de A puis la valeur de B.
            Mettre le contenu de A dans B et celui de B dans A.
            Afficher à nouveau la valeur de A puis la valeur de B.
             */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir A : ");
        int a = scanner.nextInt();
        System.out.print(" Saisir B : ");
        int b = scanner.nextInt();

        System.out.println(" A = " + a + " et  B = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" A = " + a + " et  B = " + b);
        scanner.close();
    }
}
