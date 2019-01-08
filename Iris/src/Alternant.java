
public class Alternant extends Etudiant
{
	private String entreprise, typeContrat ;
	private static float montantOPCA = 4500 ;
	
	public Alternant()
	{
		super();
		this.entreprise = "" ;
		this.typeContrat = "";
	}
	public Alternant (String nom, String prenom, int numcarte, String entreprise, 
			String typeContrat)
	{
		super(nom, prenom, numcarte);
		this.entreprise = entreprise;
		this.typeContrat = typeContrat;
	}
	public void saisir() 
	{
		super.saisir();
		System.out.println("Donner le nom de l'entreprise :");
		this.entreprise = Console.saisirString();
		System.out.println("Donner le type de contrat :");
		this.typeContrat = Console.saisirString();
		
	}
	public void afficher()
	{
		super.afficher();
		System.out.println("Le nom de l'entreprise :"+this.entreprise);
		System.out.println("Le type de contrat :"+this.typeContrat);
	}
	public String toXml()
	{
		return "<Alternant>\n"
				+ super.toXml()
				+"\t<entreprise>"+this.entreprise+"</entreprise>\n"
				+"\t<typeContrat>"+this.typeContrat+"</typeContrat>\n"
				+"</Alternant>\n";
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public static float getMontantOPCA() {
		return montantOPCA;
	}
	public static void setMontantOPCA(float montantOPCA) {
		Alternant.montantOPCA = montantOPCA;
	}
}
