import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		int n=in.nextInt();
		
			for(int i=2; i<=n;) {
				if(n%i==0) {
					System.out.println(i);
					n=n/i;
				}
				else
					i++;
			}
		
	}
}
