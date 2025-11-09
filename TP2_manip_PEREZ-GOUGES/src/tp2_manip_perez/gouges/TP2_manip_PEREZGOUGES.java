/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_perez.gouges;

/**
 *
 * @author mathis
 */
public class TP2_manip_PEREZGOUGES {

    public static void main(String[] args) {
        
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        
        Tartiflette assiette3 = assiette2;
        assiette2.nbCalories += 50;
                
    
        System.out.println("Avant échange :");
        System.out.println("assiette1 : " + assiette1.nbCalories);
        System.out.println("assiette2 : " + assiette2.nbCalories);

        // échange 
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

    
        System.out.println("\nAprès échange :");
        System.out.println("assiette1 : " + assiette1.nbCalories);
        System.out.println("assiette2 : " + assiette2.nbCalories);
        
        // Déclaration d'un tableau de 10 références de Moussaka
        Moussaka[] tableauMoussakas = new Moussaka[10];

        // Création d'un objet Moussaka pour chaque référence
        for (int i = 0; i < 10; i++) {
            tableauMoussakas[i] = new Moussaka(500); 
        }

        System.out.println("\nTableau de Moussakas :");
        for (int i = 0; i < 10; i++) {
            System.out.println("Moussaka " + i + " : " + tableauMoussakas[i].nbCalories + " calories");
        }
    }
}