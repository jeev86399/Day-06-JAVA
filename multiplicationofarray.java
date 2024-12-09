/*
5
2
3
4
5
6
720
*/
import java.util.*;
class multiplicationofarray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr []=new int[n];
        int m=1;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            m*=arr[i];
        }
        System.out.println(m);
    }
}