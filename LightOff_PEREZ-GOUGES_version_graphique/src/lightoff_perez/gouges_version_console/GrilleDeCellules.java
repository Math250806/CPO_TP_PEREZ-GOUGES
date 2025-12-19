/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_perez.gouges_version_console;

/**
 *
 * @author mathis
 */

import java.util.Random;

public class GrilleDeCellules {

    private GrilleDeCellules grille;

    public GrilleDeJeu(int taille) {
        grille = new GrilleDeCellules(taille);
    }

    /**
     * Active toutes les cellules d'une ligne donnée.
     */
    public void activerLigneDeCellules(int idLigne) {
        grille.activerLigneDeCellules(idLigne);
    }

    /**
     * Active toutes les cellules d'une colonne donnée.
     */
    public void activerColonneDeCellules(int idColonne) {
        grille.activerColonneDeCellules(idColonne);
    }

    /**
     * Active la diagonale descendante (du coin supérieur gauche au coin inférieur droit).
     */
    public void activerDiagonaleDescendante() {
        grille.activerDiagonaleDescendante();
    }

    /**
     * Active la diagonale montante (du coin inférieur gauche au coin supérieur droit).
     */
    public void activerDiagonaleMontante() {
        grille.activerDiagonaleMontante();
    }

    /**
     * Clique sur une cellule et inverse son état.
     */
    public void cliquerCellule(int ligne, int colonne) {
        grille.getMatriceCellules()[ligne][colonne].changerEtat();
    }

    /**
     * Active aléatoirement une ligne, une colonne ou une diagonale.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        grille.activerLigneColonneOuDiagonaleAleatoire();
    }

    /**
     * Mélange la grille en appliquant plusieurs activations aléatoires.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        grille.melangerMatriceAleatoirement(nbTours);
    }

    /**
     * Vérifie si toutes les cellules sont éteintes.
     */
    public boolean estEteinte() {
        return grille.estEteinte();
    }

    /**
     * Retourne la taille de la grille.
     */
    public int getTaille() {
        return grille.getTaille();
    }

    /**
     * Retourne la matrice de cellules.
     */
    public CelluleLumineuse[][] getMatriceCellules() {
        return grille.getMatriceCellules();
    }

    /**
     * Affichage texte de la grille.
     */
    @Override
    public String toString() {
        return grille.toString();
    }
}