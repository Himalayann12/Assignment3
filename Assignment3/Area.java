package Assignment3;

import java.util.Scanner;

     class Area {
	
	int l;
	int b;
	
	void setDim(int length, int breadth) {
		
		l = length;
		b = breadth;
	}
	
	int getArea() {
		
		int result = l * b;
		return result;
	}
	
	public static void main(String[] args) {
		
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of length ");
		int l = sc.nextInt();
		
		System.out.println("Enter value of breadth ");
		int b = sc.nextInt();
		
		a.setDim(l, b);
		int result = a.getArea();
		
		System.out.println("Area = "+result);
		
	}

}