/*
* * * * * * * * * 
*
*
*
* * * * * * * * *
                *
                *
                *
* * * * * * * * *
*/
import java.util.*;
class patterns {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n%2)==0)
            n-=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2 || i==0 || i==n-1 )
                    System.out.print("*"+" ");//for printting numbers use only j//
                else if((i<n/2&&j==0)||(j==n-1&&i>n/2))
                    System.out.print("*"+" ");
                else
                     System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}