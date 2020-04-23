package count;

class WordCount { 
	//static void count(String str) 
	public static void main(String[] args) 
	{ 
		String str = "I am Tanmoy"; 
		// Create an char array of given String 
		char[] ch = str.toCharArray(); 
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) { 

			// Declare an String with empty initialization 
			String s = ""; 

			// When the character is not space 
			while (i < ch.length && ch[i] != ' ') { 

				// concat with the declared String 
				s = s + ch[i]; 
				i++; 
			} 

			if (s.length() > 0) 
				System.out.println(s + "->" + s.length());			 
		} 
	} 
	
} 
