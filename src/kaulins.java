import java.util.Random;

public class kaulins {

	static void metkaulinu() {
		Random rand = new Random();
	int skaitlis = rand.nextInt(6)+1;
	System.out.println("Uzkrita :"+skaitlis);
	}
	
	public static void main(String[] args) {

	
		metkaulinu();
		
	}

}
