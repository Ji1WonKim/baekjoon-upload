import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    String str=in.nextLine();
    String[] time=str.split(":");
    int sum=0;
    int a=Integer.parseInt(time[0]);
    int b=Integer.parseInt(time[1]);
    int c=Integer.parseInt(time[2]);
    
    if(0<=a&&a<60 &&0<=b&&b<60 &&0<=c&&c<60) {
    if(a>0 && a<13)
      sum++;
    if(b>0 && b<13)
      sum++;
    if(c>0 && c<13)
      sum++;
    }
    
      if(sum==1)
        System.out.println(2);
      else if(sum==2)
        System.out.println(4);
   
    
    else if(sum==3)
      System.out.println(6);
    else if(sum==0)
      System.out.println(0);
 
    
    
    in.close();
  }
}
