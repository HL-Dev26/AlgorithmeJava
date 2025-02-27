import java.util.Scanner;

public class EXOTEST000028 {
            /*Exercie 2.8 : Élections
            Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

            Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
            En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.
            Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

            Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable 
            (il participe au second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour). */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Score du premier candidat : ");
        int cd1 = scanner.nextInt();
        System.out.print(" Score du deuxieme candidat : ");
        int cd2 = scanner.nextInt();
        System.out.print(" Score du troisieme candidat : ");
        int cd3 = scanner.nextInt();
        System.out.print(" Score du quatrieme candidat : ");
        int cd4 = scanner.nextInt();

        int somvoix = cd1 + cd2 + cd3 + cd4;
        int pourcentcd1 = cd1 * 100 / somvoix;

        if (pourcentcd1 >= 50) {
            System.out.println(" Le premier candidat Elu ");
        }
        else if (cd2 >= somvoix / 2 || cd3 >= somvoix / 2 || cd4 >= somvoix / 2) {
            System.out.println("Un autre candidat est Elu ");
        }
        else if ((pourcentcd1 >= 12.5) && (pourcentcd1 < 50) && (cd1 >= cd2 && cd1 >= cd3 && cd1 >= cd4)) {
            System.out.println(" Le premier candidat ballottage favorable ");
        }
        else if ((pourcentcd1 >= 12.5) && (cd1 <= cd2 || cd1 <= cd3 || cd1 <= cd4)) {
            System.out.println(" Le premier candidat ballottage defavorable ");
        }
        else if (pourcentcd1 < 12.5) {
            System.out.println(" Le premier candidat à perdu");
        }

        System.out.println();
        scanner.close();
    }
}