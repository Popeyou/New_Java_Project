import javax.swing.plaf.synth.SynthSpinnerUI;

public class Etudiant 
{
	protected String nom, prenom ;
	protected int numcarte ;
	protected static String devise = "euros" ;
	
	public Etudiant ()
	{
		this.nom = "";
		this.prenom = "";
		this.numcarte = 0;
	}
	public Etudiant (String nom, String prenom, int numcarte)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.numcarte = numcarte;
	}
	public void saisir()
	{
		System.out.println("Donner le nom :");
		this.nom = Console.saisirString();
		System.out.println("Donner le prenom :");
		this.prenom = Console.saisirString();
		System.out.println("Donner le numéro de la carte :");
		this.numcarte = Console.saisirInt();
	}
	public void afficher()
	{
		System.out.println("Prenom :"+this.prenom);
		System.out.println("Nom :"+this.nom);
		System.out.println("Numero de carte :"+this.numcarte);
	}
	public String toXml()
	{
		return	"<Etudiant>\n"
				+	"\t <nom>"+this.nom+"</nom>\n"
				+	"\t <prenom>"+this.nom+"</prenom>\n"
				+	"\t <numcarte>"+this.nom+"</numcarte>\n"
				+	"</Etudiant>\n";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumcarte() {
		return numcarte;
	}
	public void setNumcarte(int numcarte) {
		this.numcarte = numcarte;
	}
	public static String getDevise() {
		return devise;
	}
	public static void setDevise(String devise) {
		Etudiant.devise = devise;
	}

}
