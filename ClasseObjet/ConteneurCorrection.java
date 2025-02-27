import java.util.ArrayList;

public class ConteneurCorrection {
    public static void main(String[] args) {


        ArrayList<CreditCardCorrection> cards = new ArrayList<>();
        cards.add(new CreditCardCorrection(1," carte Electron ",0));
        cards.add(new CreditCardCorrection(2," carte Classic ",-1000));
        cards.add(new CreditCardCorrection(3," carte Gold ",-5000));

        System.out.println("Mes cartes :" + cards); // Mes cartes  */

        CompteBancaireCorrection account = new CompteBancaireCorrection(123456,"Eudes KONDA",3500.25,cards);
        
        System.out.println("Je peux acheter :"+account.canIbuyit(3700, 1)); /* Si on peut acheter */


    }
}