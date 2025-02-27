
import java.util.Scanner;

public class EXOTEST000021 {
             /*Exercice 2.1 : Positif ou négatif ?

            Écrire un algorithme qui demande à l’utilisateur de saisir 1 nombre entier et l’informe ensuite si le nombre est positif ou négatif.
            Pour information, le nombre 0 est considéré positif. */   
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print(" Saisir un nombre entier : ");
        int nombre = scanner.nextInt();

        if (nombre >= 0) {
            System.out.println(" Le nombre est positif.");

        } else {
            System.out.println(" Le nombre est négatif.");
        }
            scanner.close();

        System.out.println();
    }

}
