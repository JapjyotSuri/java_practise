import java.util.*;

public class array1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int marks[]=new int[100];

 /* marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//math

        System.out.println("Marks of phy = "+ marks[0]);
        System.out.println("Marks of math = "+ marks[1]);


*/

      int len=marks.length;
      System.out.println("length of array  = "+ len);
    int num[] =new int[100];
    int n;
    n=sc.nextInt();

    for(int i=0;i<n;i++){
        num[i]=sc.nextInt();

    }

   for(int i=0;i<n;i++){
    System.out.print(num[i]+" ");
        }

    }
}
