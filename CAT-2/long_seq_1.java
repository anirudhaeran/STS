import java.util.Scanner;

public class long_seq_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String bs=Integer.toBinaryString(n);

        int cl=0,pl=0,ml=0;
        for(int i=0;i<bs.length();i++)
        {
            if(bs.charAt(i)=='1'){
                cl++;
            }
            else
            {
                ml=Math.max(ml,pl+cl+1);
                pl=cl;
                cl=0;
            }
        }
        ml=Math.max(ml,cl+pl+1);
        System.out.println(ml);
    }
}
