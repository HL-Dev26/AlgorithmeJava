public class Voiture implements Cloneable{

        /*Objet : voiture
 
        Attributs : Marque
                    année
                    nb de roue
                    TypeCarburant
                    Moteur (Booléen pour dire si il est activé ou non)
                    Contact (Clé de contact inséré)
                    Accélérateur (booléen)
                    Frein (booléen)
        
        Opération : Démarrer()
                    Stopper()
                    Avancer()
                    Ralentir() */

        // Atributs
        private String marque;
        private int annee;
        private int nbRoues;
        private String typeCarburant;
        private boolean moteur;
        private boolean contact;
        private boolean accelerateur;
        private boolean frein;

        //Constructeur par defaut
        public Voiture() {
    }
        /*Constructeur classique
        This. sert à indiquer un objet particulier*/
    public Voiture(String marque, int annee, int nbRoues, String typeCarburant, boolean moteur, boolean contact, boolean accelerateur, boolean frein) {
        this.marque = marque;
        this.annee = annee;
        this.nbRoues = nbRoues;
        this.typeCarburant = typeCarburant;
        this.moteur = moteur;
        this.contact = contact;
        this.accelerateur = accelerateur;
        this.frein = frein;
    }
    public Object clone(){
        Object o = null;
        try {
            /* On récupère l'instance à renvoyer par l'appel de la
            méthode super.clone()*/
            o = super.clone();
        } catch (CloneNotSupportedException cnse) {
            /*Ne devrait jamais arriver, car nous implémentons
            l'interface Cloneable*/
            cnse.printStackTrace(System.err);
        }
        // on renvoie le clone
        return o;
    }
        // Méthode toString pour afficher tous les attributs de l'objet
    public String toString() {
        return "Voiture [marque=" + marque + ", annee=" + annee + ", nbRoues=" + nbRoues + ", typeCarburant="
                + typeCarburant + ", moteur=" + moteur + ", contact=" + contact + ", accelerateur=" + accelerateur
                + ", frein=" + frein + "]";
    }
        // Vérifie que la voiture et démarrer
    public boolean demarrer() {
        if (contact == false) {
            this.contact = true;
            this.moteur = true;
            System.out.println("La voiture est mainteant démarrée");
            return true;
        } else {
            System.out.println("La voiture est déjà démarrée");
            return false;
        }
    }
        // Vérifie que la voiture et stopper
    public boolean stopper() {
        if (contact == true) {
            this.contact = false;
            this.moteur = false;
            System.out.println("La voiture est maintenant à l'arrêt");
            return true;
        } else {
            System.out.println("La voiture est déjà à l'arrêt");
            return false;
        }
    }
        // Vérifie que la voiture avance
    public boolean avancer() {
        if (contact == true) {
            this.frein = false;
            this.accelerateur = true;
            System.out.println("La voiture avance");
            return true;
        } else {
            System.out.println("La voiture n'est pas démarrée");
            return false;
        }
    }
        // Vérifie que la voiture freine
    public boolean ralentir() {
        if (contact == true) {
            this.accelerateur = false;
            this.frein = true;
            System.out.println("La voiture freine");
            return true;
        } else {
            System.out.println("La voiture n'est pas démarrée");
            return false;
        }
    }
}
