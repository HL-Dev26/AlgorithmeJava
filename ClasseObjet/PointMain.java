public class PointMain {
    public static void main(String[] args) {


         /* Instantiation d'un objet Point avec les valeurs spécifiques */


        Point a = new Point(15,26);
        System.out.println(a);

        a.deplacer(3,5);
        System.out.println("deplacement " + a);

        a.symetrieX();
        System.out.println("Symétrie de l'axe des abscisses " + a);

        a.symetrieY();
        System.out.println("Symétrie de l'axe des ordonnées " + a);

        a.symetrieOrigine();
        System.out.println("Symétrie par rapport au point d'origine " + a);
        
        a.permuter();
        System.out.println("Permuter les coordonnées " + a);


    }
}