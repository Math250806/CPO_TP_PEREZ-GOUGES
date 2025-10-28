/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_perez.gouges;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mathis
 */
public class TP1_stats_PEREZGOUGES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        Random generateur = new Random();

        // Tableau : 6 faces du dé
        int[] des = new int[6];

        // Nombre de lancers
        System.out.println("Combien de fois veux-tu lancer le dé ?");
        int m = sc.nextInt();

        // Simulation des lancers
        for (int i = 0; i < m; i++) {
            int tirage = generateur.nextInt(6); 
            des[tirage]++; 
        }

        //Résultats en %
        System.out.println("Résultats des lancers en pourcentages :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = ((double) des[i] / m) * 100; 
            System.out.println("Face " + (i + 1) + " : " + pourcentage + " %");
        }

        sc.close();
    }
}
