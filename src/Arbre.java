
public class Arbre extends Plante {

	private int taille ;
	
	public Arbre () {
		super ();
		this.taille=0;
	}

	public void saisir () {
		super.saisir();
	}
	
	public void afficher () {
		super.afficher();
		System.out.println("Taille arbre  :" +this.taille+ " " + Arbre.getUnite());
		
	}
	
	@Override
	public int grandirCm(int nbCm) {
		// TODO Auto-generated method stub
		this.taille += nbCm *2;
		return this.taille;
	}
	
	
}
