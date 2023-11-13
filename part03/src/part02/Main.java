package part02;

import java.time.LocalDate;

public class Main {
		    public static void main(String[] args) {
		        // Instanciation de l'�tudiant lolo
		        Etudiant lolo = new Etudiant("Lolo", "PrenomLolo", LocalDate.of(2000, 1, 1),
		                "lolo@example.com", "AdresseLolo");

		        // Affichage des informations de lolo
		        System.out.println("Informations de lolo:");
		        System.out.println(lolo);

		        // Cr�ation de toto avec les m�mes param�tres que lolo
		        Etudiant toto = new Etudiant("Lolo", "PrenomLolo", LocalDate.of(2000, 1, 1),
		                "lolo@example.com", "AdresseLolo");

		        // Comparaison des deux �tudiants avec l'op�rateur ==
		        System.out.println("Comparaison avec l'op�rateur == : " + (lolo == toto));

		        // Modification du nom de toto, v�rification que cela se r�percute sur lolo
		        toto.setNom("Toto");
		        System.out.println("Nouveau nom de lolo apr�s modification de toto : " + lolo);

		        // Cr�ation de deux nouveaux �tudiants fifi et riri
		        Etudiant fifi = new Etudiant("Fifi", "PrenomFifi", LocalDate.of(2001, 2, 2),
		                "fifi@example.com", "AdresseFifi");
		        Etudiant riri = new Etudiant("Riri", "PrenomRiri", LocalDate.of(2002, 3, 3),
		                "riri@example.com", "AdresseRiri");
		        Departement monDepInfo = new Departement("Informatique", "AdresseDepInfo");

		        // Inscription des �tudiants dans monDepInfo
		        monDepInfo.inscrire(lolo);
		        monDepInfo.inscrire(fifi);
		        monDepInfo.inscrire(toto);
		        monDepInfo.inscrire(riri);

		        // Affichage des �tudiants inscrits dans monDepInfo
		        System.out.println("�tudiants inscrits dans monDepInfo:");
		        System.out.println(monDepInfo);

		        // D�sinscription de toto du d�partement
		        monDepInfo.desinscrire(toto);

		        // Affichage mis � jour des �tudiants inscrits dans monDepInfo
		        System.out.println("�tudiants inscrits apr�s d�sinscription de toto:");
		        System.out.println(monDepInfo);
		    }

	}
