import java.util.Scanner;

public class EXOTEST000044 {
    /* Exercice 4.4 : Somme des valeurs d’un tableau
     * Écrire un algorithme calculant la somme des valeurs d’un tableau (on suppose
     * que le tableau a été préalablement saisi avec 10 nombres réels (float)).*/
    
    public static void main(String[] args) {

        /* VARIABLES */
        Scanner sc;
        float resultat;
        float[] tabl;

        /* TRAITEMENT */
        System.out.println(" Somme des valeurs d un tableau ");
        sc = new Scanner(System.in);
        tabl = new float[10];
        resultat = 0;

        for (int i = 0; i < tabl.length; i++) {
            System.out.print(" Saisir un nombre : ");
            tabl[i] = sc.nextFloat();
            resultat = resultat + tabl[i];

        }
        /* AFFICHAGE */
        System.out.print(" le résultat est de " + resultat);
        sc.close();
    }

}
