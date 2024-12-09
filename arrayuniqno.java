import java.util.*;
class arrayuniqno{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int arr []=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            a^=arr[i];
        }
        System.out.println(a);
    }
} 