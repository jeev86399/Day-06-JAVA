/*
*
* *       
*   *     
*     *   
* * * * * 
*/
import java.util.*;
class hallowtraingle1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i==n-1 || j==i)
                    System.out.print("*"+" ");//for printting numbers use only j//
                else
                     System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}