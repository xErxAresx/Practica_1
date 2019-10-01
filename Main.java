import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int cmp = 0;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Donam la frase i et dire cuantes vocals hi ha: ");
		String frase = lector.nextLine();
		char a = 'a';
		char A = 'A';
		
		for (int i = 0; i < frase.length(); i++)
		{
			if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u' || 
				frase.charAt(i)=='A' || frase.charAt(i)=='E' || frase.charAt(i)=='I' || frase.charAt(i)=='O' || frase.charAt(i)=='U') {
				cmp++;
			}
		}
		
		System.out.println("A la frase que has posat hi ha "+cmp+" vocals en total");
	}

}
