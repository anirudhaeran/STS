package FAT;

import java.util.Scanner;

public class Manechers {


    public static String longpal(String s)
    {
        int n=s.length();
        int ml=1;
        int si=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(checkpal(s,i,j) && (j-i+1)>ml){
                    ml=j-i+1;
                    si=i;
                }
            }
        }
        return s.substring(si, si+ml);
    }

    public static boolean checkpal(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(longpal(s));
    }
}
