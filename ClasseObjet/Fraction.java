public class Fraction {
    
    private int numerateur;
    private int denominateur;

    // Constructeur par défaut
    public Fraction() {
        this.numerateur = 0;
        this.denominateur = 1;
    }
    public Fraction(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }    
    // Constructeur Classique
    public Fraction(int numerateur, int denominateur) {
        try {
            if (denominateur == 0) {
                throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
            }
            this.numerateur = numerateur;
            this.denominateur = denominateur;
            reduire();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            this.numerateur = 0;
            this.denominateur = 1;
    }
}    
     // Représentation textuelle de la fraction
     public String toString() {
         if (this.denominateur == 1) {
             return Integer.toString(this.numerateur);
         } else {
             return this.numerateur + "/" + this.denominateur;
         }
     }
 
     // Opposer la fraction
     public void oppose() {
         this.numerateur = -this.numerateur;
     }
 
     // Inverser la fraction
     public void inverse() {
        try {
            if (this.numerateur == 0) {
                throw new ArithmeticException("Division par zéro impossible, inversion impossible");
            }
            int temp = this.numerateur;
            this.numerateur = this.denominateur;
            this.denominateur = temp;
            reduire();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
 
     // Vérifier si une fraction est supérieure à une autre
     public boolean superieurA(Fraction autre) {
         return (this.numerateur * autre.denominateur) > (autre.numerateur * this.denominateur);
     }
 
     // Vérifier si une fraction est égale à une autre
     public boolean egalA(Fraction autre) {
         return (this.numerateur * autre.denominateur) == (autre.numerateur * this.denominateur);
     }
 
     // Additionner deux fractions
     public void plus(Fraction autre) {
         this.numerateur = (this.numerateur * autre.denominateur) + (autre.numerateur * this.denominateur);
         this.denominateur = this.denominateur * autre.denominateur;
         reduire();
     }
 
     // Soustraire deux fractions
     public void moins(Fraction autre) {
         this.numerateur = (this.numerateur * autre.denominateur) - (autre.numerateur * this.denominateur);
         this.denominateur = this.denominateur * autre.denominateur;
         reduire();
     }
 
     // Multiplier deux fractions
     public void multiplie(Fraction autre) {
         this.numerateur = this.numerateur * autre.numerateur;
         this.denominateur = this.denominateur * autre.denominateur;
         reduire();
     }
 
     // Diviser deux fractions
     public void divise(Fraction autre) {
        try {
            if (autre.numerateur == 0) {
                throw new ArithmeticException("Division par zéro.");
            }
            autre.inverse();
            this.multiplie(autre);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
 
     // Réduire la fraction
     private void reduire() {
         int pgcd = getPgcd();
         this.numerateur /= pgcd;
         this.denominateur /= pgcd;
         if (this.denominateur < 0) {
             this.numerateur = -this.numerateur;
             this.denominateur = -this.denominateur;
         }
     }
 
     // Obtenir le PGCD
     private int getPgcd() {
         int a = this.numerateur;
         int b = this.denominateur;
         int pgcd = 1;
 
         if (a != 0 && b != 0) {
             if (a < 0) a = -a;
             if (b < 0) b = -b;
 
             while (a != b) {
                 if (a < b) {
                     b = b - a;
                 } else {
                     a = a - b;
                 }
             }
 
             pgcd = a;
         }
 
         return pgcd;
     }
}     