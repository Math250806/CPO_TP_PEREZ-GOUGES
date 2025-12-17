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
    
    private CelluleLumineuse[][] matriceCellules;
    private int taille;

    /**
     * Constructeur : crée une grille taille x taille de cellules éteintes.
     *
     * @param taille taille de la grille
     */
    public GrilleDeCellules(int taille) {
        this.taille = taille;
        matriceCellules = new CelluleLumineuse[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Active (inverse) toutes les cellules d'une ligne.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < taille; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     * Active (inverse) toutes les cellules d'une colonne.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < taille; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     * Active la diagonale descendante (↘).
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < taille; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * Active la diagonale montante (↗).
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < taille; i++) {
            matriceCellules[i][taille - 1 - i].activerCellule();
        }
    }

    /**
     * Active aléatoirement une ligne, une colonne ou une diagonale.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(4);

        switch (choix) {
            case 0 -> activerLigneDeCellules(rand.nextInt(taille));
            case 1 -> activerColonneDeCellules(rand.nextInt(taille));
            case 2 -> activerDiagonaleDescendante();
            case 3 -> activerDiagonaleMontante();
        }
    }

    /**
     * Mélange la grille en appliquant plusieurs activations aléatoires.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     * @return true si toutes les cellules sont éteintes
     */
    public boolean estEteinte() {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Affichage texte de la grille.
     */
    @Override
    public String toString() {
        String resultat = "";
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                resultat += matriceCellules[i][j] + " ";
            }
            resultat += "\n";
        }
        return resultat;
    }
    
}
