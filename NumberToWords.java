/*Dette programmet skriver ut tall fra bruker som tekst, ny endring 14.26 */
import java.util.Scanner;

public class NumberToWords {

	public void pw( int n, String ch) {
		String enere[] = {" ","ein", "to", "tre", "fire", "fem", "seks", "sju", "åtte", "ni", "ti"	, "elleve", "tolv", "tretten", "fjorten", "femten", "seksten", "sytten", "atten", "nitten"};
		
		String tiere[] = {"", "", "tjue", "tretti", "førti", "femti", "seksti", "sytti", "åtti", "nitti" };
		
		
	
		
		if (n>19) {
			System.out.print(tiere[n / 10]  + enere[n % 10]);
		}
		else {
			System.out.print(enere[n]);
		} 
		if (n > 0)
		System.out.print(ch);
			
	}
	public static void main(String[] args) {
		
	    int n ;
	    
		Scanner input = new Scanner (System.in);
		System.out.println("Skriv et tall fra 1-100.000");
		n = input.nextInt();
		System.out.print(n);
		
		if (n <= 0) {
			System.out.println("Skriv et tall større enn 0");
		}
		else {
			NumberToWords a = new NumberToWords();
			a.pw((n / 1000000000), "hundre");
			a.pw((n / 10000000) % 100,  "crore");
			a.pw((n / 100000) % 100,  "hundre-og-");
			a.pw((n / 1000) % 100, "-tusen-");
			a.pw((n / 100) % 10, "-hundre-og-");
			a.pw((n % 100), " ");

			
		}
	}

}
