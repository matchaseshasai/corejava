package practice;

public class stringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is my Sample string";
		System.out.println("The given String is :"+str);
		System.out.println("Length of the string:"+ str.length());
		System.out.println("Char at 5th position:" + str.charAt(5));
		System.out.println("Last char of the String :" +str.charAt((str.length()-1)));
		System.out.println("Convert to UpperCase :" + str.toUpperCase());
		
		System.out.println((str.split(" ")).length);
		System.out.println(str);
		int count = 1;
		for(int i = 0 ; i<str.length();i++) {
			
			if(str.charAt(i)== ' ') {
				count++;
			}
		}
		System.out.println("count of string :"+ count);
	}

}
