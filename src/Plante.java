
public abstract class Plante {
	
	private String nom;
	private static String unite = "cm";
	
	public Plante () {
		this.nom = "";
	}
	
	public void saisir () {
		
	}
	
	public void afficher () {
		
	}
	
	//methode abstraite sans impléménet
	public abstract int grandirCm (int nbCm);

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static String getUnite() {
		return unite;
	}

	public static void setUnite(String unite) {
		Plante.unite = unite; 
	}
	
}




