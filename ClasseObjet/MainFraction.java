

public class MainFraction {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(16, 24);
        System.out.println(f1); 
        Fraction f2 = new Fraction();
        System.out.println(f2); 

        Fraction f3 = new Fraction(11);
        System.out.println(f3); 

        Fraction f = new Fraction(8, 12);
        f.oppose();
        System.out.println(f); 

        f.inverse();
        System.out.println(f); 

        Fraction f4 = new Fraction(17, 5);
        Fraction f5 = new Fraction(9, 7);
        System.out.println(f4.superieurA(f5)); 
        Fraction f6 = new Fraction(13, 8);
        Fraction f7 = new Fraction(29, 17);
        System.out.println(f6.egalA(f7));

        Fraction f8 = new Fraction(180, -220);
        System.out.println(f8); 
    }
}