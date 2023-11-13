package part02;
import java.time.LocalDate;

class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;

    // Constructeur
    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
    }

    // Méthode toString
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Date de Naissance: " + dateNaissance +
                ", Adresse Mail: " + adresseMail + ", Adresse Postale: " + adressePostale;
    }

    // Fonction pour changer le nom
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }
}
