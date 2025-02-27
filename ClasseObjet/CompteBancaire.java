public class CompteBancaire {

    private int id;
    private String proprietaire;
    private double solde;
    private double decouvert;

    public CompteBancaire() {
        this.id = 0;
        this.proprietaire = "";
        this.solde = 0;
        this.decouvert = 0;
    }

    public CompteBancaire(int id, String proprietaire, double solde, double decouvert) {
        this.id = id;
        this.proprietaire = proprietaire;
        this.solde = solde;
        if (decouvert > 0) {
            decouvert = decouvert * -1;
        }
        this.decouvert = decouvert;
    }

    public CompteBancaire(CompteBancaire accountToClone) {
        this.id = accountToClone.id;
        this.proprietaire = accountToClone.proprietaire;
        this.solde = accountToClone.solde;
        this.decouvert = accountToClone.decouvert;

    }    
    public String toString() {
        String result;
        

        result = "\n####################################";
        result += "\n# id = " + id;
        result += "\n# proprietaire = " + proprietaire;
        result += "\n# solde = " + solde;
        result += "\n# decouvert = " + decouvert;
        result += "\n####################################";
        return result;
    }

    public double getBalance() {
        return solde;
    }

    public void credit(double amount) {
        System.out.println("\nSolde [" + this.id + "]: " + this.solde);
        this.solde += amount;
        System.out.println("Crédit de : " + amount);
        System.out.println("Nouveau solde [" + this.id + "]: " + this.solde);
    }

    public boolean debit(double amount) {
        System.out.println("\nSolde [" + this.id + "]: " + this.solde);
        if (this.solde + this.decouvert >= amount) {
            this.solde -= amount;
            System.out.println("Débit de : " + amount);
            System.out.println("Nouveau solde [" + this.id + "]: " + this.solde);
            return true;
        } else {
            System.out.println("Fonds insuffissant");
            return false;
        }
    }

    public boolean transfert(CompteBancaire accountName, double amount) {
        boolean result;
        result = this.debit(amount);
        if (result) {
            accountName.credit(amount);
        }
        return result;
    }

    public boolean compare(CompteBancaire accountName) {
        boolean result = (this.solde > accountName.solde) ? true : false;
        System.out.print("\nSolde du compte [" + this.id + "] ");
        if (result) {
            System.out.print("supérieur ");
        } else {
            System.out.print("inférieur ");
        }
        System.out.print("au solde du compte [" + accountName.id +"]");
        return result;
    }
}