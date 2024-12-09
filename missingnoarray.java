/*
4
1
3
4
5
2
*/
import java.util.*;
class missingnoarray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        int res=((n+1)*(n+2))/2;
        System.out.println(res-sum);
    }
}