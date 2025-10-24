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
    
    int n = generateurAleat.nextInt(101);
    int tentatives = 0;
    
    System.out.println("Saisisez un nombre entre 0 et 100");
    int nombre = sc.nextInt();  
    
    tentatives ++;
    while (nombre != n) {
    
        if (nombre > n) {
            System.out.println("Vous etes grand 😱  ");
        } else if (nombre < n) {
            System.out.println("Vous etes petit 😱");
        }
        System.out.println("Essaye encore 😓");
        nombre = sc.nextInt();
        tentatives++;
        }
    System.out.println("T'as gagné 😱🎉👹, tu as mis "+ tentatives + " essais");
    sc.close();
    }
} 
