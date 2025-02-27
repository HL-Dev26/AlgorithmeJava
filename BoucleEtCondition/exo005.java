public class exo005 {
    /*  EXERCICE 5 : Créer un algo qui vérifié entre chaque nombres de 1 à 20 , si ils sont paires ou impaires */
    public static void main(String[] args) throws Exception {


            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {


                    System.out.println( i + " est pair.");

                } else {

                    System.out.println( i + " est impair.");
                }
            }
        }
    }