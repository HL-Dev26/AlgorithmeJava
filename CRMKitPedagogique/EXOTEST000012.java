
import java.util.Scanner;

public class EXOTEST000012 {
    /*Exercice 1.2 : Hello you

    *L’utilisateur est invité à saisir son prénom dans la console.
    *Le programme affiche “Bonjour “ suivi du prénom saisi.
    *Exemple de fonctionnement du programme en mode Console :
    
    *Veuillez saisir votre prénom : Mike 
    *Bonjour Mike
    *Appuyez sur une touche pour quitter.
    */
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Veuillez saisir votre prénom :");
        String prenom = scanner.nextLine();
        System.out.println(" Bonjour " + prenom);
        scanner.close();




    }
}
