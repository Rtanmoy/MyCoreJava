
public class FibbonacciEx {
public static void main(String[] args) {
	int t=0,t1=1,sum,n=5;
	for(int i=0;i<=5;i++) {
		sum=t+t1;
		t=t1;
		t1=sum;
		System.out.println(t);
	}
	int j=0;
	while(j<=5) {
		System.out.println(t);
		sum=t+t1;
		t=t1;
		t1=sum;
		j++;
	}
}
}
