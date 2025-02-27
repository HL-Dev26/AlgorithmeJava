import java.util.ArrayList;

public class Reservation {
    private String nom;
    private String prenom;
    private int age;
    private double prixFinal;
    private boolean business;
    private int numeroVol;
    private String destination;

    public Reservation(String nom, String prenom, int age, boolean business, int numeroVol, String destination) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.prixFinal = 0;
        this.business = business;
        this.numeroVol = numeroVol;
        this.destination = destination;
    }

    public boolean complet(Vol vol) {
        return vol.complet();
    }

    public void reductionAge(Vol vol) {
        prixFinal = vol.getTarif();
        try {
            if (age <= 0) {
                throw new IllegalArgumentException("L'âge ne peut pas être égal à 0");
            } else if (age > 65) {
                prixFinal -= vol.getTarif() / (age * 0.05);
            } else {
                prixFinal -= vol.getTarif() / (age * 0.1);
            }
            if (prixFinal <= vol.getTarif() - 600) {
                prixFinal = vol.getTarif() - 600;

            }    
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur :" + e.getMessage());
  
        }   
    }
    public void changePrixPlace(Vol vol) {
        double pourcentageOccupe = (double) vol.getNbPlaceOccupee() / vol.getNbPlaceTotale();
        if (pourcentageOccupe <= 0.2) {                         
            prixFinal *= 0.8;                           
        } else if (pourcentageOccupe >= 0.8) {          
            prixFinal *= 1.2;
        }

    }

    public void augmentationBusiness() {
        if (business) {                                 
            prixFinal *= 1.7;
        }

    }

    public void minimumPrixFinal() {
        if (prixFinal < 500) {
            prixFinal = 500;
        }
    }

    public Vol choisirUnVolParId(ArrayList<Vol> listeVols) {
        for (Vol vol : listeVols) {
            if (vol.getId() == numeroVol) {
                return vol;
            }
        }
        return null;
    }

    public Vol choisirUnVolParDestination(ArrayList<Vol> listeVols) {
        for (Vol vol : listeVols) {
            if (vol.getDestination().equalsIgnoreCase(destination)) {
                return vol;
            }
        }
        return null;
    }

    public double calculerPrixFinal(Vol vol) {
        reductionAge(vol);
        changePrixPlace(vol);
        augmentationBusiness();
        minimumPrixFinal();
        return prixFinal;
    }
}