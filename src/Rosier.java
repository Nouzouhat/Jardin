
public class Rosier extends Plante implements IFleur {

	private int taille ;
	private String saison, parfum;
	
	public Rosier () {
		super ();
		this.parfum = "";
		this.saison = "";
		this.taille = 0;
	}
	@Override
	public String getParfum() {
		// TODO Auto-generated method stub
		return this.parfum;
	}

	@Override
	public void saisonFleuraison(String saison) {
		// TODO Auto-generated method stub
		this.saison = saison;
	}

	@Override
	public int grandirCm(int nbCm) {
		// TODO Auto-generated method stub
		this.taille += nbCm;
		return this.taille;
	}
	
	public int getTaille() {
		return taille;
	}
	
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public String getSaison() {
		return saison;
	}
	
	public void setSaison(String saison) {
		this.saison = saison;
	}
	
	public void setParfum(String parfum) {
		this.parfum = parfum;
	}
 
}
