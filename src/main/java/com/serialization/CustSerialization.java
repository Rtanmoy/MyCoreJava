package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String userName="Tommy";
	transient String pwd="Tanny";
   private void writeObject(ObjectOutputStream os) throws Exception{
	   os.defaultWriteObject();
	   String npwd="123"+pwd;
	   os.writeObject(npwd);
   }
   private void readObject(ObjectInputStream oi) throws Exception{
	   oi.defaultReadObject();
	   String npwd=(String) oi.readObject();
	   pwd=npwd.substring(3);
   }
}
public class CustSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account ac=new Account();
		FileOutputStream fos=new FileOutputStream("rt.sev");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(ac);
		
		FileInputStream fis=new FileInputStream("rt.sev");
		ObjectInputStream oi=new ObjectInputStream(fis);
		Account dac=(Account) oi.readObject();
		System.out.println(dac.userName+"  "+dac.pwd);

	}

}
