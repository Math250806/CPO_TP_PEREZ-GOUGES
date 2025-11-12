/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_perez.gouges;

/**
 *
 * @author mathis
 */
public abstract class Arme {
    private String nom;
    private int niveauAttaque;

    // Constructeur pour initialiser le nom et le niveau d'attaque
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if(niveauAttaque < 0) niveauAttaque = 0;
        if(niveauAttaque > 100) niveauAttaque = 100;
        this.niveauAttaque = niveauAttaque;
    }

    // Getter pour le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Redéfinition de la méthode toString pour afficher nom et niveau
    @Override
    public String toString() {
        return nom + " (Niveau d'attaque : " + niveauAttaque + ")";
    }
}

// Classe Epee qui hérite de Arme
public class Epee extends Arme {
    public Epee(String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
    }
}

// Classe Baton qui hérite de Arme
public class Baton extends Arme {
    public Baton(String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
    }
}