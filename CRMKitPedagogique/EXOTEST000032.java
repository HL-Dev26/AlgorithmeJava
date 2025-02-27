import java.util.Scanner;

public class EXOTEST000032{
            /*Exercice 3.2 : La bonne plage de galets
            Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.
            En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », 
            et inversement, « Plus grand ! » si le nombre est inférieur à 10.
            Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;

        
        while (nombre < 10 || nombre > 20) {
            System.out.println(" Rentrer un nombre compris entre 10 et 20 : ");
            nombre = scanner.nextInt();
            if (nombre > 9) {
                System.out.println(" Plus Petit ");   
            }
            else if (nombre < 11) {
                System.out.println(" Plus Grand ");
          }
          

        }
    System.out.println(" Yes, you did it ! ");
        scanner.close(); 
    }
}
