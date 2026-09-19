import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner m=new Scanner(System.in);
            int t =m.nextInt();
            while(t-->0){
                int a=m.nextInt();
                int b=m.nextInt();
                int c=m.nextInt();
                
                int rem=0;
                while(true){
                    int arr[]={a,b,c};
                    Arrays.sort(arr);
                    if(arr[0]==arr[1]||arr[1]==arr[2]){
                        break;
                    }
                    arr[0]++;
                    arr[2]--;
                    
                    a=arr[0];
                    b=arr[1];
                    c=arr[2];
                    
                    rem++;
                }
                
            System.out.println(rem);
        }
    }
}