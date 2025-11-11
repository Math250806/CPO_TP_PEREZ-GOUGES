/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_.perez.gouges;

public class Personne {

    String nom;
    String prenom;
    Voiture[] liste_voitures;   // tableau de 3 voitures max
    int nbVoitures;             // combien sont réellement utilisées
    int nbVoitures ;
    Voiture [] liste_voitures ;

    public Personne(String unNom, String unPrenom) {
        this.nom = unNom;
        this.prenom = unPrenom;
        this.liste_voitures = new Voiture[3]; // réservation mémoire ✅
        this.nbVoitures = 0;
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " possède " + nbVoitures + " voiture(s)";
    }
}