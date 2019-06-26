package sample.Excercise;
import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=sc.nextLine();
		System.out.println("Enter the character Start");
		String c=sc.nextLine();
		//name.cont
		*/
		
		String nam="Santhana kumar Subramanian De";
		String substring="";
		String[] split = nam.split("[\\s]", 2);
		
		for (String string : split) {
			System.out.println(string);
		}
		int count=0;
		while(nam.indexOf('a')!=-1) {
			substring= nam.substring(0, nam.indexOf('a'))+nam.substring(nam.indexOf('a')+1);
			nam=substring;
			count++;
		}
		System.out.println(substring);
		System.out.println(count);
	}

}
