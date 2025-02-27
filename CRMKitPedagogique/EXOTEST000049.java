//import java.util.Arrays;
import java.util.Scanner;

public class EXOTEST000049{
    
    /*Toujours et encore sur le même principe, écrivez un algorithme permettant, à l’utilisateur de saisir les notes d’une classe.
    Le programme, une fois la saisie terminée, renvoie le nombre de ces notes supérieures à la moyenne de la classe.*/

    public static void main(String[] args) {
        /* VARIABLES */
        Scanner scanner;
        float [] tabl;
        float resultat;
        int numero;
        float moyenne;
        float Neleve;

         /* TRAITEMENT */
         System.out.println(" Recherche spécifique dans un tableau ");
        scanner = new Scanner(System.in);
        System.out.print(" Saisir le nombre d'élève : ");
        numero = scanner.nextInt();

        tabl = new float[numero];
        resultat = 0;  
        Neleve = 0;
        moyenne = 0;
        for (int i = 0; i < tabl.length ; i++) {
        System.out.print(" Saisir l'élève numero " + ( i + 1 ) + " avec une moyenne de : " );
        tabl[i] = scanner.nextFloat();
        resultat += tabl[i];
        }

        moyenne = resultat / tabl.length;

        for (int i = 0; i < tabl.length; i++) {
        if (tabl[i] > moyenne) {
            Neleve++;
            }    
        }
        /* AFFICHAGE RESULTAT */
        System.out.println(" La moyenne de la classe est de : " + moyenne + " il y a " + Neleve + "au dessus de la moyenne");
        scanner.close();
    }

}
