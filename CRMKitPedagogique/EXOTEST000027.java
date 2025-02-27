import java.util.Scanner;

public class EXOTEST000027 {
            /*Exercice 2.7 : Validité d’une date

            Écrivez un algorithme qui demande à l’utilisateur de saisir 3 nombres entiers

            1.Un numéro de jour
            2.Un numéro de mois
            3.Un numéro d’année

            L’algorithme indique ensuite s’il s’agit ou non d’une date valide.
            Il n’est sans doute pas inutile de rappeler que le mois de février compte 28 jours, sauf si l’année est bissextile, auquel cas il en compte 29.
            L’année est bissextile si elle est divisible par quatre. Toutefois, les années divisibles par 100 ne sont pas bissextiles, mais les années divisibles par 400 le sont. Ouf ! */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero de jour : ");
        int Jour = scanner.nextInt();
        System.out.print(" Saisir un numero de mois : ");
        int mois = scanner.nextInt();
        System.out.print(" Saisir un numero d'année : ");
        int année = scanner.nextInt();

        int[] joursparmois = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        
            if (année % 4 == 0 && (année % 100 != 0 || année % 400 == 0)) {
                joursparmois[1] = 29; 
            } 
            else {
                joursparmois[1] = 28;
            } 
            if ((mois <= 12 && mois >= 1) && (Jour >= 1 && Jour <= joursparmois[mois-1])) {
                System.out.println("Date valide"); 
            }
            else{
            System.out.println("Date invalide");
            }
            scanner.close();
    }
}