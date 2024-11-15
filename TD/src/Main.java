public class Main {
    public static void main(String[] args) {
        GestionEnseignant gestionHashSet = new EspritHashSet();
        GestionEnseignant gestionTreeSet = new EspritTreeSet();

        Enseignant e1 = new Enseignant(1, "Dupont", "Jean");
        Enseignant e2 = new Enseignant(2, "Durand", "Sophie");
        Enseignant e3 = new Enseignant(3, "Martin", "Luc");

        System.out.println("----- Test EspritHashSet -----");
        gestionHashSet.ajouterEnseignant(e1);
        gestionHashSet.ajouterEnseignant(e2);
        gestionHashSet.displayEnseignants();
        System.out.println("Recherche ID 1 : " + gestionHashSet.rechercherEnseignant(1));
        gestionHashSet.supprimerEnseignant(e1);
        gestionHashSet.displayEnseignants();

        System.out.println("\n----- Test EspritTreeSet -----");
        gestionTreeSet.ajouterEnseignant(e2);
        gestionTreeSet.ajouterEnseignant(e3);
        gestionTreeSet.displayEnseignants();
        System.out.println("Recherche Enseignant e2 : " + gestionTreeSet.rechercherEnseignant(e2));
    }
}
