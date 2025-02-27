public class exo5 {
    public static void main(String[] args) throws Exception {

        // Variable 
            String part1 = " Prix initial : ";
            String part2 = " Réduction de ";
            String part3 = " Prix après réduction : ";
            String part4 = " % : "; 

            double prixInitial = 19.90;
            double pourcentageReduction = 20.0;
    
            double reduction = (pourcentageReduction / 100) * prixInitial;
    
            double prixApresReduction = prixInitial - reduction;
    
            String phrase1 = (part1 + "" + prixInitial + "");
            String phrase2 = (part2 + "" + pourcentageReduction + "" + part4 + "" + reduction );
            String phrase3 = (part3 + "" + prixApresReduction + "");

            System.out.println(phrase1);
            System.out.println(phrase2);
            System.out.println(phrase3);
}
}
