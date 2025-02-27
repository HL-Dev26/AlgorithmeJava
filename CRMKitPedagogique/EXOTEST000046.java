import java.util.Scanner;

public class EXOTEST000046{
    /*Exercice 4.6 : Somme des valeurs de 2 tableaux

    Toujours à partir de deux tableaux d’entiers précédemment saisis, écrivez un algorithme qui calcule la somme des produits des deux tableaux.
    Pour calculer le résultat, il faut multiplier chaque élément du tableau 1 par chaque élément du tableau 2, et additionner le tout.*/

    public static void main(String[] args) {

        /* VARIABLES */
        Scanner sc;
        int[] tabl1;
        int[] tabl2;
        int result;
        String calcul;
        boolean first;
        String tous; 

        /* TRAITEMENT */
        System.out.println(" Somme des valeurs de 2 tableaux ");
        sc = new Scanner(System.in);
        tabl1 = new int[6];
        tabl2 = new int[2];
        result = 0;
        calcul = "";
        first = true;

        for (int i = 0; i < tabl1.length; i++) {
            System.out.print(" Saisir le nombre " + ( i + 1 ) + " du tableau 1 : ");
            tabl1[i] = sc.nextInt();
        }
        for (int j = 0; j < tabl2.length; j++) {
            System.out.print(" Saisir le nombre " + ( j + 1 ) + " du tableau 2 : ");
            tabl2[j] = sc.nextInt();
        }

        
        for (int i = 0; i < tabl1.length; i++) {
            for (int j = 0; j < tabl2.length; j++) {
            int tb1 = tabl1[i];
            int tb2 = tabl2[j];
            result += tb2 * tb1;
            if (!first) {
                calcul += " + ";
            }
            calcul += tb2 + " x " + tb1;
            first = false;
            }
        }
        tous = calcul + " = " + result;

        /* AFFICHAGE RESULTAT */
        System.out.print(tous);
        sc.close();
     }     
    }


