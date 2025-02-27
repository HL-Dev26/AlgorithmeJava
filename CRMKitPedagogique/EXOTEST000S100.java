//import java.util.Arrays;
//import java.util.Scanner;

public class EXOTEST000S100 {
            /*
            Programme à réaliser :    [Réception d'un message électronique] 
 
            Lorsqu’un email est réceptionné par un serveur de messagerie, quelques vérifications sont nécessaires avant que l’email soit transmis à son destinataire final.  
 
            Il est indispensable de contrôler que l’adresse email du destinataire existe et que la boite de réception du destinataire dispose de suffisamment d’espace disponible.
            Une analyse antivirus est systématiquement faite sur les pièces jointes (le serveur n’accepte que les pièces jointes inférieures à 25Mo).  
 
            Si toutes les contrôles sont satisfaisants, l’email est transmis au destinataire.  
 
            Le destinataire a peut-être activé un message d’absence (réponse automatique). Si tel est le cas, celui-ci est transmis à l’expéditeur. 
            */
    public static void main(String[] args) {
        /* VARIABLES */
       boolean email;
       boolean Boitereception;
       double Piecejointe;
       boolean antivirus;
       boolean reponseauto;
       
        /* TRAITEMENT */
        System.out.println(" Réception d'un message électroniques ");

        email = true;
        Boitereception = true;
        Piecejointe = 25000;
        antivirus = true;
        reponseauto = true;

        if (email) {      
        }
        else{
            System.out.println(" L'email est invalide ");
            return;
        }
        if (Boitereception) { 
        }
        else{
            System.out.println(" La boite de réception est pleine ");
            return;  

        }
        if (Piecejointe <= 25000 && antivirus) {
        }
        else{
            System.out.println(" La pièce jointe et trops lourde ou contient un virus ");
            return;
        }

        /* AFFICHAGE RESULTAT */
        System.out.println(" l’email est transmis au destinataire ");
        if (reponseauto) {
            System.out.println(" le destinataire est absent ");
        }
    }

}
