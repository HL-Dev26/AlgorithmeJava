        public class IntroFonctionsMaths {
        /*Créer un projet “IntroFonctionsMaths”.
        Implémenter les 4 fonctions demandées ci-dessous.
        Appeler ces 4 fonctions depuis le main.
        -Créer une fonction « getSum » qui accepte deux arguments de type int. Elle devra retourner la somme des deux valeurs.
        -Créer une fonction « getSub » qui accepte deux arguments de type int. Elle devra retourner la soustraction des deux valeurs.
        -Créer une fonction getMulti qui accepte deux arguments de type float. Elle devra retourner la multiplication des deux valeurs.
        Limitez le résultat à 2 décimales.
        -Créer une fonction getDiv qui accepte deux arguments de type int. Elle devra retourner la division des deux valeurs. 
        Limitez le résultat à 2 décimales. 
        Afficher les différents résultats à l’aide d’une procédure.*/
        public static void main(String[] args) {
            int result = IntroFonctionsMaths.getSum( 5, 3 );
            int result1 =  IntroFonctionsMaths.getSub( 5, 3 );
            float result2 = IntroFonctionsMaths.getMulti( 5.6f, 3 ); 
            double result3 = IntroFonctionsMaths.getDiv( 20, 3 ); 
            System.out.println(result);
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);

        }
        public static int getSum(int a, int b) {
            return a + b;   
        }
        public static int getSub(int a, int b) {
            return(a - b);   
        }
        public static float getMulti(float a, float b) {
            return Math.round(a * b * 100) / 100;
        }
        public static double getDiv(double a, double b) {
            if (b == 0) {
            return 0;    
            }
            return Math.round( a / b * 100) / 100;   
        }
    }
