import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	//Instantiation of class Buffer
	private static BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
	
	public static int saisirInt()
	{
		int nb = 0;
		String chaine = "";
		boolean ok = true;
		do {
			ok = true;
			try {
				chaine = entree.readLine();
				nb = Integer.parseInt(chaine);
			}
			catch (IOException exp)
			{
				System.out.println("ERREUR de lecture !");
				ok = false;
			}
			catch (NumberFormatException exp)
			{
				System.out.println("ERREUR de Format du nombre incorrect !");
				ok = false;
			}
		}while (ok == false);
		
		return nb;
	}
	
	public static float saisirFloat()
	{
		float nb = 0;
		String chaine = "";
		boolean ok = true;
		do {
			ok = true;
			try {
				chaine = entree.readLine();
				nb = Float.parseFloat(chaine);
			}
			catch (IOException exp)
			{
				System.out.println("ERREUR de lecture !");
				ok = false;
			}
			catch (NumberFormatException exp)
			{
				System.out.println("ERREUR de Format du nombre incorrect !");
				ok = false;
			}
		}while (ok == false);
		
		return nb;
	}
	
	public static String saisirString()
	{
			String chaine = "";
			try {
				chaine = entree.readLine();
			}
			catch(IOException exp)
			{
				System.out.println("ERREUR de lecture !");
			}
			return chaine;
	}
	
	public static char saisirChar()
	{
			String chaine = "";
			try {
				chaine = entree.readLine();
			}
			catch(IOException exp)
			{
				System.out.println("ERREUR de lecture !");
			}
			return chaine.charAt(0);
	}
}
