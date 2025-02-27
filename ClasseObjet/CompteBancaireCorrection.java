// Déclaration de la classe AccountBank

import java.util.List;

public class CompteBancaireCorrection {

    // Définition des attributs de la classe AccountBank
    private int id;
    private String owner;
    private double solde;
    private List<CreditCardCorrection> creditCards;

    // Constructeur par défaut
    public CompteBancaireCorrection() {


    }

    // Constructeur avec paramètres
    public CompteBancaireCorrection(int id, String owner, double solde, List<CreditCardCorrection> creditCards) {
        
        
        this.id = id;
        this.owner = owner;
        this.creditCards = creditCards;
        this.solde = solde;

    }


    public CreditCardCorrection chooseCard(int i){

        return creditCards.get(i);

    }


    public boolean canIbuyit(double amount, int i){

        CreditCardCorrection card = chooseCard(i);
        
        return card.getOverdraft() < (this.solde - amount);

    }


}