public class exo7 {
    public static void main(String[] args) throws Exception {
        
        String part1 = " Année ";
        String part2 = " Mois ";
        String part3 = " Jour ";
        String part4 = " = ";

        int totalDays = 365;

        int years = totalDays / 365;
        int rest = totalDays % 365;
        int months = rest / 30;
        int days = rest % 30;

        String phrase = (totalDays + part3 + "" + part4 + "" + years + part1 + "" + months + part2 + "" + days + part3 + "");

       System.out.println(phrase);
    }
}