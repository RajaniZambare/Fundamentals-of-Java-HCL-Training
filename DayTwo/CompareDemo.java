package dayTwo;
import java.util.Scanner;
public class CompareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Strings");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		scan.close();
		if (str1.equals(str2)) {
			System.out.println("two strings are equal");
			} 
		
		else {
			System.out.println("Two strings are not equal");
		}
	}

}
