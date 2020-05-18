package com.Abstract.Interface;

public class InterfaceEx implements Interface1 {
	public static void main(String[] args) {

		InterfaceEx ix = new InterfaceEx();
		ix.animalSound();
		ix.run();
	}

	@Override
	public void animalSound() {
		System.out.println("From animal sound");

	}

	@Override
	public void run() {
		System.out.println("From run");

	}
}

interface Interface1 {
	public void animalSound(); // interface method (does not have a body)

	public void run(); // interface method (does not have a body)

}