import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        while(t-->0){
            int n=m.nextInt();
            int arr[]=new int[3];
            for(int i=0;i<3;i++){
                arr[i]=m.nextInt();
                
            }
        int weakStd=0;
        
        for(int i=0;i<3;i++){
            int rem=n-arr[i];
            weakStd=Math.max(rem,weakStd);
          }
          System.out.println(weakStd);
        }  
            
        }
}