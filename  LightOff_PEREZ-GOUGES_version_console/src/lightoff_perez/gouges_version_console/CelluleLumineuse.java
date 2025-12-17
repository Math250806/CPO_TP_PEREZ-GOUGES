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
    
    private boolean allumee;

    /**
     * Constructeur : la cellule est éteinte par défaut.
     */
    public CelluleLumineuse() {
        this.allumee = false;
    }

    /**
     * @return true si la cellule est allumée
     */
    public boolean estAllumee() {
        return allumee;
    }

    /**
     * @return true si la cellule est éteinte
     */
    public boolean estEteinte() {
        return !allumee;
    }

    /**
     * Allume la cellule.
     */
    public void allumer() {
        allumee = true;
    }

    /**
     * Éteint la cellule.
     */
    public void eteindre() {
        allumee = false;
    }

    /**
     * Inverse l'état de la cellule.
     */
    public void changerEtat() {
        allumee = !allumee;
    }

    /**
     * @return représentation texte de la cellule
     */
    @Override
    public String toString() {
        return allumee ? "O" : ".";
    }
    
}
