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

    // M�thode toString
    public String toString() {
        StringBuilder result = new StringBuilder("D�partement de " + specialite + ", Adresse: " + adresse + "\n");
        for (Etudiant etudiant : etudiantsInscrits) {
            result.append(etudiant).append("\n");
        }
        return result.toString();
    }

    // M�thode pour inscrire un �tudiant
    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    // M�thode pour d�sinscrire un �tudiant
    public void desinscrire(Etudiant etudiant) {
        etudiantsInscrits.remove(etudiant);
    }
}

