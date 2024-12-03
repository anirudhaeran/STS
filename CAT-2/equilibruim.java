import java.util.Scanner;

public class equilibruim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int sum[]=new int[n];
        int sum1=0;
        for(int i=0;i<n;i++)
        {
            sum1+=arr[i];
            sum[i]=sum1;
        }

        if(n==1)
        {
            System.out.println(arr[0]);
            return;
        }

        if(n>=3)
        {
        for(int i=1;i<n-1;i++)
        {
            int Lsum=sum[i]-arr[i];
            int Rsum=sum[n-1]-sum[i];

            if(Lsum==Rsum)
            {
                System.out.println(i);
                System.out.println(Lsum);
            }
        }
    }
}
}
