import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NEzin {
     static int mestKaulinu(int reizes){
    	 int skaitlis=0, lielakais=0;
    	 Random rand = new random();
    	 for(int i=1; i<reizes; i++){
    		 skaitlis=rand.nextInt(6)+1;
    		 System.out.println("Uzkrita skaitlis"+skaitlis);
    		 if(lielakais<skaitlis){
    			 lielakais=skaitlis;
    		 }
    	 }
    	 System.out.println("Lielakais skaitlis metienu piegajiena ir "+lielakais);
    	 return skaitlis;
     }
	public static void main(String[] args) {
		int reizes, izvele;
		List<Integer> pedejie=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		do{
			System.out.println("1-met kaulinu | 2-Apskatit pedejos | 3-Apturet");
			izvele=scan.nextInt();
			switch(izvele){
			case 1:
				do {
					System.out.println("cik reizes met kaulinu");
					reizes = scan.nextInt();
				}while(reizes<1);
				pedejie=mestKaulinu(reizes);
				break;
				
			case 2:
				System.out.println("pedeja metien skaitli ir?");
				for(int i=0; i<pedejie.size(); i++){
					pedejie.get(i);
					
				}
				break;
				
			case 3:
				int lielakais=0;
				for(int i=0; i<pedejie.size(); i++){
					if(pedejie.get(i)>lielakais){
						lielakais = pedejie.get(i);
					}
					System.out.println("Lielakais skaitlis pedeja metiena ir"+lielakais);
					break;
					
					case 4:
					System.out.println("Programma aptureta");
					break;
					
				}
			}while(izvele!=2);
			scan.close();
				}
	}
			
		





	
	



