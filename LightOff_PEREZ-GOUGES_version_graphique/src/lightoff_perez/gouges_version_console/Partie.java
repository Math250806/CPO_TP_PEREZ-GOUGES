/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_perez.gouges_version_console;

/**
 *
 * @author mathis
 */
import java.util.Scanner;

public class Partie {
    
    private GrilleDeCellules grille;
    private int nombreCoups;

    /**
     * Initialise la partie.
     */
    public void initialiserPartie() {
        grille = new GrilleDeCellules(5);
        grille.melangerMatriceAleatoirement(10);
        nombreCoups = 0;
    }

    /**
     * Lance la partie en mode console.
     */
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);

        while (!grille.estEteinte()) {
            System.out.println(grille);
            System.out.println("Coups joués : " + nombreCoups);
            System.out.println("Choix :");
            System.out.println("1 - Ligne");
            System.out.println("2 - Colonne");
            System.out.println("3 - Diagonale descendante");
            System.out.println("4 - Diagonale montante");

            int choix = sc.nextInt();

            switch (choix) {
                case 1 -> {
                    System.out.print("Numéro de ligne (0 à 4) : ");
                    grille.activerLigneDeCellules(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Numéro de colonne (0 à 4) : ");
                    grille.activerColonneDeCellules(sc.nextInt());
                }
                case 3 -> grille.activerDiagonaleDescendante();
                case 4 -> grille.activerDiagonaleMontante();
                default -> System.out.println("Choix invalide");
            }

            nombreCoups++;
        }

        System.out.println(grille);
        System.out.println("🎉 Bravo ! Grille éteinte en " + nombreCoups + " coups.");
    }
    
}
