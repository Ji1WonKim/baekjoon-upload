import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int N=in.nextInt();
    int[] num= new int[N];
    int ref=0;

    for(int i=0;i<N;i++){
      
      num[i]=in.nextInt(); // 손님 수
      
      for(int j=0; j<num.length;j++){
        if(i!=j){
          if(num[i]==num[j]){// 중복 숫자 카운트
            ref++;
          break;}
        }
      }
    }
    
    System.out.println(ref);
    in.close();
  }
}
