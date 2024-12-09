/*
5
12
[12, 0, 0, 0, 0]
34
[12, 34, 0, 0, 0]
22
[12, 34, 22, 0, 0]
54
[12, 34, 22, 54, 0]
98
[12, 34, 22, 54, 98]
*/
import java.util.*;
class implimentationofarray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr []=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.println(Arrays.toString(arr));
        }
    }
} 