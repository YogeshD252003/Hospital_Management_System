package Hospital_Management_System;

public class Main {

	public static void main(String[] args) {
		patient p=new patient();
		p.setter("Raj", "Fever-02", 25, 93);
		p.display();
		System.out.println();
		patient p2=new patient();
		p2.setter("Kalaa", null, 18, 8);
		p2.display();
	}
}
