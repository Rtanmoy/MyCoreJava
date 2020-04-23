package Wrapper;

public class Wrapper1 {
	public static void main(String[] args) {
		// Creating wrapper object
		Integer i1 = new Integer(11);
		Integer i2 = new Integer("11");
		Integer i3 = Integer.valueOf("11");

		System.out.println(i1.equals(i2) + " " + i3);

		Float f1 = new Float(3.4);
		Float f2 = new Float(3.5f);
		Float f3 = new Float("3.5f");
		System.out.println(f1 + " " + f2 + " " + f3);

		Character ch = new Character('D'); // character wrapper class don't take string as argument
		Character ch1 = Character.valueOf('Z');
		System.out.println(ch + " " + ch1);

		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("TruE");
		Boolean b3 = Boolean.valueOf(true);
		System.out.println(b1.equals(b2));

		// Creating primitive from wrapper object

		int i4 = i1.intValue();
		int i5 = i2.byteValue();
		System.out.println(i4 + " " + i5);

		float f = f2.floatValue();
		double d = f1.doubleValue();
		System.out.println(f + "  " + d);

		char ch2 = ch.charValue();
		System.out.println(ch2);

		boolean b4 = b2.booleanValue();
		System.out.println(b4);

		// String to primitive
		int i6 = Integer.parseInt("22");
		float f4 = Float.parseFloat("3.8f");
		double d2 = Double.parseDouble("3.9");
		boolean b5 = Boolean.parseBoolean("True");
		System.out.println(i6 + " " + f4 + " " + d2 + " " + b5);

		// Convert wrapper to string
		String s = i1.toString();
		String s1 = f1.toString();
		String s2 = b1.toString();
		String s3 = ch.toString();
		System.out.println(s + " " + s1 + " " + s2 + " " + s3);

	}

}
