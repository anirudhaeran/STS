package FAT;

import java.util.Scanner;

public class move_hyphen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String temp1="";
        String temp2="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='-')
            temp1+=ch;
            else
            temp2+=ch;
        }
        System.out.println(temp1.concat(temp2));
    }
}
