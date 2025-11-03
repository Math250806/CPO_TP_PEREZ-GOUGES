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

        // Création de quelques bières
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Chimay Bleue", 9.0, "Abbaye de Scourmont");

        // Décapsulage
        uneBiere.decapsuler();       // passe ouverte = true
        secondeBiere.decapsuler();   // passe ouverte = true
        troisiemeBiere.decapsuler(); // passe ouverte = true
        troisiemeBiere.decapsuler(); // affichera "Erreur : bière déjà ouverte"

        // Affichage avec toString()
        System.out.println(uneBiere);
        System.out.println(secondeBiere);
        System.out.println(troisiemeBiere);
    }
   }
