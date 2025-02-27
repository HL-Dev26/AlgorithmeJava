// Déclaration de la classe Voiture
public class VoitureCorrection {



    // Définition des attributs de la classe Voiture
    private String marque;
    private int annee;
    private int nbDeRoue;
    private String typeCarburant;
    private boolean moteur;
    private boolean contact;
    private boolean accelerateur;
    private boolean frein;


    public VoitureCorrection(){

    }


    public VoitureCorrection(String marque, int annee, int nbDeRoue,String typeCarburant, boolean moteur , boolean contact, boolean accelerateur, boolean frein ) {
        
        /* Initailisation des attributs */

        this.marque = marque;
        this.annee = annee;
        this.nbDeRoue = nbDeRoue;
        this.typeCarburant = typeCarburant;
        this.moteur = moteur;
        this.contact = contact;
        this.accelerateur = accelerateur;
        this.frein = frein;

    }

    public VoitureCorrection(VoitureCorrection v1) {
       
    }


    public void demarrer() {

        contact = true;

            if (moteur == false) {

                 moteur = true;
                 
            System.out.println("La voiture est démarre");

            } else {
            System.out.println("La voiture est déjà démarré ");
            }


        }


    


        public void stopper() {

            contact = false;
    
                if (moteur == true) {
    
                     moteur = false;
                     
                System.out.println("La voiture a été arrêté");
    
                } else {
                System.out.println("La voiture a déjà été arrêté ");
                }
    
    
            }



            public void avancer() {

                accelerateur = true;
        
                if (contact == true && moteur == true && frein == false){
    
                    System.out.println("La voiture avance");
                    
                    }else{
                    
                        System.out.println("La voiture ne peut pas avancé, veuillez la démarrer");

                    }
                    
        
                }


                public void ralentir() {

                    frein = true;
            
                    if (contact == true && moteur == true && accelerateur == false){
        
                        System.out.println("La voiture ralenti");
                        
                        }else{
                        
                            System.out.println("La voiture ne peut pas freiner ni ralentir, veuillez la démarrer et faire avancer");
    
                        }
                        
            
                    }

                
  



}