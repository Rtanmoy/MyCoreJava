import org.apache.commons.lang3.RandomStringUtils;

public class Substring2 {
public static void main(String[] args) {
	System.out.println("=========>>Alphanumeric<<==========");
	for(int i=0;i<1;i++) {
		System.out.println(RandomStringUtils.randomAlphanumeric(2, 8));
	}
	System.out.println("=========>>Numeric<<==========");
	for(int i=0;i<1;i++) {
		System.out.println(RandomStringUtils.randomNumeric(5));
	}
	System.out.println("=========>>Alphabetic<<==========");
	for(int i=0;i<1;i++) {
		System.out.println(RandomStringUtils.randomAlphabetic(5));
	}
}
}
