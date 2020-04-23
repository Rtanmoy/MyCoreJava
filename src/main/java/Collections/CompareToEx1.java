package Collections;

public class CompareToEx1 {

	public static void main(String[] args) {
     System.out.println("A".compareTo("S"));//-ve
     System.out.println("X".compareTo("C"));//+ve
     System.out.println("X".compareTo("X"));//
     System.out.println("Z".compareTo(null));//NPE
	}

}
