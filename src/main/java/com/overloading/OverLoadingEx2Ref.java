package com.overloading;

class Animal {
}

class Monkey extends Animal {
}

public class OverLoadingEx2Ref {
	public void methodOne() {
		System.out.println("Zero -methodone");
	}

	public Animal methodOne(Animal i) {
		System.out.println("Animal -methodone");
		return i;
	}

	public void methodOne(Monkey m) {
		System.out.println("Monkey -methodone");
	}

	public static void main(String[] args) {
		Animal al=new Animal();
		Monkey monkey=new Monkey();
		Animal animal=new Monkey();
		OverLoadingEx2Ref ol = new OverLoadingEx2Ref();
		ol.methodOne(al);
		ol.methodOne(monkey);
		ol.methodOne(animal);

	}

}
