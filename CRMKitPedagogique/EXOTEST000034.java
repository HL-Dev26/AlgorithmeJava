import java.util.Scanner;

public class EXOTEST000034{
           /*Exercice 3.4 : La somme
            Écrire un algorithme qui demande un nombre de départ, et qui calcule et affiche la somme des entiers jusqu’à ce nombre.
    
            Par exemple, si l’utilisateur saisit le nombre 5, le programme doit afficher :
    
            La somme des nombres jusque 5 est: 15
    
            NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero: ");
        int numero = scanner.nextInt();
        int resultat = 0;
        for (int i = 1; i <= numero; i++) {
            resultat += i;
          
        }
    System.out.println("La somme des nombres jusque " + numero + " est: " + resultat);
        scanner.close(); 
    }
}
