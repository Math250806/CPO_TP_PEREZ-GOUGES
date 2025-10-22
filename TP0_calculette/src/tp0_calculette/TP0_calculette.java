/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

/**
 *
 * @author mathis
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    System.out.println("Please enter the operator: \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
    System.out.print("Enter a number corresponding to the operator: ");
        int operateur = sc.nextInt();

        // 3. Saisie des deux opérandes
        System.out.print("Enter the first number: ");
        int operande1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int operande2 = sc.nextInt();
        
        
    if (operateur == 1) { // addition
        System.out.println("Result: " + (operande1 + operande2));
    } else if (operateur == 2) { // soustraction
        System.out.println("Result: " + (operande1 - operande2));
    } else if (operateur == 3) { // multiplication
        System.out.println("Result: " + (operande1 * operande2));
    } else if (operateur == 4) { // division
        if (operande2 != 0) {
            System.out.println("Result: " + ((double) operande1 / operande2));
        } else {
            System.out.println("Error: Division by zero!");
        }
    } else if (operateur == 5) { // modulo
        if (operande2 != 0) {
            System.out.println("Result: " + (operande1 % operande2));
        } else {
            System.out.println("Error: Modulo by zero!");
        }
    } else {
        System.out.println("Error: Invalid operator selection!");
}
}
