/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_perez.gouges;

import java.util.Scanner;

/**
 *
 * @author mathis
 */
public class TP1_convertisseur_PerezGouges {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Saisissez une valeur en degrés Celsius : ");
        double tC = sc.nextDouble();
       
        System.out.println(tC + " °C = " + CelciusVersFarenheit(tC) + " °F");

        double tK = CelciusVersKelvin(tC);
        System.out.println(tK + " K = " + KelvinVersCelcius(tK) + " °C");
        System.out.println(tK + " K = " + KelvinVersFarenheit(tK) + " °F");

        double tF = CelciusVersFarenheit(tC);
        System.out.println(tF + " °F = " + FarenheitVersCelcius(tF) + " °C");
        System.out.println(tF + " °F = " + FarenheitVersKelvin(tF) + " K");

        sc.close();
    }

    public static double CelciusVersKelvin(double tC) { return tC + 273.15; }
    public static double KelvinVersCelcius(double tK) { return tK - 273.15; }
    public static double FarenheitVersCelcius(double tF) { return (tF - 32) * 5 / 9; }
    public static double CelciusVersFarenheit(double tC) { return tC * 9 / 5 + 32; }
    public static double KelvinVersFarenheit(double tK) { return CelciusVersFarenheit(KelvinVersCelcius(tK)); }
    public static double FarenheitVersKelvin(double tF) { return CelciusVersKelvin(FarenheitVersCelcius(tF)); }
}