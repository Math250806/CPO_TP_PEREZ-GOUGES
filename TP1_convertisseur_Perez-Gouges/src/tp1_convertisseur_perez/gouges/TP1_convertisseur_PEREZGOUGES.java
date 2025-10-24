/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_PEREZ.GOUGES;

import java.util.Scanner;

/**
 *
 * @author mathis
 */
public class TP1_convertisseur_PEREZGOUGES{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Saisissez une valeur en degrés Celsius : ");
        double valeur = sc.nextDouble();
       
        System.out.println("Saisir la conversion qu'il faut faire :");
        System.out.println("1｜1 C a K");
        System.out.println("2｜K a C");
        System.out.println("3｜F a C");
        System.out.println("4｜C a F");
        System.out.println("5｜K a F");
        System.out.println("6｜F a K");
        
        int choix = sc.nextInt();
        double resultat;
        
        if (choix == 1){
            resultat = CelciusVersKelvin(valeur);
            System.out.println(valeur + " °C = " + resultat + " K");
        } 
        else if (choix == 2){
            resultat = KelvinVersCelcius(valeur);
            System.out.println(valeur + " K = " + resultat + " °C");        
        } 
        else if (choix == 3) {
            resultat = FarenheitVersCelcius(valeur);
            System.out.println(valeur + " °F = " + resultat + " °C");
        } 
        else if (choix == 4) {
            resultat = CelciusVersFarenheit(valeur);
            System.out.println(valeur + " °C = " + resultat + " °F");
        } 
        else if (choix == 5) {
            resultat = KelvinVersFarenheit(valeur);
            System.out.println(valeur + " K = " + resultat + " °F");
        } 
        else if (choix == 6) {
            resultat = FarenheitVersKelvin(valeur);
            System.out.println(valeur + " °F = " + resultat + " K");
        } 
        else {
            System.out.println("Choix invalide !");
        }

        sc.close();
    }


    public static double CelciusVersKelvin(double tC) { return tC + 273.15; }
    public static double KelvinVersCelcius(double tK) { return tK - 273.15; }
    public static double FarenheitVersCelcius(double tF) { return (tF - 32) * 5 / 9; }
    public static double CelciusVersFarenheit(double tC) { return tC * 9 / 5 + 32; }
    public static double KelvinVersFarenheit(double tK) { return CelciusVersFarenheit(KelvinVersCelcius(tK)); }
    public static double FarenheitVersKelvin(double tF) { return CelciusVersKelvin(FarenheitVersCelcius(tF)); }
}