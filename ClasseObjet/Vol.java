public class Vol {
    private int id;
    private String destination;
    private double tarif;
    private int nbPlaceTotale;
    private int nbPlaceOccupee;

    public Vol(int id, String destination, double tarif, int nbPlaceTotale, int nbPlaceOccupee) {
        this.id = id;
        this.destination = destination;
        this.tarif = tarif;
        this.nbPlaceTotale = nbPlaceTotale;
        this.nbPlaceOccupee = nbPlaceOccupee;
    }

    public String toString() {
        return "Id du Vol : " + id + "\n" +
               "Destination : " + destination + "\n" +
               "Tarif : " + tarif + "\n" +
               "Nombre de places total : " + nbPlaceTotale + "\n" +
               "Nombre de places occupées : " + nbPlaceOccupee;
    }
    public int getNbPlaceTotale() {
        return this.nbPlaceTotale;
    }

    public int getNbPlaceOccupee() {
        return this.nbPlaceOccupee;
    }

    public double getTarif() {
        return this.tarif;
    }

    public int getId() {
        return this.id;
    }

    public String getDestination() {
        return this.destination;
    }
    public boolean complet() {
        return nbPlaceOccupee >= nbPlaceTotale;
    }
}