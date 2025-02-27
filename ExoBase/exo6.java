public class exo6 {
    public static void main(String[] args) throws Exception {
        
        String part1 = " Heures ";
        String part2 = " Minutes ";
        String part3 = " Secondes ";

        int totalSeconds = 5624;
    

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        String phrase = (totalSeconds + part3 + "" + hours + part1 + "" + minutes + part2 + "" + seconds + part3 + "");

       System.out.println(phrase);
    }
}
