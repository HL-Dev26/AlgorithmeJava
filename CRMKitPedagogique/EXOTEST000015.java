import java.util.Scanner;

public class EXOTEST000015 {
            /*Exercice 1.5 : Calcul de la surface d’un secteur circulaire

            Lire le rayon R d’un cercle et un angle A (en degré(s)).
            Calculer et afficher :

            L’ aire du secteur circulaire = (π R² A) / 360
            */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.print(" définir Rayon : ");
        double rayon = scanner.nextInt();
        System.out.print(" définir Angle : ");
        double angle = scanner.nextInt();

        double airsecteur = Math.PI * Math.pow(rayon, 2) * angle / 360;


        System.out.println("Avec un rayon de : " + rayon + " et un angle de : " + " l'aire du secteur circulaire est de : " + airsecteur);


        scanner.close();
    }

}