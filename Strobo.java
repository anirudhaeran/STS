import java.util.ArrayList;
import java.util.Scanner;

public class Strobo {

    public static char rotate(char ch)
    {
        if(ch=='1')
        return '1';
        else if(ch=='0')
        return '0';
        else if(ch=='8')
        return '8';
        else if(ch=='6')
        return '9';
        else
        return '6';
    }

    public static boolean strob(int n)
    {
        String s=Integer.toString(n);
        String rev_s="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='1'||ch=='0'||ch=='6'||ch=='8'||ch=='9'){
                rev_s+=rotate(ch);
            }
        }
        if(rev_s.equals(s))
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=(int)Math.pow(10, n-1);
        int end= (int)Math.pow(10, n);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=start;i<end;i++)
        {
            if(strob(i)==true)
            {System.out.print(i+" ");
            arr.add(i);}
        }
        System.out.println();
        System.out.println(arr.size());
    }
}
