   import java.util.Scanner;

   public class Exemple0000003 {
        /*Exemple 3 : Fonction Hello {$name}
        Créer un projet HelloName.
        Le programme demande à l’utilisateur de saisir son prénom.
        Le programme affiche ensuite “Bienvenue “ suivi du prénom saisi.
        1 fonction askFirstName servira à demander le prénom à l’utilisateur.
        1 procédure showFirstName accceptant 1 argument de type String affichera le résultat.*/
        public static void main(String[] args) {

            String result; 
            result = Exemple0000003.askFirstName(); //Demande du prénom
            Exemple0000003.showResult(result); // Affichage du résultat
            
        }

        @SuppressWarnings("resource")
        public static String askFirstName() {
            Scanner sc;
            String firstname;
            sc = new Scanner(System.in);//Initialise le Scanner
            System.out.println( "Bonjour, saisissez votre prénom: ");
            firstname = sc.nextLine(); //attente de la saisie utilisateur
            return firstname; //on retourne le résultat
            


        }

        public static void showResult(String name){
            System.out.println ( " Bonjour " + name);
        }
    }
