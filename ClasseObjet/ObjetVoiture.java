public class ObjetVoiture {
    public static void main(String[] args) {
        // Création d'un objet Voiture avec le constructeur classique
        Voiture maVoiture = new Voiture("Peugeot", 2024, 4, "Essence", true, false, false, true);

        // Affichage des informations de la voiture
        System.out.println(maVoiture.toString());

        // Démarrage de la voiture
        maVoiture.demarrer();

        // Faire avancer la voiture
        maVoiture.avancer();

        // Faire ralentir la voiture
        maVoiture.ralentir();

        // Arrêter la voiture
        maVoiture.stopper();

        // Clonage de la voiture
        Voiture voitureClonee = (Voiture) maVoiture.clone();

        // Affichage des informations de la voiture clonée
        System.out.println(voitureClonee.toString());
    }
}