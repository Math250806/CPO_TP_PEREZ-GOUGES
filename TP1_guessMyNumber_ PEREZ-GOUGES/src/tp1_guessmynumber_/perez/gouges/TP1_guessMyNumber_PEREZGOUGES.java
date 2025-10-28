/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_.perez.gouges;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mathis
 */
public class TP1_guessMyNumber_PEREZGOUGES {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random generateurAleat = new Random();
    
    System.out.println("Choissisez une difficuluté : \n 1 : facile \n 2 : moyen \n 3 : difficile");
    int choix = sc.nextInt();  
        
    int max = 100;
    int essaisMax = 0;
    
    if (choix == 1) {
        max = 50;
        System.out.println("Mode faicle : le nombre a deviner se situe entre 0 et 50 ");
            
    } else if (choix == 3) {
        max = 200;
        essaisMax = 10;
        System.out.println("Mode difficile : le nombre a deviner se situe entre 0 et 200 avec 10 essais au total pour le deviner"); 
    } else {
        System.out.println("Mode moyen : le nombre a deviner se situe entre 0 et 100");
    }
    
    int n = generateurAleat.nextInt(max + 1);
    int tentatives = 0;
    
    System.out.println("Saisir un nombre entre 0 et " + max);
    int nombre = sc.nextInt();
    tentatives ++;
    while (nombre != n && (essaisMax ==0 || tentatives < essaisMax)) {
        if (nombre > n) {
            System.out.println("Trop grand 😱");
        } else {
            System.out.println("Trop petit 😱");
        }
        System.out.println("Essaye encore 😶");
        nombre = sc.nextInt();
        tentatives ++;
    }
    if (nombre == n){
        System.out.println("tu as gagné 😱🏆, tu as mis " + tentatives + " esssais pour gagner ");
    } else {
        System.out.println("Tu as perdu 😭, le nombre a deviner etait " + n);
    }
    sc.close();
    }
} 
