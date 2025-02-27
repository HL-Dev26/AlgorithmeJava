import java.util.Arrays;


public class EXOTEST000041 {
    /*
     * Exercice 4.1 : Créer un tableau d’entiers
     * Écrire un algorithme qui déclare un tableau d’entiers et le remplit avec 7
     * valeurs numériques en les mettant toutes à zéro.
     */

    public static void main(String[] args) {
        /* VARIABLES */
        int[] tab;

        /* TRAITEMENT */
        tab = new int[7];
        // int [] tab1 = new int [7];
        //System.out.print("Valeurs tableau : ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 0;
            // tab1[i] = tab[i] + i;
           // System.out.print("[" + tab[i] + "] ");
            //System.out.println("Valeur tableau[" + i + "] = [" + tab[i] + "]");
        }
        /* AFFICHAGE RESULTAT */
        System.out.println("valeurs du tableau : " + Arrays.toString(tab));

    }

}
