package part02;

import java.time.LocalDate;

public class Main {
		    public static void main(String[] args) {
		        // Instanciation de l'étudiant lolo
		        Etudiant lolo = new Etudiant("Lolo", "PrenomLolo", LocalDate.of(2000, 1, 1),
		                "lolo@example.com", "AdresseLolo");

		        // Affichage des informations de lolo
		        System.out.println("Informations de lolo:");
		        System.out.println(lolo);

		        // Création de toto avec les mêmes paramètres que lolo
		        Etudiant toto = new Etudiant("Lolo", "PrenomLolo", LocalDate.of(2000, 1, 1),
		                "lolo@example.com", "AdresseLolo");

		        // Comparaison des deux étudiants avec l'opérateur ==
		        System.out.println("Comparaison avec l'opérateur == : " + (lolo == toto));

		        // Modification du nom de toto, vérification que cela se répercute sur lolo
		        toto.setNom("Toto");
		        System.out.println("Nouveau nom de lolo après modification de toto : " + lolo);

		        // Création de deux nouveaux étudiants fifi et riri
		        Etudiant fifi = new Etudiant("Fifi", "PrenomFifi", LocalDate.of(2001, 2, 2),
		                "fifi@example.com", "AdresseFifi");
		        Etudiant riri = new Etudiant("Riri", "PrenomRiri", LocalDate.of(2002, 3, 3),
		                "riri@example.com", "AdresseRiri");
		        Departement monDepInfo = new Departement("Informatique", "AdresseDepInfo");

		        // Inscription des étudiants dans monDepInfo
		        monDepInfo.inscrire(lolo);
		        monDepInfo.inscrire(fifi);
		        monDepInfo.inscrire(toto);
		        monDepInfo.inscrire(riri);

		        // Affichage des étudiants inscrits dans monDepInfo
		        System.out.println("Étudiants inscrits dans monDepInfo:");
		        System.out.println(monDepInfo);

		        // Désinscription de toto du département
		        monDepInfo.desinscrire(toto);

		        // Affichage mis à jour des étudiants inscrits dans monDepInfo
		        System.out.println("Étudiants inscrits après désinscription de toto:");
		        System.out.println(monDepInfo);
		    }

	}
