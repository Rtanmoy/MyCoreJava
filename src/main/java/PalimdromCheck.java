
public class PalimdromCheck {

	public static void main(String[] args) {

		//Using while loop
     int rem,rev=0,n=121,temp;
     temp=n;
       while(n!=0) {
    	 rem=n%10;
    	 rev=rev*10+rem;
    	 n=n/10;
     }
     if(temp==rev) {
    	 System.out.println("Palimdrom");
     }else {
    	 System.out.println("Not  Palimdrom");
     }
     
     //Using for loop
     for(int i=n;i!=0;i/=10) {
    	 rem=n%10;
    	 rev=rev*10+rem;
     }
     if(temp==rev) {
    	 System.out.println("Palimdrom");
     }else {
    	 System.out.println("Not  Palimdrom");
     }
     
     //Using library method reverse()
     String s="MAAM";
     String reverse=new StringBuffer(s).reverse().toString();
     if(s.equals(reverse)) {
    	 System.out.println("Palimdrom");
     }else {
    	 System.out.println("Not  Palimdrom");
     }
		/*
		 * String str="NMN"; int j=str.length()-1; for(int i=0;i<j;i++) {
		 * if(str.charAt(i)!=str.charAt(str.length()-1)) {
		 * System.out.println("Not Palimdrom"); j--; } }
		 * System.out.println("Palimdrom");
		 */
     
	}

}
