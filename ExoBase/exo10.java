public class exo10 {
    public static void main(String[] args) {
       
        int nb = 11101;
        int dec = 0;
 
        int length = String.valueOf(nb).length()-1;
        // String.valueOf(nb)length.()    :  représente une valeur     donc, on veut cette valeur - 1
 
        while (length > 0) {
            int puiss = (int)Math.pow(10, length);
            // j'ai mis (int) devant math pck math pow donne en double et moi j'ai besoin d'un entier
            int rang = nb / puiss;
            dec = dec + rang * (int)Math.pow(2, length);
            nb = nb - rang * puiss;
            length = length - 1;
            // vu que le premier chiffre est supprimé, on a réduit le nombre de chiffre et ça permet de faire tourner la boucle        
        }
 
        String str = Integer.toHexString(dec);
 
    System.out.println();
    System.out.println(str);
 
    }
   
}
