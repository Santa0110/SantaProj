package sample.Excercise;
import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");		
		String name=sc.nextLine();
		System.out.println("Enter Index");
		int index=sc.nextInt();
		
		int ascii=name.charAt(1);
		System.out.println(ascii);
		System.out.println((char)ascii);

	}

}
