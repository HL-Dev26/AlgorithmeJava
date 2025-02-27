import java.util.Scanner;

public class EXOTEST000014 {
            /*Exercice 1.4 : Calcul de l’aire et du volume d’une sphère

            Lire le rayon R d’une sphère puis calculer et afficher :
            L’aire de la sphère = 4 π R²
            Le volume de la sphère = (4 π R³)/3
            Exemple de fonctionnement du programme en mode Console :

            Veuillez saisir un rayon : 42 
            L'aire de la sphère est : 22167.0778
            Le volume de la sphère est : 310181.76
            Appuyez sur une touche pour quitter.
            */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double aire, volume;
        System.out.println("");
        System.out.print(" définir rayon : ");
        double rayon = scanner.nextInt();

        aire = 4 * Math.PI * Math.pow(rayon, 2);
        volume = (4 * Math.PI * Math.pow(rayon, 3)) / 3;

        System.out.println("Avec un rayon de : " + rayon);
        System.out.println(" L'aire de la sphère est de : " + aire);
        System.out.println(" Le volume de la sphére est de : " + volume);

        scanner.close();
    }

}