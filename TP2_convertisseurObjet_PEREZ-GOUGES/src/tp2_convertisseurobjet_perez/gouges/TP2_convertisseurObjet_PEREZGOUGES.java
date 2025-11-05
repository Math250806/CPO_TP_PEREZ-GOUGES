/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_perez.gouges;

import java.util.Scanner;

public class TP2_convertisseurObjet_PEREZGOUGES {

    public static void main(String[] args) {

        Convertisseur conv = new Convertisseur();
        Scanner sc = new Scanner(System.in);

        int choix = -1;
        double temp, resultat;

        while (choix != 0) {
            System.out.println("\nMENU CONVERTISSEUR");
            System.out.println("1. Celsius -> Kelvin");
            System.out.println("2. Kelvin -> Celsius");
            System.out.println("3. Fahrenheit -> Celsius");
            System.out.println("4. Celsius -> Fahrenheit");
            System.out.println("5. Fahrenheit -> Kelvin");
            System.out.println("6. Kelvin -> Fahrenheit");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            if (choix == 0) {
                System.out.println("Merci d'avoir utilisé le convertisseur !");
            } else if (choix >= 1 && choix <= 6) {
                System.out.print("Entrez la température : ");
                temp = sc.nextDouble();

                if (choix == 1) resultat = conv.CelciusVersKelvin(temp);
                else if (choix == 2) resultat = conv.KelvinVersCelcius(temp);
                else if (choix == 3) resultat = conv.FarenheitVersCelcius(temp);
                else if (choix == 4) resultat = conv.CelciusVersFarenheit(temp);
                else if (choix == 5) resultat = conv.FarenheitVersKelvin(temp);
                else resultat = conv.KelvinVersFarenheit(temp);

                System.out.println("Résultat = " + resultat);
                System.out.println(conv);
            } else {
                System.out.println("Choix invalide.");
            }
        }

        sc.close();
    }
}