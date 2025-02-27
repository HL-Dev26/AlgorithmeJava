import java.util.Scanner;

public class EXOTEST000043 {
    /*
     * Exercice 4.3 : Alimenter un tableau
     * Écrire un algorithme permettant à l’utilisateur de saisir un nombre
     * quelconque de valeurs, qui devront être stockées dans un tableau.
     * 
     * L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il
     * compte saisir. Il effectuera ensuite cette saisie. Enfin,
     * une fois la saisie terminée, le programme affichera le nombre de valeurs
     * négatives et le nombre de valeurs positives.
     */

    public static void main(String[] args) {
        /* VARIABLES */
        int numero;
        int[] tabl;
        int nombreP;
        int nombreN;

        /* TRAITEMENT */
        System.out.print(" Alimenter un tableau ");
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir le nombre d'entre du talbleau : ");
        numero = scanner.nextInt();

        tabl = new int[numero];

        for (int i = 0; i < tabl.length; i++) {
            System.out.print(" Saisir une valeur " + (i + 1) + ": ");
            tabl[i] = scanner.nextInt();
        }

        nombreP = 0;
        nombreN = 0;
        for (int i = 0; i < tabl.length; i++) {
            if (tabl[i] >= 0)
                nombreP++;
            else
                nombreN++;
            // }
            // for (int valeur : tabl )
            //
            // if (valeur > 0 ) {
            // nombreP ++;
            // }
            // else if (valeur < 0) {
            // nombreN ++;

            /* AFFICHAGE RESULTAT */
        }
        System.out.print(" nombre positif : " + nombreP + " nombres : ");
        for (int value : tabl) {
            if (value >= 0) {
                System.out.print(value + " ");
            }
        }
        System.out.print("\n nombre négatif : " + nombreN + " nombres : ");
        for (int value : tabl) {
            if (value < 0) {
                System.out.print(value + " ");
            }
        }
        scanner.close();
    }

}
