package sample.Excercise;
import java.util.Scanner;

public class NumberofChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		countcharc(str);
	}

	public static void countcharc(String str) {
		int count[] = new int[256]; 

		int len = str.length(); 

		// Initialize count array index 
		for (int i = 0; i < len; i++) { 
			System.out.println(str.charAt(i));
			count[str.charAt(i)]++; 
		}
		
	   for(int j=0;j<count.length;j++) {
			System.out.println(count[j]);
		}
		
		
		// Create an array of given String size 
		char ch[] = new char[str.length()]; 
		for (int i = 0; i < len; i++) { 
			ch[i] = str.charAt(i); 
			int find = 0; 
			for (int j = 0; j <= i; j++) { 

				// If any matches found 
				if (str.charAt(i) == ch[j])  
					find++;                 
			} 
			System.out.println(find);
			if (find == 1)  
				System.out.println("Number of Occurrence of " + 
						str.charAt(i) + " is:" + count[str.charAt(i)]);             
		} 

	}

}
