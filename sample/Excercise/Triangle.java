package sample.Excercise;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no .of Triangles");
		int rows=sc.nextInt();
		trianglefull(rows);
		triangleempty(rows);

	}
	
	public static void trianglefull(int rows) {
		
		for(int i=0;i<rows;i++) {
			
			for(int k=rows;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void triangleempty(int rows) {
		
		for(int i=0;i<rows;i++) {
			
			for(int k=rows;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
			if(i==rows-1 || j==0 || j==i ||j==1 ||j==i-1||i==rows-2) {
				System.out.print("*"+" ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
		
		for(int i=rows;i>0;i--) {
			
			for(int k=rows;k>=i;k--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
			if(i==rows || j==0 || j==i ||j==1 ||j==i-1||i==rows-1) {
				System.out.print("*"+" ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
		
	}

}
