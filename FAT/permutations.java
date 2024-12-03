package FAT;

import java.util.Scanner;

public class permutations {

    public static void per(String s,int l,int r)
    {
        if(l==r)
        System.out.println(s);

        else{
            for(int i=l;i<=r;i++){
                s=swap(s,l,i);
                per(s,l+1,r);
                s=swap(s,l,i);
            }
        }
    }

    public static String swap(String s,int i,int j)
    {
        char a[]=s.toCharArray();
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return String.valueOf(a);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        per(s,0,n-1);
    }
}
