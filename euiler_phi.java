import java.util.Scanner;

public class euiler_phi {

    public static int gcd(int n1,int n2)
    {
        int n;
        if(n1>n2)
        n=n1;
        else
        n=n2;

        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(gcd(i,n)==1)
                System.out.print(i+" ");
        }
    }
}
