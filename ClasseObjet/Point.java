public class Point {
    
    private double x;
    private double y;

    // Constructeur par défaut
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructeur Classique
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Représentation du point
    public String toString() {
        return "Point(" + "x=" + this.x + ", y=" + this.y + ')';
    }
    // Déplacer le point
    public void deplacer(double NewX, double NewY) {
        this.x = NewX;
        this.y = NewY;
    }
    // Symétrie de l'axe des abscisses
    public void symetrieX() {
        this.y *= -1;
    }
    // Symétrie de l'axe des ordonnées
    public void symetrieY() {
        this.x *= -1;
    }

    // Symétrie par rapport au point d'origine
    public void symetrieOrigine() {
        this.symetrieX();
        this.symetrieY();
    }

    // Permuter les coordonnées
    public void permuter() {
        double temp = this.x;
        this.x = this.y;
        this.y = temp;
    }
}