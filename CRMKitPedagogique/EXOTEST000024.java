import java.util.Scanner;

public class EXOTEST000024 {
            /*Exercice 2.4 : Je prédis l’avenir

            Cet algorithme est destiné à prévenir l’avenir et il doit être infaillible !

            Le programme demande à l’utilisateur de saisir 2 nombres entiers correspondant respectivement à des heures et des minutes.
            Le programme affichera ensuite l’heure qu’il sera 3 minutes plus tard.
            Par exemple, si l’utilisateur saisit 23 puis 12 (correspondant à 23h12), le programme doit afficher Dans 3 minutes, il sera 23h15.

            Si les nombres saisis par l’utilisateur sont “hors limite”, le programme affichera “Les données saisies sont invalides” */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir heure : ");
        int heure = scanner.nextInt();
        System.out.print("Saisir minute : ");
        int minute = scanner.nextInt();
        if (heure < 0 || heure > 23 || minute < 0 || minute > 59) {
            System.out.println(" Les données saisies sont invalides ");
        } else {
            minute = minute + 3;

            if (minute > 59) {
                heure = heure + 1;
                minute = minute - 60;
                // heure += 1;
                if (heure > 23) {
                    heure = 0;
                }

            }
            System.out.println("Dans 3 minutes il sera : " + heure + "h" + minute);
        }
        scanner.close();
    }
}