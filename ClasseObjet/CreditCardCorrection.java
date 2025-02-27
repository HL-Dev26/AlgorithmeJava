// Déclaration de la classe CompteBancaire
public class CreditCardCorrection {



    // Définition des attributs de la classe CompteBancaire
    private int id;
    private String name;
    private double overdraft;
    

    CreditCardCorrection(){


    }

    public CreditCardCorrection(int id, String name, double overdraft) {

        this.id = id;
        this.name = name;
        this.overdraft = overdraft;
    }


    public double getOverdraft(){

        return this.overdraft;
    }


}