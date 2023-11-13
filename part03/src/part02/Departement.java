package part02;

import java.util.ArrayList;

class Departement {
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> etudiantsInscrits;

    // Constructeur
    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiantsInscrits = new ArrayList<>();
    }

    // Méthode toString
    public String toString() {
        StringBuilder result = new StringBuilder("Département de " + specialite + ", Adresse: " + adresse + "\n");
        for (Etudiant etudiant : etudiantsInscrits) {
            result.append(etudiant).append("\n");
        }
        return result.toString();
    }

    // Méthode pour inscrire un étudiant
    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    // Méthode pour désinscrire un étudiant
    public void desinscrire(Etudiant etudiant) {
        etudiantsInscrits.remove(etudiant);
    }
}

