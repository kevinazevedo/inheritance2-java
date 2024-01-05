package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = scan.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Shape #" + (i+1) + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char resp = scan.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.next());
				
			if (resp == 'r' || resp == 'R') {	
				System.out.print("Width: ");
				Double width = scan.nextDouble();
				System.out.print("Height: ");
				Double height = scan.nextDouble();				
				list.add(new Rectangle(color, width, height));
			}
			else if (resp == 'c' || resp == 'C') {
				System.out.print("Radius: ");
				Double radius = scan.nextDouble();			
				list.add(new Circle(color, radius));
			}			
		}	
		
		System.out.println("\nSHAPE AREAS:");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}	
		
		scan.close();
	}
}