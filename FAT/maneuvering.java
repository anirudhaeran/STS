package FAT;

import java.util.Scanner;

public class maneuvering {

    public static int numberOfpaths(int m,int n){
        if(m==1 || n==1)
        return 1;
        else
        return numberOfpaths(m-1, n)+numberOfpaths(m, n-1);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(numberOfpaths(m,n));
    }
}
