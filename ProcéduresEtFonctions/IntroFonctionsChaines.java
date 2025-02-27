   public class IntroFonctionsChaines {
        /*Exercice 5.2 : Les chaines de caractère

        Créer un projet “IntroFonctionsChaines”.
        Implémenter les 4 fonctions demandées ci-dessous.
        Appeler ces 4 fonctions depuis le main.
        Afficher les différents résultats à l’aide d’une procédure.

        Créer une fonction « getMC2 ».

        Cette fonction doit retourner Le nom de l’inventeur de la formule « E = MC² ».

        Créer une fonction « getUserName » qui accepte deux arguments (prénom et nom) de type string.

        Cette fonction doit retourner la concaténation des deux valeurs.
        Exemple : IntroFonctionsChaines.getUserName ('mickaël', 'devoldère'); // retourne « mickaëldevoldère »

        Créer une fonction « getFullName » acceptant deux arguments (nom et prénom) de type string.

        Cette fonction doit retourner la concaténation des deux valeurs avec un espace entre les 2.
        Assurez vous que :
        Le prénom doit être en minuscule (sauf la 1ère lettre qui doit être en MAJUSCULE).
        Le nom doit être en MAJUSCULE.
        Exemple : getFullName ('devoldère', 'mickaël'); // retourne « Mickaël DEVOLDÈRE »

        Créer une fonction « askUser » acceptant deux arguments (nom et prénom) de type string.

        Cette fonction doit retourner une chaîne de caractères sous la forme :
        « Bonjour Prénom NOM. Connaissez-vous Einstein ? »
        Cette fonction doit obligatoirement appeler et utiliser les résulats des fonctions précédentes :
        « getFullName() » pour obtenir la concaténation du prénom et du nom.
        « getMC2() » pour obtenir le nom de l’inventeur de la formule E = MC².
        Exemple : askUser ('devoldère', 'mickaël'); // retourne « Bonjour Mickaël DEVOLDÈRE, connaissez-vous Einstein ? »*/
        public static void main(String[] args) {

        String inventeur = getMC2();
        String prenomN = getUserName("mickaël", "devoldère");
        String nomP = getFullName("devoldère", "mickaël");
        String maj = askUser("devoldère", "mickaël");
        
        System.out.println("Inventeur de la formule E = MC² : " + inventeur);
        System.out.println("Nom d'utilisateur : " + prenomN);
        System.out.println("Nom complet : " + nomP);
        System.out.println("Message de bienvenue : " + maj);
        }
        public static String getMC2() {
            return "Einstein";
        }
        public static String getUserName(String prenom, String nom) {
            return prenom + nom;
        }
        public static String getFullName(String nom, String prenom) {
        nom = nom.toUpperCase();    
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
            return nom + " " + prenom;
        }
        public static String askUser(String nom, String prenom) {
            String inventeur = getMC2();
                        return "Bonjour " + prenom + ", connaissez-vous " + inventeur + " ?";       
    }
}
