import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);	
		int small=0, large=0, num=0, blank=0;
		
		
		while(in.hasNextLine()){
			
		small=0;
		large=0;
		num=0;
		blank=0;
		
		String s=in.nextLine();
		
		for(int i=0;i<s.length();i++) {
			if(' '==s.charAt(i))
				blank++;
			else if(Character.isDigit(s.charAt(i)))
				num++;
			else if(Character.isLowerCase(s.charAt(i)))
				small++;
			else if(Character.isUpperCase(s.charAt(i)))
				large++;
		}
		
		System.out.println(small+" "+large+" "+num+" "+blank);
		
		
		}
		
		in.close();
	}
}
