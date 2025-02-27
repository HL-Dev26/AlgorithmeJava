import java.util.Scanner;

public class EXOTEST000038{
            /*Exercice 3.8 : Paiement et rendu monnaie
            Écrire un algorithme qui demande à l’utilisateur de saisir des prix en € (nombre à 1 décimale) correspondant aux achats d’un client. 
            Lorsque l’utilisateur saisit le nombre 0, on estime que la saisie est terminée. Le programme calcule et affiche la somme totale
            à payer.
    
            On estime que le client paie uniquement avec des billets de 5€.
    
            Afficher ensuite :
    
            Le nombre de billets de 5€ qu’il doit donner pour payer la somme dûe.
            La somme à rendre par le magasin
            La répartition optimale des billets / pièces à rendre au client (pièces disponibles : 0.10€ 0.20€, 0.50€, 1€, 2€).
            Exemple :
    
            Saisir un prix : 12.5
            Saisir un prix : 9.3
            Saisir un prix : 15.9
            Saisir un prix : 0
    
            Le client doit payer : 37.70 Euros.
            Le client doit donner 8 billets de 5 Euros soit 40 Euros.
            Rendu monnaie : 2.30 Euros
            Répartition de la monnaie à restituer au client : 
            - 1 pièce de 2 Euros
            - 1 pièce de 0.20 Euros
            - 1 pièce de 0.10 Euros */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double toto = 0.0;
        double rendre = 0.0;
        int b5 = 0;

        while (true) {
            System.out.print(" Saisir prix d'un article: ");
            double article = scanner.nextDouble();
            if (article == 0) {
                break;
            }
            toto += article;
        }
        System.out.println(" le total des articles est de : " + toto + " Euros ");

        if (toto % 5 == 0) {
            b5 = (int) toto / 5;
            
        }
        else{
            b5 = (int) toto /5 + 1;
        }
        rendre = (b5 * 5) - toto;
        double rrendre = Math.round(rendre*100.0)/100.0;
        System.out.println("Le client donne : " + b5 + " billets de 5 Euros");
        System.out.println(" à rendre : " + rrendre + " Euro ");


        double [] pieces = { 2 , 1 , 0.50 , 0.20 , 0.10 };

        System.out.println(" Répartition de la monnaie à restituer au client :");
        for (int i = 0; i < pieces.length; i++) {
            int cp = 0;
            while (rrendre >= pieces [i])  {
            rrendre = rrendre - pieces [i];
            cp += 1;

            }
            if (cp > 0) {
                System.out.println(cp + " pièce de " + pieces [i]);
            }    
        }
        scanner.close(); 
    }
}
