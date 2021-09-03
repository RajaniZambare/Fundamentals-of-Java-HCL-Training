import java.util.*;
public class Menu {
				
	public static void main(String[] args) {
		
			float totalPriceOfIdali=0.0f;
			float totalPriceOfDosa=0.0f;
			float totalPriceOfPuri=0.0f;
			float totalPriceOfWada=0.0f;
			float totalPriceOfOrder;
			
			int noOfIdaliPlates=0;
			int noOfDosaPlates=0;
			int noOfPuriPlates=0;
			int noOfWadaPlates=0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Hotel Ashoka Menu");
			System.out.println("1.Idaly(2.00)\n2.Dosa(2.50)\n3.Puri(3.00)\n4.Wada(1.50)");
			System.out.println("Enter Number Of Items You Want:");
			int n = scan.nextInt();
			int [] array=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter Your Choice for Order:"+(i+1));
					array[i]=scan.nextInt();	
					
					int ch=array[i];
					switch (ch){
					
					case 1:
						System.out.println("Enter the Number of Plates:\n");
						noOfIdaliPlates=scan.nextInt();
						totalPriceOfIdali = 2.0f * (float)noOfIdaliPlates;
						break;
					case 2:
						System.out.println("Enter the Number of Plates:\n");
						noOfDosaPlates=scan.nextInt();
						totalPriceOfDosa = 2.50f * (float)noOfDosaPlates;
						break;
					case 3:
						System.out.println("Enter the Number of Plates:\n");
						noOfPuriPlates=scan.nextInt();
						totalPriceOfPuri = 3.0f * (float)noOfPuriPlates;
						break;
					case 4:
						System.out.println("Enter the Number of Plates:\n");
						noOfWadaPlates=scan.nextInt();
						totalPriceOfWada = 1.50f * (float)noOfWadaPlates;
						break;
					default:
						System.out.println("Enter right Choice");
					}
			}
			
			totalPriceOfOrder=totalPriceOfIdali+totalPriceOfDosa+totalPriceOfPuri+totalPriceOfWada;
			System.out.println("Total Price for Order:"+totalPriceOfOrder);	
			
			for(int i=0;i<=n;i++) {
				if(array[i]==1) {
					System.out.println("Idali --------------No of Plates:"+noOfIdaliPlates+"-----------Price:"+totalPriceOfIdali);
				}
				else if(array[i]==2) {
					System.out.println("Dosa--------------No of Plates:"+noOfDosaPlates+"-----------Price:"+totalPriceOfDosa);
				}
				else if(array[i]==3) {
					System.out.println("Puri--------------No of Plates:"+noOfPuriPlates+"-----------Price:"+totalPriceOfPuri);
				}	
				else {
					System.out.println("Wada--------------No of Plates:"+noOfWadaPlates+"-----------Price:"+totalPriceOfWada);
				}
			}
	}

}
