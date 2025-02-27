import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vol> listeVols = new ArrayList<>();
        listeVols.add(new Vol(244, "New York", 1000.00, 210, 89));
        listeVols.add(new Vol(365, "Johannesburg", 1200.25, 180, 50));
        listeVols.add(new Vol(777, "Tokyo", 1500.50, 200, 190));
        listeVols.add(new Vol(123, "Rio de Janeiro", 1300.75, 210, 210));
        listeVols.add(new Vol(457, "Istanbul", 900.00, 210, 3));

        System.out.println("\n");
        System.out.println("Liste des vols :");
        for (Vol vol : listeVols) {
            System.out.println(vol);
            System.out.println("\n");
        }

        Reservation reservation = new Reservation("KONDA", "Eudes", 39, true, 457, "Johannesburg");

        Vol volChoisi = reservation.choisirUnVolParId(listeVols);
        if (volChoisi != null) {
            System.out.println("Vol choisi :");
            System.out.println(volChoisi);
        } else {
            System.out.println("Aucun vol avec cet ID.");
            return;
        }

        if (reservation.complet(volChoisi)) {
            System.out.println("Vol Complet. Réservation impossible.");
            return;
        }
        System.out.print("Prix final : ");
        System.out.println(reservation.calculerPrixFinal(volChoisi));
    }
}    