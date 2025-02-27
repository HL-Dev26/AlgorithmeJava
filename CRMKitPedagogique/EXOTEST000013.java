import java.util.Scanner;

public class EXOTEST000013 {
           /*Exercice 1.3 : Calcul de la moyenne de 2 nombres

            L’utilisateur est invité à saisir 2 nombres entier.
            Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.
            Exemple de fonctionnement du programme en mode Console :

            Veuillez saisir un premier nombre : 12 
            Veuillez saisir un second nombre : 81
            La moyenne de 12 et 81 est : 46.5
            Appuyez sur une touche pour quitter.
            */


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print(" Veuillez saisir un premier Nombre : ");
                double nombre1 = scanner.nextInt(0);
                System.out.print( " Veuillez saisir un second nombre : ");
                double nombre2 = scanner.nextInt();

                double moyenne = nombre1 + nombre2/2;

                System.out.println( " La moyenne entre " + nombre1 + " et " + nombre2 + " est de : " + moyenne );
                scanner.close();


            } 
              
    
}
