/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_perez.gouges_version_console;

/**
 *
 * @author mathis
 */
import javax.swing.JButton;
import java.awt.Graphics;
import lightoff_perez.gouges_version_console.CelluleLumineuse;

public class CelluleGraphique extends JButton {
    
    private int largeur;
    private int hauteur;
    private CelluleLumineuse celluleLumineuseAssociee;

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l, int h) {
        this.largeur = l;
        this.hauteur = h;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setText(celluleLumineuseAssociee.toString());
    } 
}
