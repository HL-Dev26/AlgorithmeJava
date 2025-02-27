import java.util.Arrays;
import java.util.Scanner;

public class EXOTEST000045 {
    /*Exercice 4.5 : Somme des valeurs de 2 tableaux
    Écrire un algorithme qui respecte la demande suivante :

    Créer 2 tableaux d’entiers de même longueur.
    Créer un 3ème tableau dont les valeurs sont la somme des valeurs des 2 tableaux précédents. */

    public static void main(String[] args) {

        /* VARIABLES */
        Scanner sc;
        int[] tabl1;
        int[] tabl2;
        int[] tabl3;

        /* TRAITEMENT */
        System.out.println(" Somme des valeurs de 2 tableaux ");
        sc = new Scanner(System.in);
        tabl1 = new int[8];
        tabl2 = new int[8];
        tabl3 = new int[8];
        

        for (int i = 0; i < tabl1.length; i++) {
            System.out.print(" Saisir le nombre " + ( i + 1 ) + " du tableau 1 : ");
            tabl1[i] = sc.nextInt();
        }
        for (int i = 0; i < tabl2.length; i++) {
            System.out.print(" Saisir le nombre " + ( i + 1 ) + " du tableau 2 : ");
            tabl2[i] = sc.nextInt();
        }
        for (int i = 0; i < tabl3.length; i++) {
            tabl3[i] = tabl1[i] + tabl2 [i];
            
        }
    
    
        /* AFFICHAGE */
        System.out.print(" La somme des valeur du tableau est :" + Arrays.toString(tabl3));   
        sc.close();
    }

}
