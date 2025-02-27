import java.util.Arrays;
import java.util.Scanner;

public class EXOTEST000047{
    /*Exercice 4.7 : Modifier un tableau

    Écrire un algorithme qui permet la saisie d’un nombre quelconque de valeurs, sur le principe de l’exercice 4.3.
    
    Toutes les valeurs doivent être ensuite augmentées de 1, et le nouveau tableau sera affiché à l’écran.*/

    public static void main(String[] args) {
        /* VARIABLES */
        Scanner scanner;
        int[] tabl;
        int numero;



        /* TRAITEMENT */
        System.out.print(" Modifier un tableau ");
        scanner = new Scanner(System.in);
        System.out.print(" Saisir le nombre d'entre du talbleau : ");
        numero = scanner.nextInt();

        tabl = new int[numero];

        for (int i = 0; i < tabl.length ; i++) {
        System.out.print(" Saisir la valeur " + ( i + 1 ) + " du tableau : " );
        tabl[i] = scanner.nextInt();     
        }
        for (int i = 0; i < tabl.length; i++) {
        tabl[i] = tabl[i] + 1;   
        }

        /* AFFICHAGE RESULTAT */
        System.out.print(Arrays.toString(tabl));
        scanner.close();
    }

}