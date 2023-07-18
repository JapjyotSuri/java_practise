import java.util.*;
public class arraybasic {
    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
           int n=sc.nextInt();
           
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

           }
           System.out.println(s);
           System.out.println(n);
           for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
           }




    }
}
