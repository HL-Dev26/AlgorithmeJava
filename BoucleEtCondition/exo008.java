public class exo008 {


    /*  EXERCICE 8 (Version original): Créer un algorithme qui convertit n'importe qu'elle valeurs décimal (entier) en binaire */

    public static void main(String[] args) {
       
        int dec = 0;
        int quotient = dec ;
        int  reste = 0;
        String bin = "";
       
        while (quotient > 0) {
            reste = quotient % 2;
            quotient = quotient / 2;
 
            bin = reste + bin ;
       
        }
        System.out.println();
        System.out.print(bin);
    }
}
            /*  Résultat Attendu : 1 en décimal vaut 0001 en binaire */

