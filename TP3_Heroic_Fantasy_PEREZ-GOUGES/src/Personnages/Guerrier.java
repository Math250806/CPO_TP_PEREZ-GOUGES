/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Epee;

/**
 *
 * @author mathis
 */
public class Guerrier extends Personnage {

    private boolean aCheval;

    // Compteur statique pour les guerriers
    public static int nbGuerriers = 0;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        nbGuerriers++;
    }

    public void setaCheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    public boolean isaCheval() {
        return aCheval;
    }

    @Override
    public String toString() {
        return super.toString() + ", Guerrier à cheval : " + aCheval;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        nbGuerriers--;
        System.out.println(nom + " le guerrier a été détruit. NbGuerriers = " + nbGuerriers);
    }

    @Override
    public void attaquer(Personnage cible) {
        if (armeEnMain == null) {
            System.out.println(nom + " n'a pas d'arme et ne peut pas attaquer !");
            return;
        }

        int degats = armeEnMain.getNiveauAttaque();

        // Si c'est une épée, on multiplie par la finesse
        if (armeEnMain instanceof Epee) {
            degats *= ((Epee)armeEnMain).getFinesse();
        }

        // Si le guerrier est à cheval, dégâts divisés par 2
        if (this.isaCheval()) {
            degats /= 2;
        }

        // Le guerrier se fatigue
        this.seFatiguer();

        // Inflige les dégâts
        cible.estAttaque(degats);

        System.out.println(nom + " attaque " + cible.getNom() + " avec " + armeEnMain.getNom() 
                           + " pour " + degats + " points de dégâts !");
    }
}