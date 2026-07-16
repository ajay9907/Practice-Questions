package com.constructor_practice;

public class MainConstructorPractice {

	public static void main(String[] args) {
		Student s = new Student();
		s.display(5, "Ajay");

		System.out.println("-------------");

		Employee e = new Employee(5, "Xyz");
		e.display();

		System.out.println("-------------");
		Mobile m = new Mobile();
		m.display();
		Mobile m1 = new Mobile("Samsung ");
		m1.display();
		Mobile m2 = new Mobile("Vivo",50000);
		m2.display();

		System.out.println("-------------");
		
		Bank b1=new Bank(23456,"Atharv",0);
		
		b1.display();
		b1.bal=b1.deposite(-1);
		b1.withdraw(800,b1.bal);
		
		
		
	
	}

}
