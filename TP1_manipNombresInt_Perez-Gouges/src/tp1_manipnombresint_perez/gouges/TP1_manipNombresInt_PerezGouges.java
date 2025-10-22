/**/
package tp1_manipnombresint_perez.gouges;

import java.util.Scanner;

/**
 *
 * @author mathis
 */
public class TP1_manipNombresInt_PerezGouges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // Saisie de 2 entiers
        System.out.print("Entrez le premier entier : ");
        int nombre1 = sc.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int nombre2 = sc.nextInt();

        System.out.println("\nVous avez saisi : " + nombre1 + " et " + nombre2);

        // Calculs
        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1 * nombre2;

        
        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence (premier - deuxième) est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);

        if (nombre2 != 0) {
            int quotient = nombre1 / nombre2;
            int reste = nombre1 % nombre2;
            System.out.println("Le quotient entier de " + nombre1 + " / " + nombre2 + " est : " + quotient);
            System.out.println("Le reste de la division euclidienne est : " + reste);
        } else {
            System.out.println("La division par zéro est impossible !");
        }
    }
}
