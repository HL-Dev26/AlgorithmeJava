import java.util.Scanner;

public class EXOTEST000029 {
            /*Exercice 2.9 : Tarif Assurance
            Une compagnie d’assurance automobile propose à ses clients quatre familles de tarifs identifiables par une couleur, du moins au plus onéreux :

            Tarifs bleu, vert, orange et rouge.
            Le tarif dépend de la situation du conducteur :

            Un conducteur de moins de 25 ans et titulaire du permis depuis moins de deux ans, se voit attribuer le tarif rouge,
            si toutefois il n’a jamais été responsable d’accident.
            Sinon, la compagnie refuse de l’assurer.
            Un conducteur de moins de 25 ans et titulaire du permis depuis plus de deux ans, ou de plus de 25 ans mais titulaire du permis depuis
            moins de deux ans a le droit au tarif orange s’il n’a jamais provoqué d’accident, ou le tarif rouge s’il a été repsonsable d’un accident, sinon il est refusé.

            Un conducteur de plus de 25 ans titulaire du permis depuis plus de deux ans bénéficie du tarif vert s’il n’est à l’origine d’aucun accident
            et du tarif orange pour un accident, du tarif rouge pour deux accidents, et refusé au-delà

            De plus, pour encourager la fidélité des clients acceptés, la compagnie propose un contrat de la couleur immédiatement la plus avantageuse
            s’il est assuré depuis plus de cinq ans. Ainsi, s’il satisfait à cette exigence, un client normalement “vert” devient “bleu”,
            un client normalement “orange” devient “vert”, et le “rouge” devient orange.

            Ecrire l’algorithme permettant de saisir les données nécessaires (sans contrôle de saisie) et de traiter ce problème. 
            Avant de se lancer à corps perdu dans cet exercice, on pourra réfléchir un peu et s’apercevoir qu’il est plus simple qu’il n’en a l’air 
            (cela s’appelle faire une analyse !)… */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Rentrer un âge : ");
        int age = scanner.nextInt();
        System.out.print(" Rentrer un nombre d'année de permis : ");
        int anpermis = scanner.nextInt();
        System.out.print(" Rentrer un nombre d'accident : ");
        int accident = scanner.nextInt();
        System.out.print(" Rentrer un nombre d'année d'assurance : ");
        int anassur = scanner.nextInt();


        String tarif = "Refusé";

        if (age < 25) {
            if (anpermis < 2) {
                if (accident == 0) {
                    tarif = "Rouge";
                }
            } else {
                if (accident == 0) {
                    tarif = "Orange";
                } else if (accident == 1) {
                    tarif = "Rouge";
                }
            }
        } else {
            if (anpermis < 2) {
                if (accident == 0) {
                    tarif = "Orange";
                } else if (accident == 1) {
                    tarif = "Rouge";
                }
            } else {
                if (accident == 0) {
                    tarif = "Vert";
                } else if (accident == 1) {
                    tarif = "Orange";
                } else if (accident == 2) {
                    tarif = "Rouge";
                }
            }
        }
        if (anassur > 5) {
            if (tarif == "Vert") {
                tarif = "Bleu";
            } else if (tarif == "Orange") {
                tarif = "Vert";
            } else if (tarif == "Rouge") {
                tarif = "Orange";
            }
        }
        System.out.println("Le tarif attribué est : " + tarif);
        scanner.close();  
    }
}