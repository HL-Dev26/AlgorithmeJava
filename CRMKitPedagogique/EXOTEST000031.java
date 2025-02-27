import java.util.Scanner;

public class EXOTEST000031 {
            /*Exercice 3.1 : La bonne plage de sable
            Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.
            Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;


        while (nombre < 1 || nombre > 3) {
            System.out.println(" Rentrer un nombre compris entre 1 et 3 : ");
            nombre = scanner.nextInt();
          
    }
    System.out.println(" Bravo, vous avez réussi ! ");
        scanner.close(); 
    }
}