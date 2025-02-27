import java.util.Scanner;

public class EXOTEST000036{
            /*Exercice 3.6 : Et le plus grand est…
            Érire un algorithme qui demande successivement 20 nombres à l’utilisateur,
            et qui lui inqique ensuite quel est le plus grand parmi ces 20 nombres.
    
            Exemple de fonctionnement du programme :
    
            Entrez le nombre numéro 1 : 12
            Entrez le nombre numéro 2 : 14
            etc...
            Entrez le nombre numéro 20: 6
    
            Résultat : 
            Le plus grand des nombres saisis est : 14.
            14 était le nombre numéro 2. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pgrand = 0;
        int resultat = -1;

        for (int i = 1; i <= 20; i++) {
            System.out.print(" Saisir le numero: " + i +": ");
            int numero = scanner.nextInt();

            if (numero > pgrand ) {
                pgrand = numero;
                resultat = i;
            }
        }
        System.out.println("Résultat :");
        System.out.println("Le plus grand des nombres saisis est : " + pgrand + ".");
        System.out.println(pgrand + " était le nombre numéro " + resultat + ".");
        scanner.close(); 
    }
}
