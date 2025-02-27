import java.util.Scanner;

public class EXOTEST000023 {
            /*Exercice 2.3 : Ma catégorie au Football

            Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient :

            Trop jeune : Moins de 5 ans
            Débutant : De 5 à 6 ans
            Poussin : De 7 à 8 ans
            Benjamin : De 9 à 10 ans
            Pupille : De 11 à 12 ans
            Minime : De 13 à 14 ans
            Cadet : De 15 à 16 ans
            Junior : De 17 à 18 ans
            Sénior : De 19 à 34 ans
            Vétéran : 35 ans et +
            */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir votre âge : ");
        int age = scanner.nextInt();
      

        String categorie;
        if (age < 5) {
            categorie = " Trop jeune ";

        } else if (age >= 5 && age <= 6) {
            categorie = " Débutant ";

        } else if (age >= 7 && age <= 8) {
            categorie = " Poussin ";

        } else if (age >= 9 && age <= 10) {
            categorie = " Benjamin ";

        } else if (age >= 11 && age <= 12) {
            categorie = " Pupille ";

        } else if (age >= 13 && age <= 14) {
            categorie = " Minime ";

        } else if (age >= 15 && age <= 16) {
            categorie = " Cadet ";

        } else if (age >= 17 && age <= 18) {
            categorie = " Junior ";

        } else if (age >= 19 && age <= 34) {
            categorie = " Sénior ";

        } else {
            categorie = " Vétéran ";
        }

        
        System.out.println(" Vous appartenez à la catégorie : " + categorie);

       
        scanner.close();
    }
}

