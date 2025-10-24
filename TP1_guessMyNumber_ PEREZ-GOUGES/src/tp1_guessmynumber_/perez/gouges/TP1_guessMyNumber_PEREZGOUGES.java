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

    Random generateurAleat = new Random(100);
    int n = generateurAleat.nextInt(100);
    System.out.println("Saisisez un nombre entre 0 et 100");
    int nombre = sc.nextInt();  
    
    while (nombre != n) {
    
        if (nombre > n) {
            System.out.println("Vous etes haut 😱");
        } 
    else if (nombre < n) {
            System.out.println("Vous etes bas 😱");
        } 
    else {
            System.out.println("Vous avez gagné 😱")
        }
    }
    }    
}
