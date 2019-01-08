
public class Initial extends Etudiant
{
	private String nomGarant, prenomGarant ;
	private float montantScolarite ;
	
	public Initial ()
	{
		super();
		this.nomGarant = "";
		this.prenomGarant = "";
		this.montantScolarite = 0;
	}
	public Initial (String nom, String prenom, int numcarte, String nomGarant, String prenomGarant, 
			float montantScolarite)
	{
		super(nom, prenom, numcarte);
		this.nomGarant = nomGarant;
		this.prenomGarant = prenomGarant;
		this.montantScolarite = montantScolarite;
	}
	public void saisir()
	{
		super.saisir();
		System.out.println("Donner le nom du Garant :");
		this.nomGarant = Console.saisirString();
		System.out.println("Donner le prenom du Grant :");
		this.prenomGarant = Console.saisirString();
		System.out.println("Donner le montant de la scolarite");
		this.montantScolarite = Console.saisirFloat();
	}
	public void afficher()
	{
		super.afficher();
		System.out.println("Le nom du Garant :"+this.nomGarant);
		System.out.println("Le prenom du Garant :"+this.prenomGarant);
		System.out.println("Le montant de la scolarite :"+this.montantScolarite );
	}
	public String toXml()
	{
		return "<Initial>\n"
				+ super.toXml()
				+"\t<nomGarant>"+this.nomGarant+"</nomGarant>\n"
				+"\t<prenomGarant>"+this.prenomGarant+"</prenomGarant>\n"
				+"\t<montantScolarite>"+this.montantScolarite+"</montantScolarite>\n"
				+"</Initial>\n";
	}
	public String getNomGarant() {
		return nomGarant;
	}
	public void setNomGarant(String nomGarant) {
		this.nomGarant = nomGarant;
	}
	public String getPrenomGarant() {
		return prenomGarant;
	}
	public void setPrenomGarant(String prenomGarant) {
		this.prenomGarant = prenomGarant;
	}
	public float getMontantScolarite() {
		return montantScolarite;
	}
	public void setMontantScolarite(float montantScolarite) {
		this.montantScolarite = montantScolarite;
	}
}
