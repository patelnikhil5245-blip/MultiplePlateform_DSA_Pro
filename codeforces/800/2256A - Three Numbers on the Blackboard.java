import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        while(t-->0){
            int a=m.nextInt();
            int b=m.nextInt();
            int c=m.nextInt();
            int arr[]={a,b,c};
            Arrays.sort(arr);
            if(arr[0]+arr[1]<=arr[2]){
              arr[2]=arr[0]+arr[1];  
            }
            System.out.println(arr[2]-arr[0]);
            
        }
    }
}