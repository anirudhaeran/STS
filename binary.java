import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String bs=Integer.toBinaryString(n);
        String new_bs="";
        for(int i=bs.length()-1;i>=0;i--)
        {
            char ch=bs.charAt(i);
            new_bs+=ch;   
        }
        if(new_bs.equals(bs))
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
