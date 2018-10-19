package kiet.dev;

import kiet.dev.Circle;
import kiet.dev.Shape;
import kiet.dev.Square;
import kiet.dev.Triangle;

public class JavaInheritance {
	public static void main(String[] args) {
		
		
		
		double max = 0; 
		double min = 0;
		
		Shape shapes[] = new Shape[10];
		
		shapes[0] = new Square (6, 5);
		shapes[1] = new Square (6,7);
		shapes[2] = new Square (8,5);
		shapes[3] = new Square (8,6);
		shapes[4] = new Circle (5);
		shapes[5] = new Circle (7);
		shapes[6] = new Circle (9);
		shapes[7] = new Triangle (6,6,7);
		shapes[8] = new Triangle (5,8,7);
		shapes[9] = new Triangle (7,4,9);
		
		for(int i = 0; i < shapes.length; i++)
			System.out.println("Dien tich: " + shapes[i].Dientich());
		
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i].Dientich() > max)
				max = shapes[i].Dientich();
		}
		
		min = shapes[0].Dientich();
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i].Dientich() < min)
				min = shapes[i].Dientich();
		}
		
		System.out.println("Dien tich phan tu lon nhat: "+max);
		System.out.println("Dien tich phan tu be nhat: "+min);
	}
}