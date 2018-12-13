import java.util.Scanner;
public class AnnéeNaissance {
    public static void main(String [] args) {
	// créer un objet Scanner pour lire sur l'entrée standard
	Scanner sc = new Scanner(System.in);
	// lire le prénom
	System.out.print("Votre prénom : ");
	String prénom = sc.nextLine();
	// lire l'âge
	System.out.print("Votre âge : ");
	int âge = sc.nextInt();
	// afficher l'année de naissance
	System.out.println(prénom + ", vous êtes né en " + (2017-âge));
    }
}
