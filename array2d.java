import java.util.*;
public class array2d {

    public static void spiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=startcol && startcol<=endcol){
            //top
           for(int j=startcol;j<endcol;j++){
            System.out.print(matrix[startrow][j]);

           }
           //right
           for(int i=startrow+1;i<endrow;i++){//sr+1 as 4 has already been printed
             System.out.print(matrix[i][endcol]);
           }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }

                System.out.print(matrix[endrow][j]);
            }
            //left
            for(int i=endrow-1;i>startrow+1;i++){
                if(startcol==endcol){
                    break;
                }

                System.out.print(matrix[i][startcol]);
            }


            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    System.out.println();

    }
    public static void smallest(int matrix[][]){
        int small=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<small){
                    small=matrix[i][j];
                }

            }
        }
        System.out.println(small + " is the smallest element in the matrix");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[4][4]}}
            //created matrix of 3*3
        //taking input of 2d array
        /*for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();

            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
       */ 
        //smallest(matrix);
        spiral(matrix);

    }
}
