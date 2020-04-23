import java.util.UUID;

public class Substring {
public static void main(String[] args) {
	String str="Underground";
	String strSub=str.substring(7);
	String cusSub=str.substring(1, 3);
	
	String joinStr="Tanmoy"+"Roy";
	UUID uuid=UUID.randomUUID();
	String joinStrRef=strSub.concat(cusSub);
	System.out.println("SubString based on startIdx==> "+strSub+" /n"
	                    +"SubString based on start and End Idx==> "+cusSub+"JOIN==> "+uuid);
	
	
	String unique=UUID.randomUUID().toString().substring(0, 8);
	String subUnique=unique.substring(0,7);
	System.out.println("UUID1===> "+subUnique);
	String unique2=UUID.randomUUID().toString().substring(2, 4);
	CharSequence unique1=UUID.randomUUID().toString().subSequence(2, 4);
	System.out.println("UUID===> "+unique1+"UNIQUE2==> "+unique2);
	
    	
}
}
