import java.util.ArrayList;

public class Classe 
{
	private ArrayList<Etudiant> lesEtudiants;
	
	public Classe ()
	{
		this.lesEtudiants = new ArrayList<Etudiant>();
	}
	public void ajouterEtudiant()
	{
		int choix = 0;
		do {
			System.out.println("___ MENU AJOUT ETUDIANT ___");
			System.out.println("1_Etudiant initial");
			System.out.println("2_Etudiant Alternant");
			System.out.println("0_Quitter");
			choix = Console.saisirInt();
			switch (choix)
			{
			case 1 : 
			{
				Initial unInitial = new Initial(); //instanciation de la classe
				unInitial.saisir();	//renseignement des attributs
				this.lesEtudiants.add(unInitial);	//ajout à l'ArrayList
			}
			break;
			case 2 : 
			{
				Alternant unAlternant = new Alternant();
				unAlternant.saisir();
				this.lesEtudiants.add(unAlternant);
			}
			break;
			}
		}while (choix !=0);
	}
	public void ListerLesInitiaux()
	{
		System.out.println("Liste de tous les Initiaux");
		for (Etudiant unEtudiant : this.lesEtudiants)
		{
			if (unEtudiant instanceof Initial)
			{
				unEtudiant.afficher();
			}
		}
	}
	public void ListerLesAlternants()
	{
		System.out.println("Liste de tous les Alternants");
		for (Etudiant unEtudiant : this.lesEtudiants)
		{
			if (unEtudiant instanceof Alternant)
			{
				unEtudiant.afficher();
			}
		}
	}
	public float totalPaiementClasse ()
	{
		float total = 0;
		for (Etudiant unEtudiant : this.lesEtudiants)
		{
			if (unEtudiant instanceof Alternant)
			{
			total = total + Alternant.getMontantOPCA();
			}else if (unEtudiant instanceof Initial)
			{
				total = total + ((Initial)unEtudiant).getMontantScolarite();
			}
		}
		return total;
	}
	public boolean retirerEtudiant (int numCarte)
	{
		for (Etudiant unEtudiant : this.lesEtudiants)
		{
			if (unEtudiant.getNumcarte() == numCarte)
			{
				this.lesEtudiants.remove(unEtudiant);
				return true;
			}
		}
		return false;
	}
	public String toXml()
	{
		String chaine ="";
			chaine = "<classe>\n";
			for (Etudiant unEtudiant : this.lesEtudiants)
			{
				if(unEtudiant instanceof Initial)
				{
					((Initial)unEtudiant).toXml();
				}else
				{
					((Alternant)unEtudiant).toXml();
				}
			}
			chaine += "</classe>\n";
			return chaine;
	}
	public void gererClasse()
	{
		int choix = 0;
		do {
			System.out.println("Menu Classe");
			System.out.println("1-Ajouter etudiant");
			System.out.println("2-Liste des initiaux");
			System.out.println("3-Lite des alterants");
			System.out.println("4-Total montants");
			System.out.println("5-Supprimer etudiant");
			System.out.println("6-XML de la classe");
			System.out.println("0-Quitter");
			System.out.println("-----------------------------------");
			System.out.println("Votre choix ?");
			choix = Console.saisirInt();
			switch(choix)
				{
				case 1 : this.ajouterEtudiant();break;
				case 2 : this.ListerLesInitiaux();break;
				case 3 : this.ListerLesAlternants();break;
				case 4 : System.out.println("Total : " +this.totalPaiementClasse());break;
				case 5 : System.out.println("Donner un numéro de carte à supprimer :");
						if (this.retirerEtudiant(Console.saisirInt()))
							System.out.println("Etudiant supprimer !");
						else System.out.println("Etudiant inconnu ");
						break;
				case 6 : System.out.println(this.toXml());break;
				}
			}while(choix !=0);
		
		}
		
}		