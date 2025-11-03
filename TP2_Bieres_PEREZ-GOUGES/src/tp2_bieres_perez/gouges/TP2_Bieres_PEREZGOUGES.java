/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_perez.gouges;

/**
 *
 * @author mathis
 */
public class TP2_Bieres_PEREZGOUGES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Création d'une bière avec le constructeur 3 paramètres
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();

        // Création d'une seconde bière
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        secondeBiere.lireEtiquette();
    }
}
}
