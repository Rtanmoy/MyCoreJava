package com.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalDemo implements Externalizable {
	String s;
	int i;
	int j;

	public ExternalDemo(String s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}

	public ExternalDemo() {
		super();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = in.readInt();
	}

}

public class ExternalizationEx1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExternalDemo ed = new ExternalDemo("Toomy", 9, 3);
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ed);
		System.out.println("Serialization ended");
		System.out.println("DESerialization started");
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalDemo ed1 = (ExternalDemo) ois.readObject();
		System.out.println("DESerialization ended");
		System.out.println(ed1.i + "   " + ed1.j + "   " + ed1.s);

	}

}
