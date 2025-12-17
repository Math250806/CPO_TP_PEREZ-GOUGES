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

public class GrilleDeJeu {
    
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     * Constructeur de la grille.
     *
     * @param p_nbLignes nombre de lignes
     * @param p_nbColonnes nombre de colonnes
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;

        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Éteint toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * Active toutes les cellules d'une ligne.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     * Active toutes les cellules d'une colonne.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     * Active la diagonale descendante.
     */
    public void activerDiagonaleDescendante() {
        int taille = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < taille; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * Active la diagonale montante.
     */
    public void activerDiagonaleMontante() {
        int taille = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < taille; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    /**
     * Active aléatoirement une ligne, une colonne ou une diagonale.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(4);

        switch (choix) {
            case 0 -> activerLigneDeCellules(rand.nextInt(nbLignes));
            case 1 -> activerColonneDeCellules(rand.nextInt(nbColonnes));
            case 2 -> activerDiagonaleDescendante();
            case 3 -> activerDiagonaleMontante();
        }
    }

    /**
     * Mélange la grille de manière aléatoire.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     * Vérifie si toutes les cellules sont éteintes.
     *
     * @return true si toutes éteintes
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Affichage textuel de la grille.
     */
    @Override
    public String toString() {
        String resultat = "    ";
        for (int j = 0; j < nbColonnes; j++) {
            resultat += "| " + j + " ";
        }
        resultat += "|\n";

        for (int i = 0; i < nbLignes; i++) {
            resultat += "----".repeat(nbColonnes + 1) + "\n";
            resultat += i + "   ";
            for (int j = 0; j < nbColonnes; j++) {
                resultat += "| " + matriceCellules[i][j] + " ";
            }
            resultat += "|\n";
        }
        resultat += "----".repeat(nbColonnes + 1) + "\n";
        return resultat;
    }
    
    public CelluleLumineuse[][] getMatriceCellules() {
    return matriceCellules;
}
    
}
