package com.DynamicDispatch;

public class MainDispatch {

	public static void main(String[] args) {

		// Dynamic dispatch.
		Animal a = new Dog();// upcasting.
		a.sound();

		Dog d = new Dog();
		// d.sound();
		a.sound();

		System.err.println("*************");

		Vehicle v = new Car();
		v.start();

		System.err.println("*************");
		Shape s = new Circle();
		s.shape();

		Shape s1 = new Rectangle();
		s1.shape();

		System.err.println("*************");

	
		Employee e ;
		e=new Manager();
		e.salary();
		Employee e1 = new Developer();
		e1.salary();
		Employee e2 = new Leader();
		e2.salary();

		// if we can prints output of self class then need to be creating object

		Developer d2 = new Developer();
		d2.salary();

	}
}
