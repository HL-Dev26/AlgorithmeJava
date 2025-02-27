import java.util.Scanner;

public class EXOTEST000035b{
            /*Exercice 3.5 : La factorielle (2nde version)
            Écrire un algorithme qui demande à l’utilisateur de saisir un nombre, et qui calcule et affiche sa factorielle.

            Par exemple, si l’utilisateur saisit le nombre 8, le programme doit afficher :

            La factorielle de 8 est: 40320

            NB : la factorielle de 8, notée 8!, vaut 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero: ");
        long numero = scanner.nextInt();
        long resultat = 1;
        String calcul = "La factorielle de " + numero + ", notée " + numero + "!, vaut "; 

        for (int i = 1; i <= numero; i++) {
            resultat *= i;
            if (i < numero) {
                calcul += i + " x ";
            } else {
                calcul += i;
            }
        }
    System.out.println(calcul + " = " + resultat);
        scanner.close(); 
    }
}
