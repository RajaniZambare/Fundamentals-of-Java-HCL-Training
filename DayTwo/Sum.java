package dayTwo;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(" enter the size of array");
		int len = in.nextInt();
		
		int arr[] = new int[len];
		int oddSum =0;               
		int evenSum = 0;
		
		System.out.println(" enter the elements of array:");
		for(int i=0; i<len; i++) {
			arr[i] = in.nextInt();
			}
		
		for(int i=0;i<len;i++) {
			if(i % 2==0) {
				evenSum = evenSum + arr[i];
				}
			else {
				oddSum = oddSum + arr[i];
				}
			}
		System.out.println("Sum of even index nos  is " + evenSum);
		System.out.println("Sum of odd index nos is " + oddSum);
		}
	}
