import java.util.Scanner;

public class EXOTEST000025 {
            /*Exercice 2.5 : Réprographie

            Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.
            Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante. */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un nombre de photocopies : ");
        int photocopies = scanner.nextInt();

       double fact = 0.00;
       
        if (photocopies<=10) {
            fact = photocopies * 0.10;
        }
        else if (photocopies<=30) {
            fact = 10 * 0.10 + (photocopies - 10) * 0.09; 
        }
        else{
            fact = 10 * 0.10 + 20 * 0.09 + (photocopies - 30) * 0.08;    
        }

        System.out.println(" La facture de " + photocopies + " photocopie(s) est égale à : " + fact);

        scanner.close();
   }
}