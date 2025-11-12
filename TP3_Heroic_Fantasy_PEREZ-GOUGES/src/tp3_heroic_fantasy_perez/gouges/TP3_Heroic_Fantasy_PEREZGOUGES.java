/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_perez.gouges;

/**
 *
 * @author mathis
 */
public class TP3_Heroic_Fantasy_PEREZGOUGES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création de quelques armes
        Epee epeeExcalibur = new Epee("Excalibur", 80);
        Baton batonMerlin = new Baton("Bâton de Merlin", 70);

        // Affichage des armes
        System.out.println(epeeExcalibur); // Appelle automatiquement toString()
        System.out.println(batonMerlin);

        // Accès aux informations séparément
        System.out.println("Nom de l'épée : " + epeeExcalibur.getNom());
        System.out.println("Niveau d'attaque du bâton : " + batonMerlin.getNiveauAttaque());
    }
}
 