/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_.perez.gouges;

public class Personne {

    String nom;
    String prenom;
    Voiture[] liste_voitures;   // tableau de 3 voitures max
    int nbVoitures ;

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
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
    
    // 1. Vérifier si la voiture a déjà un propriétaire
    if (voiture_a_ajouter.proprietaire != null) {
        System.out.println("⚠ Impossible : la voiture appartient déjà à "
                           + voiture_a_ajouter.proprietaire.prenom);
        return false;
    }

    // 2. Vérifier si la personne a déjà 3 voitures
    if (nbVoitures >= 3) {
        System.out.println("⚠ Impossible : " + prenom + " possède déjà 3 voitures");
        return false;
    }

    // 3. Ajout dans la bonne case
    liste_voitures[nbVoitures] = voiture_a_ajouter;

    // 4. Met à jour le nombre de voitures
    nbVoitures++;

    // 5. On indique à la voiture qu’elle appartient maintenant à CETTE personne
    voiture_a_ajouter.proprietaire = this;

    // 6. Succès
    return true;
}
}
