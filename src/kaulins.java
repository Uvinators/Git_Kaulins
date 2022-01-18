import java.util.Random;

public class kaulins {

	static void metkaulinu(int reizes) {
		Random rand = new Random();
		for(int i=1; i<=reizes; i++){
	int skaitlis = rand.nextInt(6)+1;
	System.out.println("Uzkrita :"+skaitlis);
	}
	}
	
	public static void main(String[] args) {

	
		metkaulinu(3);
		
	}

}
