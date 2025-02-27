public class exo002 {

            /*  EXERCICE 2 : Créer un algo qui affiche successivement les puissances de 2 */

            public static void main(String[] args) throws Exception {
        
                int x = 22;
                int puissance = 0;
                for (int i = 0; i < x; i++){

                                 
                System.out.println("2^" + i + " = " + puissance);
                

                                         puissance = (int) Math.pow(2, i);

                                        }
                /* Afficher le résultat */
            
            }
        }
        