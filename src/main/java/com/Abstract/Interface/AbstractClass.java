package com.Abstract.Interface;

public class AbstractClass {

	public static void main(String[] args) {
    
		//Animal a=new Animal(); //giving compile time error
		Pig p=new Pig();
		p.animalSound();
		p.sleep();
	}

}

//Abstract class
abstract class Animal {
// Abstract method (does not have a body)
	public abstract void animalSound();

// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}