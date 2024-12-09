/*
5
23
56
98
00
12
189
*/
import java.util.*;
class additionofarray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr []=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}   