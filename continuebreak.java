/*
5
break examples
0
1
continue examples
0
1
3
4*/
import java.util.*;
class continuebreak {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("break examples");
        for(int i=0;i<n;i++)
        {
            if(i==2)
                break;
            System.out.println(i);
        }
        System.out.println("continue examples");
        for(int i=0;i<n;i++)
        {
            if(i==2)
                continue;
            System.out.println(i);
        }
    }
}