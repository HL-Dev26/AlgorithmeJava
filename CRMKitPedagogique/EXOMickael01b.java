
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class EXOMickael01b {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print(" Veuillez saisir votre nom et prénom :");
        String nomprenon = scanner.nextLine();
        System.out.print(" Veuillez saisir votre date de naissance (aaaa-mm-jj):");
        String naissancestr = scanner.nextLine();
        LocalDate naissance = LocalDate.parse(naissancestr);

        LocalDate aujourd = LocalDate.now();
        int âge = Period.between(naissance, aujourd).getYears();

        if (âge >= 18) {
            System.out.print(" Veuillez saisir votre métier :");
            String choix = scanner.nextLine();
            System.out.println( " Vous êtes " + nomprenon + " votre date de naissance est le " + naissancestr + " vous avez " + âge + " ans et votre métier est " + choix );
        } else {
            System.out.print(" Veuillez saisir votre Coluleur préférée :");
            String choix = scanner.nextLine(); 
            System.out.println( " Vous êtes " + nomprenon + " votre date de naissance est le " + naissancestr + " vous avez " + âge + " ans et votre couleur préférée est le " + choix );
        }


        scanner.close();




    }
}
