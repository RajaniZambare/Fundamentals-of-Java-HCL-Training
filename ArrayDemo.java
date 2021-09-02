import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=scan.nextInt();
		int [] array=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("Enter the elements");
				array[i]=scan.nextInt();
			}
			scan.close();
			for(int i=0;i<size;i++) {
				System.out.println("Enter the elements"+array[i]);
				
			}

	}

}
