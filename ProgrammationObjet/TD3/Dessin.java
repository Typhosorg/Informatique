import PaD.*;
public class Dessin{
    public static void main(String [] args){
	PlancheADessin pad = new PlancheADessin();
	double milieu = pad.getLargeur()/2;

	Dessinable titre = new Texte(milieu-60, 10, "Mon_Bonhomme");
	Dessinable Tête = new CerclePlein(milieu, 80, 60, PlancheADessin.ROUGE);
	Dessinable cou= new Ligne(milieu, 110, milieu, 170);
	Dessinable corps = new RectanglePlein(milieu-40, 170,80,100, PlancheADessin.VERT);
	Dessinable jambe1 = new Ligne(milieu-20,270, milieu-40, 370);
	Dessinable jambe2 = new Ligne(milieu+20, 270 , milieu+40, 370);
	Dessinable bras1 = new Ligne(milieu-40,200, milieu-100, 170);
	Dessinable bras2 = new Ligne(milieu+40,200, milieu+100, 170);

	pad.ajouter(titre);
	pad.ajouter(Tête);
	pad.ajouter(cou);
	pad.ajouter(corps);
	pad.ajouter(jambe1);
	pad.ajouter(jambe2);
	pad.ajouter(bras1);
	pad.ajouter(bras2);

    }
}
