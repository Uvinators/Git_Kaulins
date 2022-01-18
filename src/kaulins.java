import java.util.Random;
import java.util.Scanner;

public class kaulins {

	static void metkaulinu(int reizes) {
		Random rand = new Random();
		for(int i=1; i<=reizes; i++){
	int skaitlis = rand.nextInt(6)+1;
	System.out.println("Uzkrita :"+skaitlis);
	}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
Scanner scan = new Scanner(System.in);
	
System.out.println("cik reizes mest kaulinu?");
int reizes = scan.nextInt();

metkaulinu(reizes);
scan.close();

	}
	}
	

	
	



