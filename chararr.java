
import java.util.*;
public class chararr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char temp=arr[i];
            arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp; 
               }
               for(int i=0;i<arr.length;i++){

                System.out.println(arr[i]);
                   }
        String s=String.valueOf(arr);   `

        System.out.println(s);
    }
}
