public class exo006 {



    /*  EXERCICE 6 : 
    
    Créer un algo qui calcule le coût en kilomêtrage d'un déplacement en voiture selon le type de carburant ( diesel : 0  ; sans plomb 95 : 1 ; sans plomb 98 : 2) 
     * 
     * 
     * 
     * NOTE : Comme les prix des carburant varient chaque jours, veuillez-vous référer à ce site et prendre en compte que la valeur d'aujourd'hui :
     * https://www.automobile-club.org/tourisme-et-voyages/prix-des-carburants/tendances
     * 
     * 
     * En France une voiture consomme en moyenne 6L/100 km
     * 
     */

     public static void main(String[] args) throws Exception {
         

        double distance = 200;
        int choix = 1;


        
        double conso = 0.06;
        double diesel = 1.652;
        double splomb = 1.735;
        double splomb98 = 1.840;
            
        double ddiesel = distance * diesel * conso;
        double dsplomb = distance * splomb * conso;
        double dsplomb98 = distance * splomb98 * conso;
        
        /* Afficher le résultat */
        if (choix == 0){

                System.out.println( " Trajet diesel pour " + distance + " km " + ddiesel + " euro ");

         } else if (choix == 1){
            
            System.out.println( " Trajet splomb pour " + distance + " km " + dsplomb + " euro ");
            
         } else if(choix == 0){


            System.out.println( " Trajet splomb98 pour " + distance + " km " + dsplomb98 + " euro ");
         }   
        
        }


        /* Résultat attendu  200km pour une voiture en diesel coûtent  19.68€   (Testez sur les 3 types de carburants) */


}
