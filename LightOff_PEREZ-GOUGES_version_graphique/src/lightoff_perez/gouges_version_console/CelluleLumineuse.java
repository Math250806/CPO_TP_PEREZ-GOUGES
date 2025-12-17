package lightoff_perez.gouges_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mathis
 */
public class CelluleLumineuse {
    
    /**
     * État de la cellule : true = allumée, false = éteinte
     */
    private boolean etat;

    /**
     * Constructeur par défaut.
     * La cellule est initialement éteinte.
     */
    public CelluleLumineuse() {
        this.etat = false;
    }

    /**
     * Active la cellule en inversant son état.
     */
    public void activerCellule() {
        etat = !etat;
    }

    /**
     * Éteint la cellule.
     */
    public void eteindreCellule() {
        etat = false;
    }

    /**
     * Vérifie si la cellule est éteinte.
     *
     * @return true si la cellule est éteinte
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     * Renvoie l'état de la cellule.
     *
     * @return true si allumée, false si éteinte
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Représentation textuelle de la cellule.
     *
     * @return "X" si allumée, "O" si éteinte
     */
    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}
