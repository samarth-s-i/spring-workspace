package org.jsp.coupling_demo.tight_coupling;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Ride r = new Ride();
		System.out.println("1. Bike\n2. Car\n");
		System.out.print("Enter a choice: ");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		if (choice == 1)
			r.setV(new Bike());
		else if (choice == 2)
			r.setV(new Car());
		else
			System.out.println("Fuck yourself");
		try {
			r.getV().start();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
