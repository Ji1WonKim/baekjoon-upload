package replit;

import java.util.Scanner;

public class replit {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);	
		
		int Case=in.nextInt();
		
		while(Case>0) {
			Case--;
			
			int N=in.nextInt(); 
			int sum=0;
			int[] score= new int[N];
			for (int i=0; i<N;i++) {
				score[i]=in.nextInt();
				sum+=score[i];
			}
			
			double ave=0.0;
			ave=sum/(double)N;
			
			int Over=0;
			for(int i=0;i<N;i++) {
				if(score[i]>ave)
					Over++;}
			double percent=0.0;
			percent=Over/(double)N*100;
			
			System.out.println(String.format("%.3f", percent)+"%");
		}
		
		
		in.close();
	
		
		
	}
}
