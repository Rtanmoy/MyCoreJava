package com.interview;

import java.util.Random;
import java.util.function.Supplier;

public class GenerateOTP {
static char[] sendOTP(int length) {
	System.out.println("=========");
	String number="0123456789";
	//Random random=new Random();
	char[]otp=new char[length];
	for(int i=0;i<length;i++) {
		otp[i]=number.charAt(new Random().nextInt(number.length()));
	}
	return otp;
}
public static void main(String[] args) {
	System.out.println(sendOTP(4));
	Supplier<String>opts=()->{
		String opt="";
		for(int i=1;i<=4;i++) {
			opt=opt+(int)(Math.random()*10);
		}
		return opt;
	};
	System.out.println(opts.get());
}
}
