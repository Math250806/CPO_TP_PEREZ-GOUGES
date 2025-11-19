/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author mathis
 */
import Armes.Arme;
import java.util.ArrayList;
import tp3_heroic_fantasy_perez.gouges.EtreVivant;


public abstract class Personnage implements EtreVivant {
    
    protected String nom;
    protected int niveauVie;

    // Nouveaux attributs pour la gestion des armes
    protected ArrayList<Arme> inventaire;  // jusqu'à 5 armes
    protected Arme armeEnMain; // arme actuellement portée
    
// ---------- NOUVEAU : compteur statique ----------
    public static int nbPersonnages = 0;   // partagé par tous les personnages

    // Constructeur
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaire = new ArrayList<>();
        this.armeEnMain = null;

        // Incrémentation du compteur
        nbPersonnages++;
    }

    // Accesseurs
    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }
    
    public int getNbArmes() {
    return inventaire.size();
    }

    // Gestion de l'inventaire

    // Ajouter une arme
    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
            System.out.println(a.getNom() + " ajouté(e) à l'inventaire de " + nom);
        } else {
            System.out.println(nom + " a déjà 5 armes, impossible d'ajouter " + a.getNom());
        }
    }

    // Équiper une arme par son nom
    public void equiperArme(String nomArme) {
        for (Arme a : inventaire) {
            if (a.getNom().equals(nomArme)) {
                armeEnMain = a;
                System.out.println(nom + " équipe " + a.getNom() + " avec succès !");
                return;
            }
        }
        System.out.println(nom + " ne possède pas l'arme " + nomArme + " dans son inventaire.");
    }
    // Méthodes de l'interface EtreVivant
    @Override
    public void seFatiguer() {
        this.niveauVie -= 10; // la fatigue fait perdre 10 points de vie
        if (this.niveauVie < 0) this.niveauVie = 0; // ne pas descendre sous zéro
        System.out.println(nom + " est fatigué et perd 10 points de vie. Niveau actuel : " + niveauVie);
    }

    @Override
    public boolean estVivant() {
        return this.niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        this.niveauVie -= points;
        if (this.niveauVie < 0) this.niveauVie = 0;
        System.out.println(nom + " subit " + points + " points de dégâts. Niveau de vie actuel : " + niveauVie);
    }

    // toString modifié pour inclure l'arme en main
    @Override
    public String toString() {
        String s = "Personnage : " + nom + ", niveau de vie = " + niveauVie;
        if (armeEnMain != null) {
            s += ", Arme en main : " + armeEnMain;
        } else {
            s += ", Arme en main : aucune";
        }
        return s;
    }
    @Override
    protected void finalize() throws Throwable {
    super.finalize(); // toujours appeler super.finalize()
    nbPersonnages--;   // décrémente le compteur statique
    System.out.println(nom + " a été détruit. NbPersonnages = " + nbPersonnages);
}
}